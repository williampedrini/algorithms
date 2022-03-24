package com.custodio.datastructure.tree;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;

import static com.custodio.datastructure.tree.BinaryTree.BinaryTreeTraversalAlgorithm.*;
import static java.util.Objects.requireNonNull;

class BinaryTree<T extends Comparable<T>> {
    private final TreeNode<T> rootNode;
    private final Map<BinaryTreeTraversalAlgorithm, TraversalAlgorithm<T>> traversalAlgorithms;

    BinaryTree(@NotNull final T rootNode) {
        this(new TreeNode<>(rootNode));
    }

    BinaryTree(@NotNull final TreeNode<T> rootNode) {
        this.rootNode = requireNonNull(rootNode, "The root node is mandatory.");
        traversalAlgorithms = new EnumMap<>(BinaryTreeTraversalAlgorithm.class);
        traversalAlgorithms.put(IN_ORDER, new InOrderTraversalAlgorithm<>(this));
        traversalAlgorithms.put(PRE_ORDER, new PreOrderTraversalAlgorithm<>(this));
        traversalAlgorithms.put(POST_ORDER, new PostOrderTraversalAlgorithm<>(this));
    }

    /**
     * Insert a certain data into the tree.
     *
     * @param data The data to be inserted into the tree.
     * @return The binary tree containing the new value.
     */
    @NotNull
    BinaryTree<T> insert(@NotNull final T data) {
        //TODO: Implement
        return this;
    }

    /**
     * Get all the nodes from the tree where the order is defined by a {@link TraversalAlgorithm}.
     *
     * @param algorithm The algorithm used to define the order.
     * @return The found nodes ordered by the defined algorithm.
     */
    @NotNull
    Collection<T> getNodes(@NotNull final BinaryTreeTraversalAlgorithm algorithm) {
        //TODO: Implement
        return null;
    }

    @NotNull
    TreeNode<T> getRootNode() {
        return rootNode;
    }

    boolean isValid(final T lower, final T upper) {
        //TODO: Implement
        return false;
    }

    enum BinaryTreeTraversalAlgorithm {
        IN_ORDER,
        PRE_ORDER,
        POST_ORDER
    }
}
