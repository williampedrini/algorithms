package com.custodio.datastructure.tree;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;

import static java.util.Objects.requireNonNull;

class PostOrderTraversalAlgorithm<T extends Comparable<T>> implements TraversalAlgorithm<T> {
    private final BinaryTree<T> tree;

    PostOrderTraversalAlgorithm(@NotNull final BinaryTree<T> tree) {
        this.tree = requireNonNull(tree, "The tree is mandatory.");
    }

    @NotNull
    @Override
    public Collection<T> getNodes() {
        //TODO: Implement getNode.
        return null;
    }
}
