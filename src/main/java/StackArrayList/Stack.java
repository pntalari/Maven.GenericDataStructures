package StackArrayList;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E>  {

    private ArrayList<E> elements;

    public Stack(){
        elements = new ArrayList<E>();
    }

    public void push(E foobar) {
       elements.add(foobar);

    }

    public E isEmpty() {
        Boolean result = (elements.size()==0);
        return (E)result;
    }

    public E pop() {

        if(!elements.isEmpty()){
            return elements.remove(elements.size()-1);
        }
        else
            throw new IndexOutOfBoundsException();
    }

//    public E peek(){
//
//     return E;
//    }

}
