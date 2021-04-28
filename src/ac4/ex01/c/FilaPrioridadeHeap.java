package ac4.ex01.c;

import ac4.ex01.a.DefaultComparator;
import ac4.ex01.a.Entry;
import ac4.ex01.a.exceptions.EmptyPriorityQueueException;
import ac4.ex01.a.exceptions.InvalidKeyException;
import ac4.ex01.a.interfaces.IEntry;
import ac4.ex01.a.interfaces.IFilaPrioridade;
import ac4.ex01.a.interfaces.INodo;
import ac4.ex01.b.ArvoreBinariaCompleta;
import ac4.ex01.b.interfaces.IArvoreBinariaCompleta;

import java.util.Comparator;

public class FilaPrioridadeHeap<K,V> implements IFilaPrioridade<K,V> {
    private ArvoreBinariaCompleta<IEntry<K, V>> heap;
    private Comparator<K> comparador;

    public FilaPrioridadeHeap() {
        this.heap = new ArvoreBinariaCompleta();
        this.comparador = new DefaultComparator();
    }

    public FilaPrioridadeHeap(Comparator<K> comparador) {
        this.heap = new ArvoreBinariaCompleta();
        this.comparador = comparador;
    }

    private void validarChave(K chave) throws InvalidKeyException {
        try {
            comparador.compare(chave, chave);
        } catch (Exception e) {
            throw new InvalidKeyException("A chave é inválida");
        }
    }

    private void swap(INodo<IEntry<K, V>> x, INodo<IEntry<K, V>> y) {
        IEntry<K, V> temp = x.element();

        heap.replace(x, y.element());
        heap.replace(y, temp);
    }

    private void upHeap(INodo<IEntry<K, V>> nodo) {
        INodo<IEntry<K, V>> nodo2;

        while (!heap.isRoot(nodo)) {
            nodo2 = heap.parent(nodo);

            if (comparador.compare(nodo2.element().getKey(), nodo.element().getKey()) <= 0)
                break;

            swap(nodo2, nodo);
            nodo = nodo2;
        }
    }

    private void downHeap(INodo<IEntry<K, V>> nodo) {
        while (heap.isInternal(nodo)) {
            INodo<IEntry<K, V>> nodoMenor;

            if (!heap.hasRight(nodo))
                nodoMenor = heap.left(nodo);
            else if (comparador.compare(heap.left(nodo).element().getKey(), heap.right(nodo).element().getKey()) <= 0)
                nodoMenor = heap.left(nodo);
            else
                nodoMenor = heap.right(nodo);

            if (comparador.compare(nodoMenor.element().getKey(), nodo.element().getKey()) < 0) {
                swap(nodo, nodoMenor);
                nodo = nodoMenor;
            } else
                break;
        }
    }

    @Override
    public IEntry<K, V> min() throws EmptyPriorityQueueException {
        if (isEmpty())
            throw new EmptyPriorityQueueException("A Fila de Prioridade está vazia");

        return heap.root().element();
    }

    @Override
    public IEntry<K, V> insert(K chave, V valor) throws InvalidKeyException {
        validarChave(chave);

        IEntry<K, V> entry = new Entry(chave, valor);
        upHeap(heap.add(entry));

        return entry;
    }

    @Override
    public IEntry<K, V> removeMin() throws EmptyPriorityQueueException {
        if (isEmpty())
            throw new EmptyPriorityQueueException("A Fila de Prioridade está vazia");

        IEntry<K, V> min = heap.root().element();

        if (size() == 1)
            heap.remove();
        else {
            heap.replace(heap.root(), heap.remove());
            downHeap(heap.root());
        }

        return min;
    }

    @Override
    public int size() {
        return heap.size();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    public String toString() {
        return heap.toString();
    }

    public String toStringPreOrder() {
        return ((ArvoreBinariaCompleta)heap).toStringPreOrder();
    }

    public String toStringPreOrder2() {
        return ((ArvoreBinariaCompleta)heap).toStringPreOrder2();
    }

    public String toStringInOrder() {
        return ((ArvoreBinariaCompleta)heap).toStringInOrder();
    }

    public String toStringPostOrder() {
        return ((ArvoreBinariaCompleta)heap).toStringPostOrder();
    }

    public String toStringPostOrder2() {
        return ((ArvoreBinariaCompleta)heap).toStringPostOrder2();
    }
}
