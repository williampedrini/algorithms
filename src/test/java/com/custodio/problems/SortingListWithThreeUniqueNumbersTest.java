package com.custodio.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortingListWithThreeUniqueNumbersTest {

    @Test
    public void test() {
        //given
        final var underTest = new SortingListWithThreeUniqueNumbers();
        //when
        final var actualSortedNumbers = underTest.sort(new int[]{3, 3, 2, 1, 3, 2, 1});
        //then
        final var expectedSortedNumber = new Integer[]{1, 1, 2, 2, 3, 3, 3};
        assertEquals(expectedSortedNumber, actualSortedNumbers);
    }
}
