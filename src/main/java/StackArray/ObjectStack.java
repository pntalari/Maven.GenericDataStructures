package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    static final int DEFAULT_CAPACITY = 1000;
    int size;
    int capacity;
    private Object[] elements;

    public ObjectStack() {
        this.capacity = DEFAULT_CAPACITY;
        elements = new Object[DEFAULT_CAPACITY];
    }

    public Object isEmpty() {
        return (size == 0);
    }

    public void push(E foobar) {
        if(this.size>elements.length){
            int newSize = size + (size+1);
            elements = Arrays.copyOf(elements,newSize);
        }
        elements[size++] = foobar;
    }

    public Object pop() {
        if(size<0){
            throw new IndexOutOfBoundsException();
        }
        Object value = elements[--size];
        elements[size] = null;

        return value;
    }
}
