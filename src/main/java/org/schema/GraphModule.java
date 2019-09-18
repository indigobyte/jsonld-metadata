package org.schema;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class GraphModule extends SimpleModule {
    public GraphModule() {
        super("Graph Module", new Version(1, 0, 0, null, null, null));
        addDeserializer(Graph.class, new GraphDeserializer());
    }
}
