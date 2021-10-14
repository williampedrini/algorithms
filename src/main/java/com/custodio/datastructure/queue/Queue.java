package com.custodio.datastructure.queue;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static java.util.Objects.requireNonNull;
import static java.util.Optional.ofNullable;

class Queue<T> {
    private Node<T> head;
    private Node<T> tail;

    /**
     * Verifies whether the current {@link Queue} is empty or not.
     *
     * @return {@code true}: The current {@link Queue} is empty.
     * {@code false}: The current {@link Queue} is not empty.
     */
    boolean isEmpty() {
        return head == null && tail == null;
    }

    /**
     * Adds a value to the tail of the current {@link Queue}.
     *
     * @param value The value to be added to the {@link Queue}.
     * @return The current {@link Queue} with the new value added to that.
     */
    @NotNull
    Queue<T> add(@NotNull final T value) {
        requireNonNull(value, "The value to be inserted is mandatory.");
        if (head == null) {
            head = new Node<>(value, null);
            return this;
        }
        if (tail == null) {
            tail = new Node<>(value, null);
        } else {
            final var newNode = new Node<>(value, null);
            tail.next = newNode;
            tail = newNode;
        }
        return this;
    }

    /**
     * Returns the current tail's element from the stack without removing it from this queue.
     *
     * @return The tail's element from the queue.
     */
    @NotNull
    T peek() {
        return ofNullable(head)
                       .map(Node::getData)
                       .orElseThrow(() -> new IllegalStateException("The queue does not have any elements."));
    }

    /**
     * Returns the data from the current queue's tail and removes the element from it.
     *
     * @return The tail's element from the queue.
     */
    @NotNull
    T remove() {
        final var currentHeadValue = ofNullable(head)
                                             .map(Node::getData)
                                             .orElseThrow(() -> new IllegalStateException("The queue does not have any elements."));
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return currentHeadValue;
    }

    private static final class Node<T> {
        private final T data;
        private Node<T> next;

        private Node(@NotNull final T data, @Nullable final Node<T> next) {
            this.data = requireNonNull(data, "The data to be inserted is mandatory.");
            this.next = next;
        }

        @NotNull
        private T getData() {
            return data;
        }
    }
}
