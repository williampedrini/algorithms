package com.custodio.problems;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BalancedExpressionTest {

    @Test
    public void when_ExpressionDoesNotContainClosingTermForOpenedTerm_Then_ReturnExpressionAsUnbalanced() {
        //when
        final var isBalanced = BalancedExpression.isBalanced("{}[](");
        //then
        assertFalse(isBalanced);
    }

    @Test
    public void when_ExpressionContainsClosingTermForOpenedTerm_Then_ReturnExpressionAsBalanced() {
        //when
        final var isBalanced = BalancedExpression.isBalanced("{}[]()");
        //then
        assertTrue(isBalanced);
    }
}
