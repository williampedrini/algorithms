package com.custodio.datastructure.queue;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static java.util.Objects.requireNonNull;

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
        //TODO: Implement
        return true;
    }

    /**
     * Adds a value to the tail of the current {@link Queue}.
     *
     * @param value The value to be added to the {@link Queue}.
     * @return The current {@link Queue} with the new value added to that.
     */
    @NotNull
    Queue<T> add(@NotNull final T value) {
        //TODO: Implement
        return this;
    }

    /**
     * Returns the current tail's element from the stack without removing it from this queue.
     *
     * @return The tail's element from the queue.
     */
    @NotNull
    T peek() {
        //TODO: Implement
        return null;
    }

    /**
     * Returns the data from the current queue's tail and removes the element from it.
     *
     * @return The tail's element from the queue.
     */
    @NotNull
    T remove() {
        //TODO: Implement
        return null;
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
