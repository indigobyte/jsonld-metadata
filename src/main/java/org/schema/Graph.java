package org.schema;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    @JsonIgnore public List<Thing> things = new ArrayList<>();
}
