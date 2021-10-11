package com.custodio.problems;

import java.util.Objects;

/**
 * @see <a href="https://www.techseries.dev/products/coderpro/categories/1831147/posts/6178058">Tech Series</a>
 */
class FindFirstAndLastIndexForNumber {

    static int binarySearch(final int[] sortedNumbers, final int target, final int left, final int right, final boolean first) {
        final var middle = right - left / 2;
        final var middleValue = sortedNumbers[middle];

        if(left > right) {
            return -1;
        }

        if (first) {
            if (middle - 1 > 0 && middleValue == target) {
                final var beforeMiddleValue = sortedNumbers[middle - 1];
                if (beforeMiddleValue != middleValue) {
                    return middle;
                }
            }
            if (middle - 1 < 0 && middleValue == target) {
                return middle;
            }

            if (target > middleValue) {
                return binarySearch(sortedNumbers, target, middle + 1, right, first);
            }
            return binarySearch(sortedNumbers, target, left, middle - 1, first);
        }

        if (middle + 1 < sortedNumbers.length && middleValue == target) {
            final var afterMiddleValue = sortedNumbers[middle + 1];
            if (afterMiddleValue != middleValue) {
                return middle;
            }
        }

        if (middle + 1 > sortedNumbers.length - 1 && middleValue == target) {
            return middle;
        }

        if (target > middleValue) {
            return binarySearch(sortedNumbers, target, middle + 1, right, first);
        }
        return binarySearch(sortedNumbers, target, left, middle - 1, first);
    }

    Range getRange(final int[] sortedNumbers, final int target) {
        final var first = binarySearch(sortedNumbers, target, 0, sortedNumbers.length - 1, true);
        final var last = binarySearch(sortedNumbers, target, 0, sortedNumbers.length - 1, false);
        return new Range(first, last);
    }

    static class Range {
        private final int first;
        private final int last;

        Range(final int first, final int last) {
            this.first = first;
            this.last = last;
        }

        int getFirst() {
            return first;
        }

        int getLast() {
            return last;
        }

        @Override
        public boolean equals(final Object other) {
            if (other instanceof Range) {
                final var otherRange = (Range) other;
                return first == otherRange.first && last == otherRange.last;
            }
            return false;
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, last);
        }
    }
}
