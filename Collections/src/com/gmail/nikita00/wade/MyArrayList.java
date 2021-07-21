package com.gmail.nikita00.wade;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;


public class MyArrayList<T> extends ArrayList<T> {

    @Override
    public T remove(int index) {
        System.out.println("You can`t remove");
        return null;
    }
    @Override
    public void clear() {
        System.out.println("You can`t remove");
    }
    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        System.out.println("You can`t remove");
    }
    @Override
    public boolean remove(Object o) {
        System.out.println("You can`t remove");
        return false;
    }
    @Override
    public void replaceAll(UnaryOperator<T> operator) {
        System.out.println("You can`t remove");
    }

    @Override
    public boolean removeIf(Predicate<? super T> filter) {
        System.out.println("You can`t remove");
        return false;
    }
}
