package com.custodio.problems;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CanSpellTest {

    @Test
    public void when_ThereAreEnoughLettersInMagazineForNote_Then_ReturnTrueForCanSpell() {
        //given
        final var underTest = new CanSpell();
        //when
        final var magazine = asList("A", "B", "C", "D", "E", "E");
        final var note = asList("B", "E", "D");
        final var canSpell = underTest.canSpell(magazine, note);
        //then
        assertTrue(canSpell);
    }

    @Test
    public void when_ThereAreNotEnoughLettersInMagazineForNote_Then_ReturnFalseForCanSpell() {
        //given
        final var underTest = new CanSpell();
        //when
        final var magazine = asList("A", "B", "C", "D", "E", "E");
        final var note = asList("C", "A", "T");
        final var canSpell = underTest.canSpell(magazine, note);
        //then
        assertFalse(canSpell);
    }
}
