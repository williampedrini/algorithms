package com.custodio.problems;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.List;

/**
 * @see <a href="https://www.techseries.dev/products/coderpro/categories/1831147/posts/6231429">Tech Series</a>
 */
public class CanSpell {

    public boolean canSpell(@NotNull final List<String> magazine, final List<String> note) {
        final var magazineLetter = new HashMap<String, Integer>(0);

        for (final var letter : magazine) {
            final var value = magazineLetter.getOrDefault(letter, 0);
            magazineLetter.put(letter, value + 1);
        }

        for (final var letter : note) {
            final var amount = magazineLetter.getOrDefault(letter, 0);
            if (amount == 0) {
                return false;
            }
            magazineLetter.put(letter, amount - 1);
        }
        return true;
    }
}
