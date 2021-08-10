package org.schema;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphDeserializer extends JsonDeserializer<Graph> {

    @Override
    public Graph deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        return fromMap(p.<HashMap<String, Object>>readValueAs(new TypeReference<HashMap<String, Object>>() {
        }));

    }

    @Nullable
    static Graph fromMap(Map<String, Object> result) {
        final java.lang.Object type = result.get("@graph");
        if (type == null || !(type instanceof List)) {
            return null;
        }
        
        Graph g = new Graph();
        
        final java.lang.Object context = result.get("@context");
        if (context != null && (context instanceof String)) {
            g.context = (String)context;
        }

        
        for (java.util.Map<String, java.lang.Object> t: (List<java.util.Map<String, java.lang.Object>>) type) {
            if (g.context != null) {
                g.things.add(ThingDeserializer.fromMap(t, g.context));
            } else {
                g.things.add(ThingDeserializer.fromMap(t));
            }
        }

        return g;
    }

}
