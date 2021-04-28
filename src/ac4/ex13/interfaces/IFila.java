package ac4.ex13.interfaces;

import ac4.ex13.exceptions.FilaVaziaException;

public interface IFila<T> {
    void enqueue(T elemento);
    T dequeue() throws FilaVaziaException;
    T front() throws FilaVaziaException;
    boolean isEmpty();
    int size();
}
