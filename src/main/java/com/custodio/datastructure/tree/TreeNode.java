package com.custodio.datastructure.tree;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

import static java.util.Objects.requireNonNull;
import static java.util.Optional.ofNullable;

class TreeNode<T extends Comparable<T>> {
    private final T data;
    private TreeNode<T> left;
    private TreeNode<T> right;

    TreeNode(final T data) {
        this(data, null, null);
    }

    TreeNode(final T data,
             @Nullable final TreeNode<T> left,
             @Nullable final TreeNode<T> right) {
        requireNonNull(data, "The data is mandatory");
        this.data = data;
        this.left = left;
        this.right = right;
    }

    T getData() {
        return data;
    }

    @NotNull
    Optional<TreeNode<T>> getLeft() {
        return ofNullable(left);
    }

    void setLeft(@NotNull final TreeNode<T> left) {
        requireNonNull(left, "The node is mandatory.");
        this.left = left;
    }

    @NotNull
    Optional<TreeNode<T>> getRight() {
        return ofNullable(right);
    }

    void setRight(@NotNull final TreeNode<T> right) {
        requireNonNull(right, "The node is mandatory.");
        this.right = right;
    }
}
