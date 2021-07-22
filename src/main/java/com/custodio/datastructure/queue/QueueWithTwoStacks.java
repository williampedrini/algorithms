package com.custodio.datastructure.queue;

import org.jetbrains.annotations.NotNull;

import java.util.Stack;

class QueueWithTwoStacks<T> {
    private final Stack<T> newestValues;
    private final Stack<T> oldestValues;

    QueueWithTwoStacks() {
        newestValues = new Stack<>();
        oldestValues = new Stack<>();
    }

    boolean isEmpty() {
        //TODO: Implement
        return true;
    }

    @NotNull
    QueueWithTwoStacks<T> add(@NotNull final T value) {
        //TODO: Implement
        return this;
    }

    T peek() {
        //TODO: Implement
        return null;
    }

    @NotNull
    T remove() {
        //TODO: Implement
        return null;
    }
}
