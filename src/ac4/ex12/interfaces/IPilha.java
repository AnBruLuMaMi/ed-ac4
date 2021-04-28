package ac4.ex12.interfaces;

import java.util.EmptyStackException;

public interface IPilha<T> {
    T top() throws EmptyStackException;
    void push(T element);
    T pop() throws EmptyStackException;
    int size();
    boolean isEmpty();
}
