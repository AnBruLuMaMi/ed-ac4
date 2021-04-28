package ex22.test;

import ac4.ex01.a.interfaces.IEntry;
import ac4.ex01.a.interfaces.IFilaPrioridade;
import ac4.ex01.c.FilaPrioridadeHeap;
import ac4.ex22.HashTable;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HashTableMapTest {
    private Object ordenarValues(Iterable<String> values) {
        String saida = "{";
        IFilaPrioridade<String, String> P = new FilaPrioridadeHeap();

        for (String ent : values) {
            P.insert(ent, ent);
        }

        IEntry<String, String> e;

        while (!P.isEmpty()) {
            e = P.removeMin();
            saida += e.getKey() + ", ";
        }

        return saida.substring(0, saida.length() - 2) + "}";
    }

    private Object ordenarKeys(Iterable<Integer> keySet) {
        String saida = "{";
        IFilaPrioridade<Integer, Integer> P = new FilaPrioridadeHeap();

        for (Integer ent : keySet) {
            P.insert(ent, ent);
        }

        IEntry<Integer, Integer> e;

        while (!P.isEmpty()) {
            e = P.removeMin();
            saida += e.getKey() + ", ";
        }

        return saida.substring(0, saida.length() - 2) + "}";
    }

    private String ordenar(Iterable<IEntry<Integer, String>> iterable) {
        String saida = "{";
        IFilaPrioridade<Integer, String> P = new FilaPrioridadeHeap();

        for (IEntry<Integer, String> ent : iterable) {
            P.insert(ent.getKey(), ent.getValue());
        }

        IEntry<Integer, String> e;

        while (!P.isEmpty()) {
            e = P.removeMin();
            saida += "(" + e.getKey() + "," + e.getValue() + "), ";
        }

        return saida.substring(0, saida.length() - 2) + "}";
    }

    @Test
    void test() {
        HashTable<Integer, String> mapa = new HashTable();

        assertTrue(mapa.isEmpty());
        assertNull(mapa.put(5, "A"));
        assertEquals("{(5,A)}", ordenar(mapa.entrySet()));
        assertNull(mapa.put(7, "B"));
        assertEquals("{(5,A), (7,B)}", ordenar(mapa.entrySet()));
        assertNull(mapa.put(2, "C"));
        assertEquals("{(2,C), (5,A), (7,B)}", ordenar(mapa.entrySet()));
        assertNull(mapa.put(8, "D"));
        assertEquals("{(2,C), (5,A), (7,B), (8,D)}", ordenar(mapa.entrySet()));
        assertNotNull(mapa.put(2, "E"));
        assertEquals("{(2,E), (5,A), (7,B), (8,D)}", ordenar(mapa.entrySet()));
        assertEquals("B", mapa.get(7));
        assertEquals("{(2,E), (5,A), (7,B), (8,D)}", ordenar(mapa.entrySet()));
        assertNull(mapa.get(4));
        assertEquals("{(2,E), (5,A), (7,B), (8,D)}", ordenar(mapa.entrySet()));
        assertEquals("E", mapa.get(2));
        assertEquals("{(2,E), (5,A), (7,B), (8,D)}", ordenar(mapa.entrySet()));
        assertEquals(4, mapa.size());
        assertEquals("{(2,E), (5,A), (7,B), (8,D)}", ordenar(mapa.entrySet()));
        assertEquals("A", mapa.remove(5));
        assertEquals("{(2,E), (7,B), (8,D)}", ordenar(mapa.entrySet()));
        assertEquals("E", mapa.remove(2));
        assertEquals("{(7,B), (8,D)}", ordenar(mapa.entrySet()));
        assertNull(mapa.get(2));
        assertFalse(mapa.isEmpty());
        assertEquals("{(7,B), (8,D)}", ordenar(mapa.entrySet()));
        assertEquals("{7, 8}", ordenarKeys(mapa.keySet()));
        assertEquals("{(7,B), (8,D)}", ordenar(mapa.entrySet()));
        assertEquals("{B, D}", ordenarValues(mapa.values()));
        assertEquals("{(7,B), (8,D)}", ordenar(mapa.entrySet()));
    }
}
