package com.custodio.problems.codepro;

import org.junit.Test;

import static com.custodio.problems.codepro.QueueReconstructionByHeight.solution;
import static org.junit.Assert.assertEquals;

public class QueueReconstructionByHeightTest {

    @Test
    public void test() {
        //given
        final var input = new int[][]{{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        //when
        final var actual = solution(input);
        //then
        final var expected = new int[][]{{5, 0}, {7, 0}, {5, 2}, {6, 1}, {4, 4}, {7, 1}};
        assertEquals(expected, actual);
    }
}
