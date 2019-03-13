package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    static final int DEFAULT_CAPACITY = 1000;
    int size;
    private E[] elements;
    int capacity;

    public GenericStack() {
        this.capacity = DEFAULT_CAPACITY;
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public E isEmpty() {
        Boolean result = (size == 0);
        return (E)result;
    }

    public void push(E foobar) {
        if(this.size >= elements.length){
            int newSize = size + (size + 1);
            elements = Arrays.copyOf(elements,newSize);
        }
        elements[size++] = foobar;
    }

    public E pop() {
        if(size<=0){
            throw new IndexOutOfBoundsException();
        }
        E value = elements[--size];
        elements[size] = null;

        return value;
    }

}
