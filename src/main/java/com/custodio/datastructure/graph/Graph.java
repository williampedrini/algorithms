package com.custodio.datastructure.graph;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

class Graph<T extends Comparable<T>> {
    private Node<T> root;
    private Set<Node<T>> nodes;

    Graph(@NotNull final T root) {
        //TODO: Implement
    }

    @NotNull
    @SafeVarargs
    final Graph<T> add(@NotNull final T source, @NotNull final T... targets) {
        //TODO: Implement
        return this;
    }

    @NotNull Node<T> getRoot() {
        return root;
    }

    @NotNull Set<Node<T>> getNodes() {
        return new HashSet<>(nodes);
    }
}
