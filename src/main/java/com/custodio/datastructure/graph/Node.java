package com.custodio.datastructure.graph;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import static java.util.Objects.requireNonNull;

class Node<T extends Comparable<T>> implements Comparable<Node<T>> {
    private final T value;
    private final Set<Node<T>> children;

    Node(@NotNull final T value) {
        this(value, new HashSet<>(0));
    }

    Node(@NotNull final T value, @NotNull final Set<Node<T>> children) {
        this.value = requireNonNull(value, "The value is mandatory.");
        this.children = requireNonNull(children, "The children are mandatory.");
    }

    void addChild(@NotNull final Node<T> child) {
        requireNonNull(child, "The child is mandatory");
        children.add(child);
    }

    @NotNull
    Set<Node<T>> getChildren() {
        return new HashSet<>(children);
    }

    @NotNull
    public T getValue() {
        return value;
    }

    @Override
    public int compareTo(@NotNull final Node<T> otherNode) {
        return value.compareTo(otherNode.value);
    }

    @Override
    public boolean equals(final Object other) {
        if (other instanceof Node) {
            final var otherNode = (Node) other;
            return compareTo(otherNode) == 0;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
