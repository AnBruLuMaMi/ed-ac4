package ex08.test;

import ac4.ex01.a.interfaces.IFilaPrioridade;
import ac4.ex01.c.FilaPrioridadeHeap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex8Test {
    @Test
    void test() {
        //R: A sequencia de índices é
        // prefixado: [1, 2, 4, 8, 9, 5, 10, 11, 3, 6, 12, 13, 7, 14, 15]
        // interfixado: [8, 4, 9, 2, 10, 5, 11, 1, 12, 6, 13, 3, 14, 7, 15]
        // posfixado: [8, 9, 4, 10, 11, 5, 2, 12, 13, 6, 14, 15, 7, 3, 1]

        FilaPrioridadeHeap<Integer, String> filaPrioridadeH = new FilaPrioridadeHeap<>();

        filaPrioridadeH.insert(1, "C");
        filaPrioridadeH.insert(2, "A");
        filaPrioridadeH.insert(3, "Z");
        filaPrioridadeH.insert(4, "K");
        filaPrioridadeH.insert(5, "F");
        filaPrioridadeH.insert(6, "Q");
        filaPrioridadeH.insert(7, "B");
        filaPrioridadeH.insert(8, "X");
        filaPrioridadeH.insert(9, "J");
        filaPrioridadeH.insert(10, "E");
        filaPrioridadeH.insert(11, "H");
        filaPrioridadeH.insert(12, "S");
        filaPrioridadeH.insert(13, "W");
        filaPrioridadeH.insert(14, "R");
        filaPrioridadeH.insert(15, "T");

        assertEquals("[1, 2, 4, 8, 9, 5, 10, 11, 3, 6, 12, 13, 7, 14, 15]", filaPrioridadeH.toStringPreOrder());
        assertEquals("[8, 4, 9, 2, 10, 5, 11, 1, 12, 6, 13, 3, 14, 7, 15]", filaPrioridadeH.toStringInOrder());
        assertEquals("[8, 9, 4, 10, 11, 5, 2, 12, 13, 6, 14, 15, 7, 3, 1]", filaPrioridadeH.toStringPostOrder());
    }
}
