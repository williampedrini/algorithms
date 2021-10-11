package com.custodio.datastructure.graph;

import org.jetbrains.annotations.NotNull;

/**
 * Represents a certain search algorithm for a graph.
 *
 * @param <T> The type os the node value.
 */
interface GraphSearch<T extends Comparable<T>> {

    /**
     * Verifies whether a graph contains a certain target value using a certain approach.
     *
     * @param graph  The graph used to perform the search.
     * @param target The target value used as base for the validation.
     * @return {@code true}: If the graph contains the value.
     * {@code false}: If the graph does not contain the value.
     */
    boolean hasPath(@NotNull Graph<T> graph, @NotNull T target);
}
