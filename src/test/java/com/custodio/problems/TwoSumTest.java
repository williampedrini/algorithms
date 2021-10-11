package com.custodio.problems;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TwoSumTest {

    @Test
    public void when_ThereArePaisForTarget_Then_ReturnTrueForMatchingPairs() {
        //given
        final var underTest = new TwoSum();
        //when
        final var hasTwoSum = underTest.hasTwoSum(asList(2, 7, 11, 15), 18);
        //then
        assertTrue(hasTwoSum);
    }

    @Test
    public void when_ThereAreNotPaisForTarget_Then_ReturnFalseForMatchingPairs() {
        //given
        final var underTest = new TwoSum();
        //when
        final var hasTwoSum = underTest.hasTwoSum(asList(2, 7, 11, 15), 19);
        //then
        assertFalse(hasTwoSum);
    }

    @Test
    public void when_ThereIsOneNumberForTarget_Then_ReturnFalseForMatchingPairs() {
        //given
        final var underTest = new TwoSum();
        //when
        final var hasTwoSum = underTest.hasTwoSum(asList(2, 7, 11, 19), 19);
        //then
        assertFalse(hasTwoSum);
    }
}
