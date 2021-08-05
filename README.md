java-jsonld-mappings
====================

Library provides easy to use Java classes and builders for [schema.org](http://schema.org/) entities.

All classes are auto generated from schema.rdfa

Example usage:
```
import static org.schema.SchemaOrg.*;

final Article article = SchemaOrg.article() // with static import you can skip `SchemaOrg.`, left here for clarity
        .name("88th Oscars ceremony will be held on February 28th")
        .text("Lorem ipsum")
        .author(nGO().name("The Academy of Motion Picture Arts and Sciences").build())
        .comment(
                // note that you may provide Builder instead of object where it is unambiguous
                comment().text("Hooray!").author(person().name("Max Mustermann"))
        ).build();
```

Than one can serialize it to JSON with __Jackson__ as follows:
```
final ObjectMapper objectMapper = new ObjectMapper();
objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
objectMapper.writeValue(System.out, event);
```

# Updating schema.org schema

- Find schema.org schema.
- Convert it to RDFa format.
- Replace file `generator/resources/schema.rdfa`.
- Run `generator/src/main/kotlin/org/schema/generator/generator.kt`'s main function. 
Must set working directory to `generator` before running.

# Building new version
- Update `version` inside `gradle.properties` file.
- Build this via `gradle clean build`
- Checkout `mvn-repo` branch of this repository into separate folder.
- Create `build/mvnRepo` folder.
- Put contents of `mvn-repo` branch of this git repository into `build/mvnRepo` folder.
As the result, you'll get `build/mvnRepo/com/indigobyte` folder.
- Run `gradle :publishJsonLdMetadataPublicationPublicationToMvnRepoRepository`
- Commit and push `build/mvnRepo` folder to `mvn-repo` git branch.
