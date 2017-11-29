package ua.training;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class ArrayListWithoutRemove<E> extends ArrayList {

    @Override
    public E remove(int index) {
        throw new RuntimeException("Function remove is not allowed");
    }

    @Override
    public boolean remove(Object o) {
        throw new RuntimeException("Function remove is not allowed");
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new RuntimeException("Function remove is not allowed");
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new RuntimeException("Function remove is not allowed");
    }

    @Override
    public boolean removeIf(Predicate filter) {
        throw new RuntimeException("Function remove is not allowed");
    }

}
