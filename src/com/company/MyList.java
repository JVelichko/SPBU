package com.company;

/**
 * Created by Julia on 24.11.2015.
 */
public interface MyList<E> {
    int size();

    boolean isEmpty();

    void add(E e);

    void add(int index, E e);

    void remove(int index);

    void clear();

    E get(int index);

    void set(int index, E element);

    void map(Function<E> f);

    void show ();
}
