package com.custodio.datastructure.graph;

import org.jetbrains.annotations.NotNull;

final class BreadthFirstSearch<T extends Comparable<T>> implements GraphSearch<T> {

    /**
     * Verifies whether a graph contains a certain target value using the DFS approach.
     *
     * @param graph  The graph used to perform the search.
     * @param target The target value used as base for the validation.
     * @return {@code true}: If the graph contains the value.
     * {@code false}: If the graph does not contain the value.
     */
    @Override
    public boolean hasPath(@NotNull final Graph<T> graph, @NotNull final T target) {
        //TODO: Implement
        return false;
    }
}
