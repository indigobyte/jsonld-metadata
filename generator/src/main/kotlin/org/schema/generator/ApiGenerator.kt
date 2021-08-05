package org.schema.generator
import org.schema.generator.helper.sanitizeIdentifier
import org.apache.commons.text.StringEscapeUtils

/**
 * @author Victor Kropp
 */

class ApiGenerator(private val sink: GeneratorSink, private val banner: String? = null) {
    fun generate(p: Package) {
        p.writeClass("SchemaOrg") {
            appendLine(banner)
            appendLine()
            appendLine("package ${p.name};")
            appendLine()
            appendLine("import java.util.HashMap;")
            appendLine("import com.fasterxml.jackson.core.JsonProcessingException;")
            appendLine("import com.fasterxml.jackson.databind.JsonNode;")
            appendLine("import com.fasterxml.jackson.databind.ObjectMapper;")
            appendLine("import org.jetbrains.annotations.NotNull;")
            appendLine()
            appendLine("public class SchemaOrg {")

            for (type in sink.types.values) {
                if (type.name.isNullOrEmpty() || type.isField || type.isInterface || sink.shouldSkip(type.name!!) || (type.parentType == null && type.name != "Thing" && !type.isInterface))
                    continue
                if (type.isEnum || type.name == "http://schema.org/Enumeration" || (type.parentType?.let { sink.types[it] }?.isEnum == true)) continue

                val typeName = sanitizeIdentifier(type.name!!.capitalize())

                type.comment?.let {
                    appendLine("  /**")
                    appendLine("   * ${StringEscapeUtils.escapeHtml4(it)}")
                    appendLine("   */")
                }
                appendLine("  @NotNull public static $typeName.Builder ${typeName.decapitalize()}() { return new $typeName.Builder(new HashMap<String,Object>()); }")
            }
            appendLine()
            appendLine("  public static ThingBuilder getBuilder(@NotNull String type) {")
            for (type in sink.types.values) {
                if (type.name.isNullOrEmpty() || type.isField || type.isInterface || type.isEnum || sink.shouldSkip(type.name!!) || (type.parentType == null && type.name != "Thing" && !type.isInterface && !type.isEnum))
                    continue
                if (type.isEnum || type.name == "http://schema.org/Enumeration" || (type.parentType?.let { sink.types[it] }?.isEnum == true)) continue

                val typeName = sanitizeIdentifier(type.name!!.capitalize())

                appendLine("    if (\"$typeName\".equals(type)) { return new $typeName.Builder(new HashMap<String,Object>()); }")
            }
            appendLine("    return null;")
            appendLine("  }")
            appendLine()
            appendLine("  private static final ObjectMapper objectMapper = new ObjectMapper();")
            appendLine("  static {")
            appendLine("    objectMapper.registerModule(new JsonLdModule());")
            appendLine("  }")
            appendLine("  @NotNull public static String writeJson(@NotNull Thing thing) throws JsonProcessingException {")
            appendLine("    return objectMapper.writeValueAsString(thing);")
            appendLine("  }")
            appendLine("  public static Thing readJson(@NotNull String json) throws java.io.IOException {")
            appendLine("    return objectMapper.readValue(json, Thing.class);")
            appendLine("  }")
            appendLine("  public static Thing readJson(@NotNull JsonNode node) {")
            appendLine("    return ThingDeserializer.fromMap(objectMapper.convertValue(node, java.util.Map.class));")
            appendLine("  }")
            appendLine("  public static Thing fromMap(@NotNull java.util.Map<String, Object> map) {")
            appendLine("    return ThingDeserializer.fromMap(map);")
            appendLine("  }")
            appendLine("  public static java.util.Map<String, Object> toMap(@NotNull Thing thing) {")
            appendLine("    final HashMap<String, Object> result = new HashMap<String, Object>();")
            appendLine("    if (thing.getId() != null) {")
            appendLine("      result.put(\"@id\", thing.getId());")
            appendLine("    }")
            appendLine("    result.put(\"@type\", thing.getJsonLdType());")
            appendLine("    result.put(\"@context\", thing.getJsonLdContext());")
            appendLine("    for (java.util.Map.Entry<String, Object> entry : thing.myData.entrySet()) {")
            appendLine("    if (entry.getValue() instanceof Thing) {")
            appendLine("        result.put(entry.getKey(), toMap((Thing) entry.getValue()));")
            appendLine("      } else if (entry.getValue() instanceof java.util.List) {")
            appendLine("        final java.util.ArrayList<Object> list = new java.util.ArrayList<Object>();")
            appendLine("        for (Object o : ((java.util.List) entry.getValue())) {")
            appendLine("          if (o instanceof Thing) {")
            appendLine("            list.add(toMap((Thing) o));")
            appendLine("          } else {")
            appendLine("            list.add(o);")
            appendLine("          }")
            appendLine("        }")
            appendLine("        result.put(entry.getKey(), list);")
            appendLine("      } else if (entry.getValue() instanceof java.util.Date) {")
            appendLine("        result.put(entry.getKey(), ThingDeserializer.dateFormat.format(entry.getValue()));")
            appendLine("      } else {")
            appendLine("        result.put(entry.getKey(), entry.getValue());")
            appendLine("      }")
            appendLine("    }")
            appendLine("    return result;")
            appendLine("  }")
            appendLine("}")
        }

        p.writeClass("ThingBuilder", """$banner

package ${p.name};

public interface ThingBuilder<T> {
  void fromMap(java.util.Map<String,Object> map);
  T build();
}""")
        p.writeClass("JsonLdModule", """$banner

package ${p.name};

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JsonLdModule extends SimpleModule {
    public JsonLdModule() {
        super("JsonLD Module", new Version(1, 0, 0, null, null, null));
        addDeserializer(Thing.class, new ThingDeserializer());
        addSerializer(Date.class, new DateSerializer());
    }
    private static class DateSerializer extends JsonSerializer<Date> {
        private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXX");
        @Override
        public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            gen.writeString(DATE_FORMAT.format(value));
        }
    }
}""")
        p.writeClass("ThingDeserializer", """$banner

package ${p.name};

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import org.jetbrains.annotations.Nullable;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;

import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;
import java.text.*;

/**
 * Typed deserializer for {@link org.schema.Thing}
 */
class ThingDeserializer extends JsonDeserializer<Thing> {
    static final DateFormat dateFormat = new ISO8601DateFormat();

    @Override
    public Thing deserialize(JsonParser p, DeserializationContext ctx) throws IOException {
        return fromMap(p.<HashMap<String, Object>>readValueAs(new TypeReference<HashMap<String, Object>>() {
        }));
    }

    @Nullable
    static Thing fromMap(Map<String, Object> result, String context) {
        if (!context.matches("https?://schema.org.*")) {
            return null;
        }

        final Object type = result.get("@type");
        if (type == null || !(type instanceof String)) {
            return null;
        }

        final ThingBuilder builder = SchemaOrg.getBuilder((String) type);
        if (builder == null) {
            return null;
        }

        for (Map.Entry<String, Object> entry : result.entrySet()) {
            if (entry.getValue() instanceof String) {
                try {
                    final Date date = dateFormat.parse((String) entry.getValue());
                    result.put(entry.getKey(), date);
                } catch (ParseException ignored) {
                }
            }
        }

        builder.fromMap(result);
        return (Thing) builder.build();
        
    }

    @Nullable
    static Thing fromMap(Map<String, Object> result) {
        final Object context = result.get("@context");
        if (context == null) return null;
        
        return fromMap(result, (String)context);
    }
}""")
    }
}
