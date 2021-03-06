package com.custodio.problems.hackerrank;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

    @Test
    @Ignore
    public void when_DataToSearchIsIntegerType_And_ListIsOrdered_Then_ReturnTheExactlyIndexForFoundData() {
        //given
        final var binarySearch = new BinarySearch<>();
        //when
        final var actualIndex = BinarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 9);
        //then
        final var expectedIndex = 4;
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    @Ignore
    public void when_DataToSearchIsStringType_And_ListIsOrdered_Then_ReturnTheExactlyIndexForFoundData() {
        //given
        final var binarySearch = new BinarySearch<>();
        //when
        final var actualIndex = BinarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 2);
        //then
        final var expectedIndex = -1;
        assertEquals(expectedIndex, actualIndex);
    }
}
