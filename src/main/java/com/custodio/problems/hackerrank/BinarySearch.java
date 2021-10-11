package com.custodio.problems.hackerrank;

/**
 * @see <a href="https://leetcode.com/problems/binary-search/>Leet Code</a>
 */
final class BinarySearch<T extends Comparable<T>> {

    static int solution(final int[] nums, final int target) {
        return solution(nums, target, 0, nums.length - 1);
    }

    static int solution(final int[] nums, final int target, final int left, final int right) {
        final var middleIndex = right - left / 2;
        final var middle = nums[middleIndex];
        if(left > right) {
            return -1;
        }
        if(middle == target) {
            return middleIndex;
        }
        if(target > middle) {
            return solution(nums, target, middleIndex, right);
        }
        return solution(nums, target, left, middleIndex);
    }
}
