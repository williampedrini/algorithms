package com.custodio.problems.codepro;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.List;

/**
 * @see <a href ="https://www.techseries.dev/products/coderpro/categories/1831147/posts/6228789">Tech Series</a>
 */
final class TwoSum {

    /**
     * Verifies if there is a pair of value that will result in the target amount.
     *
     * @param numbers A list of numbers to be used as base.
     * @param target  The expected target.
     * @return {@code true}: If there are matches for the target.
     * {@code false}: If there are not match for the target.
     */
    static boolean solution(@NotNull final List<Integer> numbers, @NotNull final Integer target) {
        // This map will contain all the already visited numbers.
        // It is used to avoid searching for a matching via a list iteration,
        // since accessing values on a hash set is linear time O(1).
        final var values = new HashSet<>(0);

        for (final Integer number : numbers) {
            final var difference = target - number; //If the difference between the target was a number already visited, then it will return true for matching pair.
            if (values.contains(difference)) {
                return true;
            }
            values.add(number);
        }
        return false;
    }
}
