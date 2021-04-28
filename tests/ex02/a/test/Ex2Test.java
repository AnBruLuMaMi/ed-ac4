package ex02.a.test;

import ac4.ex01.a.interfaces.IFilaPrioridade;
import ac4.ex01.c.FilaPrioridadeHeap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex2Test {
    @Test
    void test() {
        //Passo-a-passo desenhado em: /imgs/ex02.png

        IFilaPrioridade<Integer, String> filaPrioridadeH = new FilaPrioridadeHeap<>();

        filaPrioridadeH.insert(5, "A");
        filaPrioridadeH.insert(4, "B");
        filaPrioridadeH.insert(7, "I");
        filaPrioridadeH.insert(1, "D");
        assertEquals("[null, [(1,D),1], [(4,B),2], [(7,I),3], [(5,A),4]]", filaPrioridadeH.toString());

        filaPrioridadeH.removeMin();
        assertEquals("[null, [(4,B),1], [(5,A),2], [(7,I),3]]", filaPrioridadeH.toString());

        filaPrioridadeH.insert(3, "J");
        filaPrioridadeH.insert(6, "L");
        assertEquals("[null, [(3,J),1], [(4,B),2], [(7,I),3], [(5,A),4], [(6,L),5]]", filaPrioridadeH.toString());

        filaPrioridadeH.removeMin();
        filaPrioridadeH.removeMin();
        assertEquals("[null, [(5,A),1], [(6,L),2], [(7,I),3]]", filaPrioridadeH.toString());

        filaPrioridadeH.insert(8, "G");
        assertEquals("[null, [(5,A),1], [(6,L),2], [(7,I),3], [(8,G),4]]", filaPrioridadeH.toString());

        filaPrioridadeH.removeMin();
        assertEquals("[null, [(6,L),1], [(8,G),2], [(7,I),3]]", filaPrioridadeH.toString());

        filaPrioridadeH.insert(2, "H");
        assertEquals("[null, [(2,H),1], [(6,L),2], [(7,I),3], [(8,G),4]]", filaPrioridadeH.toString());

        filaPrioridadeH.removeMin();
        filaPrioridadeH.removeMin();
        assertEquals("[null, [(7,I),1], [(8,G),2]]", filaPrioridadeH.toString());
    }

}
