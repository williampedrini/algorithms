package com.custodio.problems.codepro;

import com.custodio.problems.codepro.ReverseALinkedList.Node;
import org.junit.Test;

import static com.custodio.problems.codepro.ReverseALinkedList.solution;
import static org.junit.Assert.assertEquals;

public class ReverseALinkedListTest {

    @Test
    public void when_ReceiveALinkedList_Then_ReturnItReversed() {
        //given
        final var rootNode = new Node(1, new Node(2, new Node(3)));
        //when
        final var actual = solution(rootNode);
        //then
        final var expected = new Node(3, new Node(2, new Node(1)));
        assertEquals(expected, actual);
    }
}
