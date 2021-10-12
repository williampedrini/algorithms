package com.custodio.problems.codepro;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumInAStackTest {

    @Test
    public void when_ThereIsDifferentNumbersAsMaxForEachIteration_Then_ReturnMaxAccordingToIteration() {
        //given
        final var underTest = new MaximumInAStack<Integer>()
                                      .push(1)
                                      .push(2)
                                      .push(3)
                                      .push(4)
                                      .push(2);

        final var expects = new Integer[]{4, 4, 3, 2, 1};

        for (var index = 0; index < expects.length; index++, underTest.pop()) {
            final var expected = expects[index];
            //when
            final var actual = underTest.max();
            //then
            assertEquals(expected, actual);
        }
    }

    @Test
    public void when_MaxValueIsTheFirst_Then_ReturnNumberAsMaxForAllIteration() {
        //given
        final var underTest = new MaximumInAStack<Integer>()
                                      .push(5)
                                      .push(4)
                                      .push(3)
                                      .push(2)
                                      .push(1);

        final var expects = new Integer[]{5, 5, 5, 5, 5};

        for (var index = 0; index < expects.length; index++, underTest.pop()) {
            final var expected = expects[index];
            //when
            final var actual = underTest.max();
            //then
            assertEquals(expected, actual);
        }
    }
}
