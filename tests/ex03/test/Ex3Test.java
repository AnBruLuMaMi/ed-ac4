package ex03.test;

import ac4.ex01.a.interfaces.IFilaPrioridade;
import ac4.ex01.c.FilaPrioridadeHeap;
import ac4.ex03.Evento;
import ac4.ex03.EventoComparator;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex3Test {
    String removeEvents(IFilaPrioridade<Evento, String> filaPrioridadeH) {
        String resultado = "";

        while (!filaPrioridadeH.isEmpty()) {
            resultado += filaPrioridadeH.removeMin().getKey().toString();
            resultado += ", ";
        }

        return "[" +  resultado.substring(0, resultado.length() - 2) + "]";
    }
    @Test
    void test() {
        //R: A estrutura mais eficiente é uma Fila de Prioridade baseada em Heap.
        // Pois com ela podemos utilizar um comparador personalizado que sempre verifique qual timestamp é o menor e mantenha-o na raiz da árvore.
        // Para então quando precisar processar o evento, remover o que possuir o menor timestamp utilizando o método "removemin".

        IFilaPrioridade<Evento, String> filaPrioridadeH = new FilaPrioridadeHeap(new EventoComparator());

        filaPrioridadeH.insert(new Evento("E4", Date.parse("01/08/2020 02:01:03")), null);
        filaPrioridadeH.insert(new Evento("E6", Date.parse("01/08/2020 01:02:02")), null);
        filaPrioridadeH.insert(new Evento("E3", Date.parse("01/08/2021 01:02:02")), null);
        filaPrioridadeH.insert(new Evento("E7", Date.parse("01/08/2020 01:01:03")), null);
        filaPrioridadeH.insert(new Evento("E5", Date.parse("01/08/2020 01:03:02")), null);
        filaPrioridadeH.insert(new Evento("E2", Date.parse("01/09/2020 01:01:02")), null);
        filaPrioridadeH.insert(new Evento("E1", Date.parse("02/08/2020 01:01:03")), null);
        filaPrioridadeH.insert(new Evento("E8", Date.parse("01/08/2020 01:01:02")), null);

        assertEquals("[E8, E7, E6, E5, E4, E2, E1, E3]", removeEvents(filaPrioridadeH));
    }
}
