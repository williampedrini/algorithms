package com.custodio.problems.hackerrank;

import org.junit.Test;

import static com.custodio.problems.hackerrank.BalancedExpression.solution;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BalancedExpressionTest {

    @Test
    public void when_ExpressionDoesNotContainClosingTermForOpenedTerm_Then_ReturnExpressionAsUnbalanced() {
        //when
        final var isBalanced = solution("{}[](");
        //then
        assertFalse(isBalanced);
    }

    @Test
    public void when_ExpressionContainsClosingTermForOpenedTerm_Then_ReturnExpressionAsBalanced() {
        //when
        final var isBalanced = solution("{}[]()");
        //then
        assertTrue(isBalanced);
    }
}
