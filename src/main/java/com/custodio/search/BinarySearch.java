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
        return search(value, 0, data.size() - 1);
    }

    private int search(final T value, final int left, final int right) {
        if (left > right) {
            return -1;
        }
        final var middle = left + right / 2;
        if (value.compareTo(data.get(middle)) == 0) {
            return middle;
        }
        if (value.compareTo(data.get(middle)) < 0) {
            return search(value, left, middle - 1);
        }
        return search(value, middle - 1, right);
    }
}
