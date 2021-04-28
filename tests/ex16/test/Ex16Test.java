package ex16.test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex16Test {
    protected List<Integer> array = Arrays.asList(12, 44, 13, 88, 23, 94, 11, 39, 20, 16, 5);

    protected int calculateHash(int n, int size) {
        return (3 * n + 5) % size;
    }

    protected String toString2(ArrayList[] a) {
        String s = "";

        for (ArrayList<Integer> e : a) {
            if (e == null) {
                s += "null";
                s += ", ";
                continue;
            }

            s += toString(e);
            s += ", ";
        }

        return "[" + s.substring(0, s.length() - 2) + "]";
    }

    protected String toString(List<Integer> a) {
        String s = "";

        for (Integer e : a) {
            if (e == null) {
                s += "null";
                s += ", ";
                continue;
            }

            s += e;
            s += ", ";
        }

        return "[" + s.substring(0, s.length() - 2) + "]";
    }

    @Test
    void test() {
        //R: /imgs/ex16.png

        ArrayList[] bucket = new ArrayList[11];

        for (int elemento : array) {
            int hash = calculateHash(elemento, array.size());

            ArrayList<Integer> ref = bucket[hash];

            if (ref == null)
                ref = new ArrayList<>();

            ref.add(elemento);
            bucket[hash] = ref;
        }

        assertEquals("[[13], [94, 39], null, null, null, [44, 88, 11], null, null, [12, 23], [16, 5], [20]]", toString2(bucket));
    }
}
