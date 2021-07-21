package ua.training;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class ImmutableArrayList extends ArrayList {

    /**
     * UnsupportedMethod
     * @throws UnsupportedOperationException
     */
    @Override
    public Object set(int index, Object element) {
        throw new UnsupportedOperationException();
    }

    /**
     * UnsupportedMethod
     * @throws UnsupportedOperationException
     */
    @Override
    public boolean add(Object o) {
        throw new UnsupportedOperationException();
    }

    /**
     * UnsupportedMethod
     * @throws UnsupportedOperationException
     */
    @Override
    public void add(int index, Object element) {
        throw new UnsupportedOperationException();
    }

    /**
     * UnsupportedMethod
     * @throws UnsupportedOperationException
     */
    @Override
    public Object remove(int index) {
        throw new UnsupportedOperationException();
    }

    /**
     * UnsupportedMethod
     * @throws UnsupportedOperationException
     */
    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    /**
     * UnsupportedMethod
     * @throws UnsupportedOperationException
     */
    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    /**
     * UnsupportedMethod
     * @throws UnsupportedOperationException
     */
    @Override
    public boolean addAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    /**
     * UnsupportedMethod
     * @throws UnsupportedOperationException
     */
    @Override
    public boolean addAll(int index, Collection c) {
        throw new UnsupportedOperationException();
    }

    /**
     * UnsupportedMethod
     * @throws UnsupportedOperationException
     */
    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    /**
     * UnsupportedMethod
     * @throws UnsupportedOperationException
     */
    @Override
    public boolean removeAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    /**
     * UnsupportedMethod
     * @throws UnsupportedOperationException
     */
    @Override
    public boolean retainAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    /**
     * UnsupportedMethod
     * @throws UnsupportedOperationException
     */
    @Override
    public boolean removeIf(Predicate filter) {
        throw new UnsupportedOperationException();
    }

    /**
     * UnsupportedMethod
     * @throws UnsupportedOperationException
     */
    @Override
    public void replaceAll(UnaryOperator operator) {
        throw new UnsupportedOperationException();
    }

    /**
     * UnsupportedMethod
     * @throws UnsupportedOperationException
     */
    @Override
    public void sort(Comparator c) {
        throw new UnsupportedOperationException();
    }
}
