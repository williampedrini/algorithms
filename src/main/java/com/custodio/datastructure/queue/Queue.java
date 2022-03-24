package com.custodio.datastructure.queue;

import org.jetbrains.annotations.NotNull;

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
        return false;
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
        //TODO: Implement
    }
}
