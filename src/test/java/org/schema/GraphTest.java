package org.schema;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import static org.junit.Assert.assertEquals;

public class GraphTest {

    @Test
    public void TestLoadingGraph() throws URISyntaxException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JsonLdModule());

        String json = new String(Files.readAllBytes(Paths.get(getClass().getClassLoader().getResource("graph.json").toURI())));
        Graph g = mapper.readValue(json, Graph.class);
        assertEquals(g.things.size(), 2);
    }
}
