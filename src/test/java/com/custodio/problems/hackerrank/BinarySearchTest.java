package com.custodio.problems.hackerrank;

import org.junit.Assert;
import org.junit.Test;

import static com.custodio.problems.hackerrank.BinarySearch.solution;

public class BinarySearchTest {

    @Test
    public void when_DataToSearchIsIntegerType_And_ListIsOrdered_Then_ReturnTheExactlyIndexForFoundData() {
        //given
        final var binarySearch = new BinarySearch<>();
        //when
        final var actualIndex = solution(new int[]{-1, 0, 3, 5, 9, 12}, 9);
        //then
        final var expectedIndex = 4;
        Assert.assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void when_DataToSearchIsStringType_And_ListIsOrdered_Then_ReturnTheExactlyIndexForFoundData() {
        //given
        final var binarySearch = new BinarySearch<>();
        //when
        final var actualIndex = solution(new int[]{-1, 0, 3, 5, 9, 12}, 2);
        //then
        final var expectedIndex = -1;
        Assert.assertEquals(expectedIndex, actualIndex);
    }
}
