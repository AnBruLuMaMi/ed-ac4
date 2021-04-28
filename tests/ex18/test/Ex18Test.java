package ex18.test;

import ex16.test.Ex16Test;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex18Test extends Ex16Test {
    @Test
    void test() {
        //R: /imgs/ex18.png
        Integer[] bucket = new Integer[11];

        try
        {
            for (int elemento : array) {
                int hash = calculateHash(elemento, array.size());

                int i = 1;

                while (bucket[hash] != null) {
                    hash = (calculateHash(elemento, array.size()) + (i * i)) % array.size();
                    i++;
                }

                bucket[hash] = elemento;
            }
        } catch (Exception e) {

        }

        assertEquals("[13, 94, 39, 11, null, 44, 88, 16, 12, 23, 20]", toString(Arrays.asList(bucket)));
    }
}
