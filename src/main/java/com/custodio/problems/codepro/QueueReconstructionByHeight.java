package com.custodio.problems.codepro;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import static java.util.Arrays.sort;
import static java.util.Comparator.comparing;

/**
 * @see <a href="https://www.techseries.dev/products/coderpro/categories/1831147/posts/6228781">Tech Series</a>
 * <p>
 * There is a pair (M,N), where M is the height of the person and N is the number of people that this person can see.
 * <p>
 * E.g: (7,1) This person has height of 7 and can see 1 person in front of them.
 * <p>
 * So, based on an input there is a necessity to sort this input to reflect the reality.
 * <p>
 * E.g:
 * <p>
 * GIVEN an input equals to [[1,0], [4,4], [7,1], [5,0], [6,1], [5,2]].
 * <p>
 * THEN Return input as [[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
 */
final class QueueReconstructionByHeight {
    private static final int HEIGHT_INDEX = 0;
    private static final int HORIZON_INDEX = 1;

    static int[][] solution(int[]... input) {
        final Comparator<int[]> heightComparator = comparing(person -> person[HEIGHT_INDEX]);
        final Comparator<int[]> horizonComparator = comparing(person -> person[HORIZON_INDEX]);
        sort(input, heightComparator.reversed().thenComparing(horizonComparator)); //order the list with the tallest person in the front and use horizon if the height is equal.

        final List<int[]> people = new LinkedList<>();
        for (final var person : input) { //here we are adding the person at the right place. The horizon is used to identify which index it should be put.
            people.add(person[HORIZON_INDEX], person);
        }
        return people.toArray(new int[people.size()][]);
    }
}
