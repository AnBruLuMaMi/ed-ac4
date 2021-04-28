## Membros do Grupo   

| Nome                            | RA |
|--------------------------------|--------- |
| André Lucas Fabbris de Toledo   | 1902777 |
| Bruno Alkimim de Negreiros      | 1902646 |
| Lucas de Alencar Silva          | 1902989 |
| Mariana Rodrigues Zubi da Silva | 1904204 |
| Milena Bispo Gomes              | 1904052 |
    
# AC3 - Estrutura de Dados
1. Implemente e teste:
    - a) TAD Fila de Prioridade baseado em lista (slides de 21 a 31)<br>***R:** /tests/ex01.a.test*
    - b) TAD Árvore Binária Completa (Slides de 40 a 47)<br>***R:** /tests/ex01.b.test*
    - c) TAD Fila de Prioridade usando Heap (slides de 75 a 79)<br>***R:** /tests/ex01.c.test*
    - d) Um método que ordene (9, 1, 3, 6, 2, 7, 8) usando TAD Fila de Prioridade usando Heap.<br>***R:** /tests/ex01.d.test*
2. Qual é a saída (desenho do heap) da seguinte sequência de métodos do TAD fila de prioridade: insert(5, A), insert(4, B), insert(7, I), insert(1, D), removeMin( ), insert(3, J), insert(6, L), removeMin( ), removeMin( ), insert(8, G), removeMin( ), insert(2, H), removeMin(), removeMin()?
    - Monte a fila de prioridade na mão e compare rodando um teste.<br>***R:** Passo-a-passo desenhado em: /imgs/ex02.png e testes em /tests/ex02.a.test*
3. Um aeroporto quer simular o tráfego aéreo com eventos como decolagens e pousos.
Os eventos têm um time-stamp com a hora em que o evento acontece. O simulador
deve realizar eficientemente as duas operações fundamentais a seguir:
    - a) inserir um evento com um dado time-stamp (ou seja, inserir um evento futuro);
    - b) extrair o evento com menor time-stamp (ou seja, determinar o próximo evento a processar);
Que estrutura de dados você usaria para suportar essas operações? Justifique sua
resposta.
***R:** A estrutura mais eficiente é uma Fila de Prioridade baseada em Heap. Pois com ela podemos utilizar um comparador personalizado que sempre verifique qual timestamp é o menor e mantenha-o na raiz da árvore. Para então quando precisar processar o evento, remover o que possuir o menor timestamp utilizando o método "removemin"*
4. Onde pode estar armazenado o elemento com a maior chave em um heap?<br>***R:** O elemento com menor a chave (maior prioridade) estará na raiz da árvore do heap. E o elemento com a maior chave (menor prioridade) estará em algum nodo externo da árvore.*
5. Seja T uma árvore binária completa em que v armazena a entrada (p(v),0), onde p(v) é o número do nível de v. A árvore T é um heap? Justifique sua resposta.
6. Explique por que não se considera o caso do filho direito de r ser interno e o filho esquerdo ser externo quando se descreve o processo do down-heap bubbling.<br>***R:** Pois os elementos são adicionados da esquerda para a direita na árvore, ou seja, para que o filho de r a direita seja interno é necessário primeiramente adicionar um filho no da esquerda. O filho da esquerda tem que ser interno para que o da direita possa ser interno também.*
7. Existe um heap T armazenando sete elementos diferentes de forma que um caminhamento prefixado de T apresente os elementos de T em ordem crescente ou
decrescente? E se for um caminhamento interfixado? E pós -fixado? Se sim, apresente um exemplo; caso contrário, justifique.<br>***R:** 
 - Prefixado crescente: /imgs/ex07-prefixado-crescente.png. 
 - Prefixado decrescente: Como o menor número sempre está no topo do heap e o caminho prefixado começa pelo topo então não é possível fazer ordenação decrescente. 
 - Interfixado crescente: não é possível pois ele começa a percorrer pelos nodos mais externos da árvore, sendo que o heap mantém o menor valor no topo. 
 - Interfixado decrescente: Também não é possível pois sempre haverá um nodo maior entre o da esquerda e o da direita. *
 - Posfixado crescente: Como o menor número sempre está no topo do heap e o caminho posfixado começa pela parte mais externa da árvore então não é possível ordernar de forma crescente.
 - Posfixado decrescente: /imgs/ex07-posfixado-decrescente.png. 
8. Considere H um heap que armazena 15 elementos usando uma representação de arranjo de uma árvore binária completa. Qual é a sequência de índices da lista de arranjo que são visitados no caminhamento prefixado de H? E qual é a sequência em um caminhamento interfixado? E em um caminhamento pós-fixado?<br>***R:** A sequencia de índices é:
 - prefixado: [1, 2, 4, 8, 9, 5, 10, 11, 3, 6, 12, 13, 7, 14, 15]
 - interfixado: [8, 4, 9, 2, 10, 5, 11, 1, 12, 6, 13, 3, 14, 7, 15]
 - posfixado: [8, 9, 4, 10, 11, 5, 2, 12, 13, 6, 14, 15, 7, 3, 1] *
9. Bill afirma que um caminhamento prefixado em um heap listará as chaves em ordem não-decrescente. Apresente um exemplo de um heap que prove que ele está errado.<br>***R:** O heap a seguir refuta o argumento de Bill /imgs/ex09-10.png *
10. Hillary afirma que um caminhamento pós-fixado em um heap listará as chaves em ordem não-crescente. Apresente um exemplo de um heap que prove que ela está errada.<br>***R:** O heap do exercício anterior também refuta o argumento de Hillary. *
11. Apresente todos os passos do algoritmo para remover a chave 16 do heap abaixo: <br>***R:** /img/ex11.png *
12. Mostre como implementar o TAD pilha usando apenas uma fila de prioridade e uma variável inteira adicional.<br>***R:** /tests/ex12.test *
13. Mostre como implementar o TAD fila (padrão) usando apenas uma fila de prioridade e uma variável inteira adicional.<br>***R:** /tests/ex013.test *
14. Qual dos esquemas de tratamento de colisão de tabela hash consegue tolerar um fator de carga superior a 1 e qual não consegue?<br>***R:** O esquema de tratamento de colisão que consegue tolerar carga superior a 1 é o encadeamento separado. O esquema que não consegue é o endereçamento aberto.*
15. Qual seria um bom código hash para um número de identificação de veículo que é uma cadeia de caracteres representando números e letras no formato “9X9XX99X9XX999999,” onde um “9” representa um dígito e um “X” representa uma letra?
16. Desenhe a tabela hash com 11 elementos, que resulta a partir do uso da função de hash, h(i) = (3i + 5) mod 11, para colocar as chaves 12, 44, 13, 88, 23, 94, 11, 39, 20, 16 e 5, assumindo que as colisões serão tratadas por encadeamento. <br>***R:** /imgs/ex16.png*
17. Qual será o resultado do exercício 3 se assumirmos que as colisões serão tratadas por teste linear?<br>***R:** /imgs/ex17.png*
18. Mostre o resultado do exercício 3 assumindo que as colisões são tratadas por teste quadrático, até o ponto em que o método falha.<br>***R:** /imgs/ex18.png*
19. Qual é o resultado do exercício 3 assumindo que as colisões são tratadas por hashing duplo usando uma função hash secundária h’(k)=7 (k mod 7)?<br>***R:** /imgs/ex19.png*
20. Forneça uma descrição em pseudocódigo da inserção em uma tabela hash que usa teste quadrático para resolver colisões, assumindo que se usa o truque de substituir elementos deletados com um objeto indicando “item desativado”.
21. Pesquise sobre o TAD Dicionário e descreva a principal diferença desse TAD com o TAD Mapa.<br>***R:** A principal diferença é que o mapa terá apenas uma entrada para uma chave, já o dicionário pode ter várias entradas em uma única chave.*
22. Implemente e teste o HashTableMap considerando os slides de 66 a 72.<br>***R:** /tests/ex22.test *

