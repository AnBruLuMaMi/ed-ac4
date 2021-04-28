package ex09.test;

import ac4.ex01.c.FilaPrioridadeHeap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex9Test {
    @Test
    void test() {
        //R: O heap a seguir refuta o argumento de Bill
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

        assertEquals("[(1,C), (2,A), (4,K), (8,X), (9,J), (5,F), (10,E), (11,H), (3,Z), (6,Q), (12,S), (13,W), (7,B), (14,R), (15,T)]",
                filaPrioridadeH.toStringPreOrder2());
    }
}
