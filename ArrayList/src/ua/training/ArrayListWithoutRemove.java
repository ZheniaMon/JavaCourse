package ua.training;

import java.util.ArrayList;

public class ArrayListWithoutRemove<E> extends ArrayList {

    @Override
    public E remove(int index) {
        throw new RuntimeException("Function remove is not allowed");
    }

}
