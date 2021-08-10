java-jsonld-mappings
====================

Library provides easy to use Java classes and builders for [schema.org](http://schema.org/) entities.

All classes are auto generated from schemaorg-all-http.rdf (HTTPS version doesn't work)

# Usage

## Include Maven dependency

```xml
<repository>
    <id>jsonld-metadata</id>
    <url>https://raw.github.com/indigobyte/jsonld-metadata/mvn-repo/</url>
    <snapshots>
        <enabled>true</enabled>
    </snapshots>
</repository>

<properties>
    <jsonld-metadata.version>1.0.1</jsonld-metadata.version>
</properties>

<dependencies>
    <dependency>
        <groupId>com.indigobyte</groupId>
        <artifactId>jsonld-metadata</artifactId>
        <version>${jsonld-metadata.version}</version>
    </dependency>
</dependencies>
```

## Use in Java code

```java
import static org.schema.SchemaOrg.*;

final Article article = SchemaOrg.article() // with static import you can skip `SchemaOrg.`, left here for clarity
        .name("88th Oscars ceremony will be held on February 28th")
        .text("Lorem ipsum")
        .author(nGO()
                   .name("The Academy of Motion Picture Arts and Sciences")
                   .build()
        )
        .comment(
                // note that you may provide Builder instead of object where it is unambiguous
                comment()
                .text("Hooray!")
                .author(
                    person()
                        .name("Max Mustermann")
                )
        ).build();
```

## Generate JSON-LD script

Create `<script type="application/ld+json">` snippet with __Jackson__ like this:
```java
@NotNull
public static String getJsonLdScript(@NotNull Thing thing) {
    final ObjectMapper mapper = new ObjectMapper();
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    mapper.getFactory().setCharacterEscapes(new HTMLCharacterEscapes());
    mapper.getFactory().configure(JsonGenerator.Feature.ESCAPE_NON_ASCII, true);
    // Taken from https://www.baeldung.com/jackson-serialize-dates#iso-8601
    mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    // StdDateFormat is ISO8601 since jackson 2.9
    mapper.setDateFormat(new StdDateFormat().withColonInTimeZone(true));
    try {
        try (var writer = new StringWriter()) {
            mapper.writeValue(writer, thing);
            return "<script type=\"application/ld+json\">\n" +
                writer +
                "\n</script>\n";
        }
    } catch (Throwable e) {
        log.error(() -> "Error serializing " + thing, e);
        return "";
    }
}
```
## Editing JSON-LD builder

You can edit (and remove) properties of the builder that were set previously:
```java
final Event.Builder eventBuilder = SchemaOrg.event();
// Let's say that location was added previously
eventBuilder.location(SchemaOrg.place().name("White House").build());
// Now we want to add country and city to this location
final Place.Builder placeBuilder;
if (eventBuilder.getLocation() instanceof Place place) {
    placeBuilder = place.toBuilder(); // If it was already set, then create placeBuilder from existing data
} else {
    placeBuilder = SchemaOrg.place(); // Otherwise create a new placeBuilder instance
}
// Now set the address
placeBuilder.address(SchemaOrg.postalAddress()
    .addressCountry("USA")
    .addressLocality("Washington, DC")
    .build()
);
eventBuilder.removeLocation() // Remove location without address, the one specified previously. If you don't remove it, then eventBuilder will have multiple locations
    .location(placeBuilder.build()); // Set new location, the one with address.

```

# Updating schema.org schema

- Find schema.org schema in RDF format. **It must be HTTP schema, not HTTPS!**. You can find it at 
[GitHub](https://github.com/schemaorg/schemaorg/tree/main/data/releases). Take "all" schema instead of "current" since
"current" one uses definitions from "all", and there will be "not found/undefined" errors when using "current" schema instead of 
"all".
- Replace file `generator/resources/schemaorg-all-http.rdf` with the new version.
- Delete `src/generated` and `src/generated-test` folders.
- Run `generator/src/main/kotlin/org/schema/generator/generator.kt`'s main function. 
Must set working directory to `generator` before running. Generated files will be placed in `src/generated` and 
`src/generated-test`.

# Building new version

- Update `version` inside `gradle.properties` file.
- Build this via `gradle clean build`
- Checkout `mvn-repo` branch of this repository into separate folder.
- Create `build/mvnRepo` folder.
- Put contents of `mvn-repo` branch of this git repository into `build/mvnRepo` folder.
As the result, you'll get `build/mvnRepo/com/indigobyte` folder.
- Run `gradle :publishJsonLdMetadataPublicationPublicationToMvnRepoRepository`
- Commit and push `build/mvnRepo` folder to `mvn-repo` git branch.
