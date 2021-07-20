package com.custodio.search;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import static java.util.Objects.requireNonNull;

class BinarySearch<T extends Comparable<T>> {
    private final List<T> data;

    BinarySearch(@NotNull final List<T> data) {
        this.data = requireNonNull(data, "The data is mandatory.");
    }

    int search(@NotNull final T value) {
        requireNonNull(value, "The value is mandatory to perform the search");
        return -1;
    }
}
