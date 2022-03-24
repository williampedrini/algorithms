package com.custodio.datastructure.queue;

import org.jetbrains.annotations.NotNull;

import java.util.Stack;

class QueueWithTwoStacks<T> {
    private Stack<T> newestValues;
    private Stack<T> oldestValues;

    QueueWithTwoStacks() {
        //TODO: Implement
    }

    @NotNull
    QueueWithTwoStacks<T> add(@NotNull final T value) {
        //TODO: Implement
        return this;
    }

    @NotNull
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
