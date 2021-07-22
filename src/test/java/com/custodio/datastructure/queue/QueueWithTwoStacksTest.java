package com.custodio.datastructure.queue;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueWithTwoStacksTest {

    @Test
    public void when_ThereAreTwoElementsInTheQueue_Then_ReturnTheFirstElementAddedToIt() {
        //given
        final var underTest = new QueueWithTwoStacks<Long>()
                                      .add(10L)
                                      .add(11L);
        //when
        final var currentHeadValue = underTest.remove();
        //then
        assertEquals(Long.valueOf(10L), currentHeadValue);
    }

    @Test
    public void when_ThereAreNotAnyElementsInTheQueue_Then_ThrowIllegalStateExceptionForRemove() {
        //given
        final var underTest = new QueueWithTwoStacks<Long>();
        //then
        assertThrows(IllegalStateException.class, () -> {
            //when
            underTest.remove();
        });
    }
}
