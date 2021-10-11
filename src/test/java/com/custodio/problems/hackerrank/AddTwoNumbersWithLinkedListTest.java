package com.custodio.problems.hackerrank;

import com.custodio.problems.hackerrank.AddTwoNumbersWithLinkedList.Node;
import org.junit.Test;

import static com.custodio.problems.hackerrank.AddTwoNumbersWithLinkedList.solution;
import static org.junit.Assert.assertEquals;

public class AddTwoNumbersWithLinkedListTest {

    @Test
    public void when_ThereAreTwoValidNumbers_Then_ReturnTheSumOfThem() {
        //given
        final var list1 = new Node(0, new Node(0, new Node(4))); // Value 400 in inverted order.
        final var list2 = new Node(0, new Node(0, new Node(4))); // Value 400 in inverted order.
        //when
        final var actualResult = solution(list1, list2);
        //then
        final var expectedResult = new Node(0, new Node(0, new Node(8))); // Value 800 in inverted order.
        assertEquals(expectedResult, actualResult);
    }
}
