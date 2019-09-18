package org.schema;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class GraphTest {

    @Test
    public void TestLoadingGraph() throws URISyntaxException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JsonLdModule());
        mapper.registerModule(new GraphModule());

        String json = new String(Files.readAllBytes(Paths.get(getClass().getClassLoader().getResource("graph.json").toURI())));
        Graph g = mapper.readValue(json, Graph.class);
        assertEquals(3, g.things.stream().filter(t -> t != null).count());

        final Optional<Thing> first = g.things.stream().filter(t -> t instanceof Recipe).findFirst();
        assertEquals(true, first.isPresent());
    }
}
