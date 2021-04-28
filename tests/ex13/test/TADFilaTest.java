package ex13.test;

import ac4.ex13.FilaFilaPrioridade;
import ac4.ex13.exceptions.FilaVaziaException;
import ac4.ex13.interfaces.IFila;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TADFilaTest {
    @Test
    void test() {
        IFila<Integer> fila = new FilaFilaPrioridade();

        assertEquals("[]", fila.toString());

        fila.enqueue(1);
        assertEquals("[(1,1)]", fila.toString());

        fila.enqueue(2);
        assertEquals("[(1,1), (2,2)]", fila.toString());

        assertEquals(1, fila.dequeue());

        assertEquals("[(2,2)]", fila.toString());

        assertEquals(2, fila.dequeue());

        assertEquals("[]", fila.toString());

        assertThrows(FilaVaziaException.class, () -> { fila.dequeue(); });
    }
}
