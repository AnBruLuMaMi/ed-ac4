package ex01.d.test;

import ac4.ex01.a.ListaNodo;
import ac4.ex01.a.interfaces.IEntry;
import ac4.ex01.a.interfaces.IFilaPrioridade;
import ac4.ex01.a.interfaces.IListaNodo;
import ac4.ex01.a.interfaces.INodo;
import ac4.ex01.c.FilaPrioridadeHeap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrdenacaoTest {
    <T> void ordenarHeap(IListaNodo<T> listaNodo) {
        IFilaPrioridade<T, T> filaHeap = new FilaPrioridadeHeap<>();

        while (!listaNodo.isEmpty()) {
            INodo<T> nodo = listaNodo.last();
            filaHeap.insert(nodo.element(), null);

            listaNodo.remove(nodo);
        }

        while (!filaHeap.isEmpty()) {
            IEntry<T, T> entry = filaHeap.removeMin();
            listaNodo.addLast(entry.getKey());
        }
    }

    @Test
    void test() {
        IListaNodo<Integer> listaNodo = new ListaNodo();
        listaNodo.addLast(9);
        listaNodo.addLast(1);
        listaNodo.addLast(3);
        listaNodo.addLast(6);
        listaNodo.addLast(2);
        listaNodo.addLast(7);
        listaNodo.addLast(8);

        assertEquals("[9, 1, 3, 6, 2, 7, 8]", listaNodo.toString());

        ordenarHeap(listaNodo);

        assertEquals("[1, 2, 3, 6, 7, 8, 9]", listaNodo.toString());
    }
}
