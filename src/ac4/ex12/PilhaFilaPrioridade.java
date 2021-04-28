package ac4.ex12;

import ac4.ex01.a.FilaPrioridade;
import ac4.ex01.a.interfaces.IFilaPrioridade;
import ac4.ex12.interfaces.IPilha;

import java.util.EmptyStackException;

public class PilhaFilaPrioridade<T> implements IPilha<T> {
    private IFilaPrioridade<Integer,T> filaPrioridade;
    private int prioridade;

    public PilhaFilaPrioridade() {
        this.filaPrioridade = new FilaPrioridade();
        this.prioridade = 0;
    }

    @Override
    public T top() throws EmptyStackException {
        if (filaPrioridade.isEmpty())
            throw new EmptyStackException();

        return filaPrioridade.min().getValue();
    }

    @Override
    public void push(T elemento) {
        prioridade--;
        filaPrioridade.insert(prioridade, elemento);
    }

    @Override
    public T pop() throws EmptyStackException {
        if (filaPrioridade.isEmpty())
            throw new EmptyStackException();

        prioridade++;
        return filaPrioridade.removeMin().getValue();
    }

    @Override
    public int size() {
        return filaPrioridade.size();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public String toString() {
        return filaPrioridade.toString();
    }
}
