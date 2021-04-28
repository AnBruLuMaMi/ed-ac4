package ex01.b.test;

import ac4.ex01.b.ArvoreBinariaCompleta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArvoreBinariaCompletaTest {
    @Test
    void test() {
        ArvoreBinariaCompleta<Integer> arvore = new ArvoreBinariaCompleta();

        arvore.add(4);
        arvore.add(5);
        arvore.add(6);
        arvore.add(15);
        arvore.add(9);
        arvore.add(7);
        arvore.add(20);
        arvore.add(16);
        arvore.add(25);
        arvore.add(14);
        arvore.add(12);
        arvore.add(11);
        arvore.add(8);

        assertEquals(
                "[null, [4,1], [5,2], [6,3], [15,4], [9,5], [7,6], [20,7], [16,8], [25,9], [14,10], [12,11], [11,12], [8,13]]",
                arvore.toString());
    }
}
