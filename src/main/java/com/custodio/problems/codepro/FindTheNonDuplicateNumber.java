package com.custodio.problems.codepro;

import java.util.Map.Entry;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * @see <a href="https://www.techseries.dev/products/coderpro/categories/1831147/posts/6178060">Tech Series</a>
 * <p>
 * Given a list of numbers, find the non duplicated number in the array.
 * <p>
 * E.g: WHEN [1,2,3,4,4,3,2] THEN return 1
 */
final class FindTheNonDuplicateNumber {

    static int solution(final int... numbers) {
        return stream(numbers)
                       .boxed()
                       .collect(groupingBy(number -> number, counting()))
                       .entrySet()
                       .stream()
                       .filter(entry -> entry.getValue() == 1L)
                       .map(Entry::getKey)
                       .findAny()
                       .orElse(-1);
    }
}
