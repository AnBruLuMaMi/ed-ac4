package ex19.test;

import ex16.test.Ex16Test;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex19Test extends Ex16Test {

    int calculateHash2(int n) {
        return 7 * (n % 7);
    }

    @Test
    void test() {
        //R: /imgs/ex19.png

        Integer[] bucket = new Integer[11];

        for (int elemento : array) {
            int hash = calculateHash(elemento, array.size());

            int i = 1;

            while (bucket[hash] != null) {
                hash = (calculateHash(elemento, array.size()) + i * calculateHash2(elemento)) % array.size();
                i++;
            }

            bucket[hash] = elemento;
        }

        assertEquals("[13, 94, 39, 23, 5, 44, 88, 11, 12, 16, 20]", toString(Arrays.asList(bucket)));
    }
}
