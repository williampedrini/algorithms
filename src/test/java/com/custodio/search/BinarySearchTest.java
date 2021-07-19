package com.custodio.search;

import org.junit.Test;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Stream.of;
import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

    @Test
    public void when_DataToSearchIsIntegerType_And_ListIsOrdered_Then_ReturnTheExactlyIndexForFoundData() {
        //given
        final var binarySearch = new BinarySearch<>(of(1, 2, 3, 4, 5, 6).collect(toList()));
        //when
        final var actualIndex = binarySearch.search(3);
        //then
        final var expectedIndex = 2;
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void when_DataToSearchIsStringType_And_ListIsOrdered_Then_ReturnTheExactlyIndexForFoundData() {
        //given
        final var binarySearch = new BinarySearch<>(of("A", "B", "C", "D", "E", "F").collect(toList()));
        //when
        final var actualIndex = binarySearch.search("C");
        //then
        final var expectedIndex = 2;
        assertEquals(expectedIndex, actualIndex);
    }
}
