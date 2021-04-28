package ac4.ex01.a;

import ac4.ex01.a.exceptions.EmptyPriorityQueueException;
import ac4.ex01.a.exceptions.InvalidKeyException;
import ac4.ex01.a.interfaces.IEntry;
import ac4.ex01.a.interfaces.IFilaPrioridade;
import ac4.ex01.a.interfaces.IListaNodo;
import ac4.ex01.a.interfaces.INodo;

import java.util.Comparator;

public class FilaPrioridade<K,V> implements IFilaPrioridade<K,V> {
    private IListaNodo<IEntry<K,V>> entries;
    private Comparator<K> comparador;
    private INodo<IEntry<K,V>> actionNodo;

    public FilaPrioridade() {
        this.entries = new ListaNodo();
        this.comparador = new DefaultComparator();
    }

    public FilaPrioridade(Comparator<K> comparator) {
        this.entries = new ListaNodo();
        this.comparador = comparator;
    }

    private boolean validarChave(K chave) throws InvalidKeyException {
        boolean resultado;

        try {
            resultado = (comparador.compare(chave, chave) == 0);
        } catch (ClassCastException e) {
            throw new InvalidKeyException("A chave não pode ser comparada");
        }

        return resultado;
    }

    private void insertEntry(IEntry<K, V> e) {
        if (entries.isEmpty()) {
            entries.addFirst(e);
            actionNodo = entries.first();
        } else if (comparador.compare(e.getKey(), entries.last().element().getKey()) > 0) {
            entries.addLast(e);
            actionNodo = entries.last();
        } else {
            INodo<IEntry<K, V>> curr = entries.first();

            while (comparador.compare(e.getKey(), curr.element().getKey()) > 0) {
                curr = entries.next(curr);
            }

            entries.addBefore(curr, e);
            actionNodo = entries.prev(curr);
        }
    }

    @Override
    public IEntry<K, V> min() throws EmptyPriorityQueueException {
        if (entries.isEmpty()) throw new EmptyPriorityQueueException("A Fila de Prioridade está vazia.");
        else return entries.first().element();
    }

    @Override
    public IEntry<K, V> insert(K chave, V valor) throws InvalidKeyException {
        validarChave(chave);

        IEntry<K, V> entry = new Entry<K, V>(chave, valor);
        insertEntry(entry);

        return entry;
    }

    @Override
    public IEntry<K, V> removeMin() throws EmptyPriorityQueueException {
        if (entries.isEmpty()) throw new EmptyPriorityQueueException("A Fila de Prioridade está vazia.");
        else return entries.remove(entries.first());
    }

    @Override
    public int size() {
        return entries.size();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public String toString() {
        return entries.toString();
    }
}
