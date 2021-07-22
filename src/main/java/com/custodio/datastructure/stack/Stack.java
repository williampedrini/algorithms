package com.custodio.datastructure.stack;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static java.util.Objects.requireNonNull;

class Stack<T> {
    private Node<T> top;

    Stack() {
    }

    /**
     * Creates a {@link Stack} with a node as its top.
     *
     * @param topData The top node data to be added as top.
     */
    Stack(@NotNull final T topData) {
        top = new Node<>(topData);
    }

    boolean isEmpty() {
        //TODO: Implement
        return true;
    }

    /**
     * Inserts a certain data into the top of the {@link Stack}.
     *
     * @param data The data to be inserted into the {@link Stack}.
     * @return The current {@link Stack} with the data as its top.
     */
    @NotNull
    Stack<T> push(@NotNull final T data) {
        //TODO: Implement
        return this;
    }

    /**
     * Returns the current element from the stack without removing it from ths stack.
     *
     * @return The top element from the stack.
     */
    T peek() {
        //TODO: Implement
        return null;
    }

    /**
     * Returns the data from the current stack and removes the element from it.
     *
     * @return The top element from the stack.
     */
    T pop() {
        //TODO: Implement
        return null;
    }

    private static final class Node<T> {
        private final T data;
        private final Node<T> next;

        private Node(@NotNull final T data, @Nullable final Node<T> next) {
            this.data = requireNonNull(data, "The data is mandatory to build a node.");
            this.next = next;
        }

        private Node(@NotNull final T data) {
            this(data, null);
        }

        @NotNull
        public T getData() {
            return data;
        }
    }
}
