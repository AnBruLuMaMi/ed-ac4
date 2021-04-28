package ex12.test;

import ac4.ex12.PilhaFilaPrioridade;
import ac4.ex12.interfaces.IPilha;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TADPilhaTest {
    @Test
    void test() {
        IPilha<String> pilha = new PilhaFilaPrioridade();
        assertEquals("[]", pilha.toString());

        pilha.push("vermelho");
        assertEquals("[(-1,vermelho)]", pilha.toString());

        pilha.push("rosa");
        assertEquals("[(-2,rosa), (-1,vermelho)]", pilha.toString());

        assertEquals("rosa", pilha.pop());

        pilha.push("roxo");
        assertEquals("[(-2,roxo), (-1,vermelho)]", pilha.toString());

        assertEquals("roxo", pilha.pop());

        assertEquals("vermelho", pilha.top());

        assertEquals("vermelho", pilha.pop());

        assertThrows(EmptyStackException.class, () -> pilha.pop());

        assertEquals(true, pilha.isEmpty());

        pilha.push("preto");
        assertEquals("[(-1,preto)]", pilha.toString());

        pilha.push("roxo");
        assertEquals("[(-2,roxo), (-1,preto)]", pilha.toString());

        pilha.push("rosa");
        assertEquals("[(-3,rosa), (-2,roxo), (-1,preto)]", pilha.toString());

        pilha.push("vermelho");
        assertEquals("[(-4,vermelho), (-3,rosa), (-2,roxo), (-1,preto)]", pilha.toString());

        assertEquals(4, pilha.size());

        assertEquals("vermelho", pilha.pop());

        pilha.push("azul");
        assertEquals("[(-4,azul), (-3,rosa), (-2,roxo), (-1,preto)]", pilha.toString());

        assertEquals("azul", pilha.pop());

        assertEquals("rosa", pilha.pop());
    }
}
