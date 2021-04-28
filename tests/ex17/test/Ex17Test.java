package ex17.test;

import ex16.test.Ex16Test;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex17Test extends Ex16Test {
    @Test
    void test() {
        //R: /imgs/ex17.png

        Integer[] bucket = new Integer[11];

        for (int elemento : array) {
            int hash = calculateHash(elemento, array.size());

            int i = 1;

            while (bucket[hash] != null) {
                hash = (calculateHash(elemento, array.size()) + i) % array.size();
                i++;
            }

            bucket[hash] = elemento;
        }

        assertEquals("[13, 94, 39, 16, 5, 44, 88, 11, 12, 23, 20]", toString(Arrays.asList(bucket)));
    }
}
