package com.custodio.datastructure.tree;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;

interface TraversalAlgorithm<T> {
    @NotNull
    Collection<T> getNodes();
}
