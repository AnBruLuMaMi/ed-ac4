package ac4.ex13;

import ac4.ex01.a.FilaPrioridade;
import ac4.ex01.a.interfaces.IFilaPrioridade;
import ac4.ex13.exceptions.FilaVaziaException;
import ac4.ex13.interfaces.IFila;

public class FilaFilaPrioridade<T> implements IFila<T> {
    private IFilaPrioridade<Integer,T> filaPrioridade;
    private int prioridade;

    public FilaFilaPrioridade() {
        this.filaPrioridade = new FilaPrioridade();
        this.prioridade = 0;
    }

    @Override
    public void enqueue(T elemento) {
        prioridade++;
        filaPrioridade.insert(prioridade, elemento);
    }

    @Override
    public T dequeue() throws FilaVaziaException {
        if (filaPrioridade.isEmpty())
            throw new FilaVaziaException("A fila está vazia.");

        prioridade--;

        return filaPrioridade.removeMin().getValue();
    }

    @Override
    public T front() throws FilaVaziaException {
        if (filaPrioridade.isEmpty())
            throw new FilaVaziaException("A fila está vazia.");

        return filaPrioridade.min().getValue();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return filaPrioridade.size();
    }

    @Override
    public String toString() {
        return filaPrioridade.toString();
    }
}
