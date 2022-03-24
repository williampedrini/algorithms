package com.custodio.datastructure.graph;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static java.util.Objects.requireNonNull;
import static java.util.Optional.empty;
import static java.util.Optional.of;

final class DepthFirstSearch<T extends Comparable<T>> implements GraphSearch<T> {

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
