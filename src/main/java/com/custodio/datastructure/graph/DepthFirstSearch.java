package com.custodio.datastructure.graph;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static java.util.Objects.requireNonNull;
import static java.util.Optional.empty;
import static java.util.Optional.of;

final class DepthFirstSearch<T extends Comparable<T>> implements GraphSearch<T> {

    private static <T extends Comparable<T>> Optional<Node<T>> getNodeByTarget(final Node<T> root,
                                                                               final Set<Node<T>> visitedNodes,
                                                                               final T target) {
        visitedNodes.add(root); //Adding the node as visited to avoid cycles.
        if (root.compareTo(new Node<>(target)) == 0) {
            return of(root);
        }
        for (final var child : root.getChildren()) {
            if(visitedNodes.contains(child)) {
                continue;
            }
            final var possibleNode = getNodeByTarget(child, visitedNodes, target);
            if (possibleNode.isPresent()) {
                return possibleNode;
            }
        }
        return empty();
    }

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
        requireNonNull(graph, "The graph is mandatory.");
        requireNonNull(target, "The target is mandatory.");
        final var visitedNodes = new HashSet<Node<T>>(0);
        return getNodeByTarget(graph.getRoot(), visitedNodes, target).isPresent();
    }
}
