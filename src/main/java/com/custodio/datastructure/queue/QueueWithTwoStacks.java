package com.custodio.datastructure.queue;

import org.jetbrains.annotations.NotNull;

import java.util.Stack;

import static java.util.Objects.requireNonNull;

class QueueWithTwoStacks<T> {
    private final Stack<T> newestValues;
    private final Stack<T> oldestValues;

    QueueWithTwoStacks() {
        newestValues = new Stack<>();
        oldestValues = new Stack<>();
    }

    @NotNull
    QueueWithTwoStacks<T> add(@NotNull final T value) {
        requireNonNull(value, "The value is mandatory.");
        newestValues.push(value);
        populateOldestValuesIfEmpty();
        return this;
    }

    @NotNull
    T peek() {
        return oldestValues.peek();
    }

    @NotNull
    T remove() {
        return oldestValues.pop();
    }

    private void populateOldestValuesIfEmpty() {
        if (oldestValues.isEmpty()) {
            while (!newestValues.isEmpty()) {
                final var currentNewestTopValue = newestValues.pop();
                oldestValues.push(currentNewestTopValue);
            }
        }
    }
}
