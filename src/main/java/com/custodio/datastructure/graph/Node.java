package com.custodio.datastructure.graph;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

class Node<T extends Comparable<T>> implements Comparable<Node<T>> {
    private T value;
    private Set<Node<T>> children;

    Node(@NotNull final T value) {
        this(value, new HashSet<>(0));
    }

    Node(@NotNull final T value, @NotNull final Set<Node<T>> children) {
        //TODO: Implement
    }

    void addChild(@NotNull final Node<T> child) {
        //TODO: Implement
    }

    @NotNull
    Set<Node<T>> getChildren() {
        //TODO: Implement
        return null;
    }

    @NotNull
    public T getValue() {
        //TODO: Implement
        return null;
    }

    @Override
    public int compareTo(@NotNull final Node<T> otherNode) {
        //TODO: Implement
        return 0;
    }

    @Override
    public boolean equals(final Object other) {
        //TODO: Implement
        return false;
    }

    @Override
    public int hashCode() {
        //TODO: Implement
        return 0;
    }
}
