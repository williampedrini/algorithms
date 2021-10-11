package com.custodio.problems.codepro;

import org.junit.Test;

import static com.custodio.problems.codepro.SortingListWithThreeUniqueNumbers.solution;
import static org.junit.Assert.assertEquals;

public class SortingListWithThreeUniqueNumbersTest {

    @Test
    public void test() {
        //when
        final var actualSortedNumbers = solution(3, 3, 2, 1, 3, 2, 1);
        //then
        final var expectedSortedNumber = new Integer[]{1, 1, 2, 2, 3, 3, 3};
        assertEquals(expectedSortedNumber, actualSortedNumbers);
    }
}
