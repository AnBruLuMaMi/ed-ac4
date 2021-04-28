package ex07.test;

import org.junit.jupiter.api.Test;

public class Ex7Test {
    @Test
    void test() {
        /* R: Prefixado crescente: /imgs/ex07-prefixado-crescente.png.
              Prefixado decrescente: Como o menor número sempre está no topo do heap e o caminho prefixado começa pelo topo então não é possível
              fazer ordenação decrescente.
              Interfixado crescente: não é possível pois ele começa a percorrer pelos nodos mais externos da árvore, sendo que o heap mantém o menor valor no topo.
              Interfixado decrescente: Também não é possível pois sempre haverá um nodo maior entre o da esquerda e o da direita.
              Posfixado crescente: Como o menor número sempre está no topo do heap e o caminho posfixado começa pela parte mais externa da árvore então não é possível ordernar de forma crescente
              - Posfixado decrescente: /imgs/ex07-posfixado-decrescente.png.
         */
    }
}
