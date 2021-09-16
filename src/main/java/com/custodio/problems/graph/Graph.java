package com.custodio.problems.graph;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

import static java.util.Objects.requireNonNull;

class Graph<T extends Comparable<T>> {
    private final Node<T> root;
    private final Set<Node<T>> nodes;

    Graph(@NotNull final T root) {
        this.root = new Node<>(root);
        nodes = new HashSet<>(0);
        nodes.add(this.root);
    }

    @NotNull
    @SafeVarargs
    final Graph<T> add(@NotNull final T source, @NotNull final T... targets) {
        requireNonNull(source, "The source is mandatory");
        requireNonNull(targets, "The target are mandatory");
        final var sourceNode = nodes.stream()
                                       .filter(node -> node.getValue().equals(source))
                                       .findAny()
                                       .orElseGet(() -> {
                                           final var node = new Node<>(source);
                                           nodes.add(node);
                                           return node;
                                       });
        for (final var target : targets) {
            final var targetNode = nodes.stream()
                                           .filter(node -> node.getValue().equals(target))
                                           .findAny()
                                           .orElseGet(() -> {
                                               final var node = new Node<>(target);
                                               nodes.add(node);
                                               return node;
                                           });
            sourceNode.addChild(targetNode);
        }

        return this;
    }

    @NotNull
    Node<T> getRoot() {
        return root;
    }

    @NotNull
    Set<Node<T>> getNodes() {
        return new HashSet<>(nodes);
    }
}
