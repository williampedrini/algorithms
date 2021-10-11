package com.custodio.problems.codepro;

import org.jetbrains.annotations.NotNull;

import static java.lang.Character.isLetter;
import static java.lang.String.valueOf;

/**
 * @see <a href="https://leetcode.com/explore/challenge/card/september-leetcoding-challenge-2021/637/week-2-september-8th-september-14th/3974/">LeetCode</a>
 */
class ReverseOnlyLetters {

    @NotNull
    static String solution(@NotNull final String stringToReverse) {
        final var stringArrayToReverse = stringToReverse.toCharArray();

        for (int leftIndex = 0, rightIndex = stringArrayToReverse.length - 1; leftIndex < rightIndex; ) {
            final var leftLetter = stringArrayToReverse[leftIndex];
            final var isNotLeftLetterInEnglish = !isLetter(leftLetter);

            final var rightLetter = stringArrayToReverse[rightIndex];
            final var isNotRightLetterInEnglish = !isLetter(rightLetter);

            if (isNotRightLetterInEnglish) {
                rightIndex--;
                continue;
            }
            if (isNotLeftLetterInEnglish) {
                leftIndex++;
                continue;
            }

            stringArrayToReverse[rightIndex] = leftLetter;
            stringArrayToReverse[leftIndex] = rightLetter;
            rightIndex--;
            leftIndex++;
        }
        return valueOf(stringArrayToReverse);
    }
}
