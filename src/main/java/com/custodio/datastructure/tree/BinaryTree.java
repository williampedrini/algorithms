package com.custodio.datastructure.tree;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;

import static com.custodio.datastructure.tree.BinaryTree.BinaryTreeTraversalAlgorithm.IN_ORDER;
import static com.custodio.datastructure.tree.BinaryTree.BinaryTreeTraversalAlgorithm.POST_ORDER;
import static com.custodio.datastructure.tree.BinaryTree.BinaryTreeTraversalAlgorithm.PRE_ORDER;
import static java.util.Objects.requireNonNull;
import static java.util.Optional.ofNullable;

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
        requireNonNull(data, "The data is mandatory");
        insert(rootNode, data);
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
        requireNonNull(algorithm, "The traversal algorithm is mandatory");
        return ofNullable(traversalAlgorithms.get(algorithm))
                       .orElseThrow(() -> new IllegalArgumentException("The algorithm is not supported."))
                       .getNodes();
    }

    @NotNull
    TreeNode<T> getRootNode() {
        return rootNode;
    }

    boolean isValid(final T lower, final T upper) {
        return isValid(rootNode, lower, upper);
    }

    private boolean isValid(final TreeNode<T> node, final T lower, final T upper) {
        // Firstly, the current value must be between the lower and upper to be considered valid.
        if (node.getData().compareTo(lower) > 0 && node.getData().compareTo(upper) < 0) {
            // The left node must be validated against the current lower and must be lower than the current node value, since the current node is its parent.
            final var isLeftValid = node.getLeft().isEmpty() || isValid(node.getLeft().get(), lower, node.getData());

            // The right node must be validated against the current upper and must be higher than the current node value, since the current node is its parent.
            final var isRightValid = node.getRight().isEmpty() || isValid(node.getRight().get(), node.getData(), upper);

            return isLeftValid && isRightValid;
        }
        return false;
    }

    private void insert(final TreeNode<T> root, final T data) {
        if (data.compareTo(root.getData()) <= 0) {
            if (root.getLeft().isPresent()) {
                insert(root.getLeft().get(), data);
            } else {
                root.setLeft(new TreeNode<>(data));
            }
        } else {
            if (root.getRight().isPresent()) {
                insert(root.getRight().get(), data);
            } else {
                root.setRight(new TreeNode<>(data));
            }
        }
    }

    enum BinaryTreeTraversalAlgorithm {
        IN_ORDER,
        PRE_ORDER,
        POST_ORDER
    }
}
