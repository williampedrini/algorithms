package com.custodio.problems.hackerrank;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static java.util.Objects.requireNonNull;
import static java.util.Optional.ofNullable;

class AddTwoNumbersWithLinkedList {

    static Node solution(final Node l1, final Node l2) {
        return solution(l1, l2, 0);
    }

    static Node solution(final Node l1, final Node l2, final Integer carryOver) {
        final var newValue = l1.getValue() + l2.getValue() + carryOver;
        final var result = new Node(newValue % 10);

        if (l1.getNext() == null && l2.getNext() == null) {
            return result; //The result from the mod will be the leftover.
        }

        //This part must be done to make the lists with the same size to facilitate the account.
        final var normalizedL1Next = ofNullable(l1.getNext()).orElse(new Node(0));
        l1.setNext(normalizedL1Next);

        final var normalizedL2Next = ofNullable(l2.getNext()).orElse(new Node(0));
        l2.setNext(normalizedL1Next);

        final var newCarryOver = newValue / 10;  //We get the leftover to be send as carry over.
        result.setNext(solution(normalizedL1Next, normalizedL2Next, newCarryOver));
        return result;
    }

    static class Node {
        private final Integer value;
        private Node next;

        Node(Integer value) {
            this(value, null);
        }

        Node(@NotNull final Integer value, @Nullable final Node next) {
            this.value = requireNonNull(value, "The value is mandatory.");
            this.next = next;
        }

        @NotNull
        public Integer getValue() {
            return value;
        }

        @Nullable
        public Node getNext() {
            return next;
        }

        public void setNext(@NotNull final Node next) {
            this.next = next;
        }

        @Override
        public boolean equals(final Object other) {
            if (other instanceof Node) {
                final var otherNode = (Node) other;
                return equals(this, otherNode);
            }
            return false;
        }

        private static boolean equals(final Node node, final Node otherNode) {
            if (node.next != null && otherNode.next != null) {
                return node.value.equals(otherNode.value) && equals(node.next, otherNode.next);
            }
            if (node.next == null && otherNode.next == null) {
                return node.value.equals(otherNode.value);
            }
            return false;
        }
    }
}
