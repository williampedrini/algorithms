package com.custodio.problems.codepro;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayDeque;
import java.util.Deque;

import static java.util.Objects.requireNonNull;
import static java.util.Optional.ofNullable;

final class MaximumInAStack<T extends Comparable<T>> {
    private final Deque<T> stack;
    private final Deque<T> maxes;

    MaximumInAStack() {
        this(new ArrayDeque<>(0), new ArrayDeque<>(0));
    }

    private MaximumInAStack(@NotNull final Deque<T> stack, @NotNull final Deque<T> maxes) {
        this.stack = requireNonNull(stack, "The main stack is mandatory.");
        this.maxes = requireNonNull(maxes, "The maxes stack is mandatory.");
    }

    MaximumInAStack<T> push(@NotNull final T value) {
        requireNonNull(value, "The value is mandatory.");
        final var maxValue = ofNullable(maxes.peek())
                                     .filter(max -> max.compareTo(value) > 0)
                                     .orElse(value);
        maxes.push(maxValue);
        stack.push(value);
        return this;
    }

    @NotNull
    T pop() {
        maxes.pop();
        return stack.pop();
    }

    @Nullable
    T max() {
        return maxes.peek();
    }
}
