package com.custodio.problems.codepro;

import org.junit.Test;

import static com.custodio.problems.codepro.CanSpell.solution;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CanSpellTest {

    @Test
    public void when_ThereAreEnoughLettersInMagazineForNote_Then_ReturnTrueForCanSpell() {
        //when
        final var magazine = asList("A", "B", "C", "D", "E", "E");
        final var note = asList("B", "E", "D");
        final var canSpell = solution(magazine, note);
        //then
        assertTrue(canSpell);
    }

    @Test
    public void when_ThereAreNotEnoughLettersInMagazineForNote_Then_ReturnFalseForCanSpell() {
        //when
        final var magazine = asList("A", "B", "C", "D", "E", "E");
        final var note = asList("C", "A", "T");
        final var canSpell = solution(magazine, note);
        //then
        assertFalse(canSpell);
    }
}
