package com.custodio.problems.codepro;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @see <a href="https://www.techseries.dev/products/coderpro/categories/1831147/posts/6178059">Tech Series</a>
 */
final class SortingListWithThreeUniqueNumbers {

    /**
     * Sort the current array of unique numbers. This array can only contain 1, 2 or 3.
     *
     * @param numbers The list of numbers to be sorted.
     * @return The sorted list of numbers.
     */
    static Integer[] solution(final int... numbers) {
        final var quantityPerNumber = new HashMap<Integer, Integer>(0);

        for (final var number : numbers) {
            final var quantity = quantityPerNumber.getOrDefault(number, 0);
            quantityPerNumber.put(number, quantity + 1);
        }

        final var sortedNumber = new ArrayList<Integer>(0);

        quantityPerNumber.forEach((key, quantity) -> {
            for (int index = 0; index != quantity; index++) {
                sortedNumber.add(key);
            }
        });

        return sortedNumber.toArray(new Integer[0]);
    }
}
