package com.custodio.datastructure.tree;

import org.junit.Test;

import java.util.stream.Stream;

import static com.custodio.datastructure.tree.BinaryTree.BinaryTreeTraversalAlgorithm.IN_ORDER;
import static com.custodio.datastructure.tree.BinaryTree.BinaryTreeTraversalAlgorithm.POST_ORDER;
import static com.custodio.datastructure.tree.BinaryTree.BinaryTreeTraversalAlgorithm.PRE_ORDER;
import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;
import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BinaryTreeTest {

    @Test
    public void when_FindNodesByInOrderTraversal_And_ThereAreNodesToBeReturned_Then_ShouldReturnInOrderValues() {
        //given
        final var underTest = new BinaryTree<>(10)
                                      .insert(5)
                                      .insert(15)
                                      .insert(8);
        //when
        final var actualValues = underTest.getNodes(IN_ORDER);
        //then
        final var expectedValues = Stream.of(5, 8, 10, 15).collect(toList());
        assertEquals(expectedValues, actualValues);
    }

    @Test
    public void when_FindNodesByPreOrderTraversal_And_ThereAreNodesToBeReturned_Then_ShouldReturnInOrderValues() {
        //given
        final var underTest = new BinaryTree<>(10)
                                      .insert(5)
                                      .insert(15)
                                      .insert(8);
        //when
        final var actualValues = underTest.getNodes(PRE_ORDER);
        //then
        final var expectedValues = Stream.of(10, 5, 8, 15).collect(toList());
        assertEquals(expectedValues, actualValues);
    }

    @Test
    public void when_FindNodesByPostOrderTraversal_And_ThereAreNodesToBeReturned_Then_ShouldReturnInOrderValues() {
        //given
        final var underTest = new BinaryTree<>(10)
                                      .insert(5)
                                      .insert(15)
                                      .insert(8);
        //when
        final var actualValues = underTest.getNodes(POST_ORDER);
        //then
        final var expectedValues = Stream.of(8, 5, 15, 10).collect(toList());
        assertEquals(expectedValues, actualValues);
    }

    @Test
    public void when_BinaryTreeIsValid_Then_ReturnTrueForValidation() {
        //given
        final var leftNode = new TreeNode<>(4);
        final var rightNode = new TreeNode<>(7);
        final var rootNode = new TreeNode<>(5, leftNode, rightNode);
        //when
        final var isValid = new BinaryTree<>(rootNode).isValid(MIN_VALUE, MAX_VALUE);
        //then
        assertTrue(isValid);
    }

    @Test
    public void when_BinaryTreeIsNotValid_Then_ReturnFalseForValidation() {
        //given
        final var leftNode = new TreeNode<>(7);
        final var rightNode = new TreeNode<>(4);
        final var rootNode = new TreeNode<>(5, leftNode, rightNode);
        //when
        final var isValid = new BinaryTree<>(rootNode).isValid(MIN_VALUE, MAX_VALUE);
        //then
        assertFalse(isValid);
    }
}
