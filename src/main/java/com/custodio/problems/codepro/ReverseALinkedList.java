package com.custodio.problems.codepro;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

import static java.util.Objects.nonNull;
import static java.util.Objects.requireNonNull;

/**
 * @see <a href="https://www.techseries.dev/products/coderpro/categories/1831147/posts/6228782">Tech Series</a>
 * <p>
 * Given a certain linked list, reverse its order.
 * <p>
 * E.g: WHEN 1 -> 2 -> 3 -> 4 -> 5 THEN return 5 -> 4 -> 3 -> 2 -> 1
 */
final class ReverseALinkedList {

    @NotNull
    static Node solution(@NotNull final Node root) {
        requireNonNull(root, "The root is mandatory.");
        var currentNode = root;
        var previousNode = (Node) null;
        var temporaryNode = (Node) null;

        while (nonNull(currentNode)) {
            temporaryNode = currentNode.getNext(); //Need to save the next, since the current next will point the previous and we would lose the next value.
            currentNode.setNext(previousNode); // Reversing the point to the previous node.
            previousNode = currentNode; // The previous node need to point to the current before moving to the next node.
            currentNode = temporaryNode; // The current node will be moved to the temporary node, which is a pointer to the old next value.
        }

        return previousNode;
    }

    @NotNull
    static String toString(@NotNull final Node root) {
        final var stringBuilder = new StringBuilder(0);
        for (var currentNode = root; nonNull(currentNode); currentNode = currentNode.getNext()) {
            stringBuilder.append(currentNode.value);
        }
        return stringBuilder.toString();
    }

    static class Node {
        private final int value;
        private Node next;

        Node(final int value) {
            this(value, null);
        }

        Node(final int value, @Nullable final Node next) {
            this.value = value;
            this.next = next;
        }

        private static void toString(final StringBuilder stringBuilder, final Node root) {
            if (root == null) {
                return;
            }
            stringBuilder.append(root.value);
        }

        int getValue() {
            return value;
        }

        @Nullable
        Node getNext() {
            return next;
        }

        void setNext(@Nullable final Node next) {
            this.next = next;
        }

        @Override
        public boolean equals(final Object other) {
            if (other instanceof Node) {
                final var otherNode = (Node) other;
                return toString().equals(otherNode.toString());
            }
            return false;
        }

        @NotNull
        @Override
        public String toString() {
            final var toStringBuilder = new StringBuilder(0);
            toString(toStringBuilder, this);
            return toStringBuilder.toString();
        }

        @Override
        public int hashCode() {
            return Objects.hash(value);
        }
    }
}
