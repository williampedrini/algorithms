package com.custodio.datastructure.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class StackTest {

    @Test
    public void when_ThereIsOneElementInTheStack_And_StackIsPoppedTwice_Then_ShouldThrowIllegalStackException() {
        //given
        final var underTest = new Stack<>(10L);
        //when
        final var currentTopData = underTest.pop();
        //then
        assertTrue(underTest.isEmpty());
        assertEquals(Long.valueOf(10L), currentTopData);
        assertThrows(IllegalStateException.class, underTest::pop);
    }

    @Test
    public void when_ThereIsNotAnyElementInTheStack_And_StackIsPeekedTwice_Then_ShouldThrowIllegalStackException() {
        //given
        final var underTest = new Stack<>();
        //then
        assertTrue(underTest.isEmpty());
        assertThrows(IllegalStateException.class, () -> {
            //when
            underTest.peek();
        });
    }

    @Test
    public void when_ThereIsOneElementInTheStack_And_AnotherValueIsAdded_And_StackIsPopped_Then_ShouldReturnLastElement() {
        //given
        final var underTest = new Stack<>(10L);
        //when
        final var actualTopData = underTest.push(11L).pop();
        //then
        assertEquals(Long.valueOf(11L), actualTopData);
    }
}
