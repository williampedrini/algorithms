package com.custodio.datastructure.graph;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DepthFirstSearchTest {

    @Test
    public void when_ThereIsAMatchForValueInGraph_Then_ReturnTrueForHasPath() {
        //given
        final var graph = new Graph<>("S")
                                  .add("S", "A", "B")
                                  .add("A", "C", "D", "E")
                                  .add("B", "T");
        //when
        final var hasNodeWithValue = new DepthFirstSearch<String>().hasPath(graph, "T");
        //then
        assertTrue(hasNodeWithValue);
    }

    @Test
    public void when_ThereIsAMatchForValueInGraph_And_IsCyclicGraph_Then_ReturnTrueForHasPath() {
        //given
        final var graph = new Graph<>("S")
                                  .add("S", "A", "B", "C")
                                  .add("A", "B")
                                  .add("B", "D")
                                  .add("B", "S") //cycle S->B->S
                                  .add("C", "D")
                                  .add("D", "E", "F")
                                  .add("F", "T");
        //when
        final var hasNodeWithValue = new DepthFirstSearch<String>().hasPath(graph, "T");
        //then
        assertTrue(hasNodeWithValue);
    }
}
