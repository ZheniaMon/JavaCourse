package ua.training;

import java.util.*;

public class ArrayListWithoutRemove<E> extends AbstractList<E> {

    private Object[] array;
    private int size;

    @Override
    public boolean add(E e) {
        ensureCapasity(size+1);
        array[size++] = e;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E remove(int index) {
        throw new RuntimeException("Function remove is not allowed");
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public void ensureCapasity(int minCapasity) {
        int oldCapacity = array.length;
        if(minCapasity > oldCapacity) {
            Object oldData[] = array;
            int newCapasity = (oldCapacity * 3)/2 + 1;
            if(newCapasity < minCapasity) {
                newCapasity = minCapasity;
            }
            array = Arrays.copyOf(array, newCapasity);
        }
    }
}
