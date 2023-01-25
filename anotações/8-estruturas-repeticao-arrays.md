# Estruturas de repetição

O real poder dos computadores está na sua habilidade de repetir uma operação ou uma série de operações várias vezes.

Cada repetição é chamada de laço (ou loop), e é um dos conceitos básicos da programação estruturada.

- **Uma estrutura de repetição permite que uma sequência de comandos seja executada repetidamente, caso determinadas condições sejam satisfeitas.**

essas condições são representadas por expressões lógicas

- As estruturas de repetição podem ser classificadas em:
    - Repetição com teste no início (while)
    - Repetição com teste no final (do-while)
    - Repetição contada (for)
- O comando **break** é utilizado para terminar de forma abrupta uma repetição.
- quando o comando **continue** é executado, os comandos restantes da repetição são ignorados e o programa volta a testar novamente ou não.  — muito pouco utilizado.

### Operadores de incremento e decremento:

- Pré-fixados

**para somar uma unidade ao valor da variável**: ++número;

**forma original**: 

número = número + 1;

retorne número;

**para subtrair uma unidade ao valor da variável**: —número;

**forma original**: 

número = número - 1;

retorne número;

- Pós-fixados

**Somar um ao valor da variável, retornando o valor original**: número++;

**Forma original:**

(retorne número)

número = número + 1; 

**Subtrair um do valor da variável, retornando o valor original**:     número—;

**Forma original:**

(retorne número)

número = número - 1; 

### Operações aritméticas:

**numero += k;** — somar k unidades ao valor da variável

**numero -= k;** — subtrair k unidades do valor da variável

**numero *= k;** —multiplicar o valor da variável por k

**numero /= k;** — dividir o valor da variável por k

### Arrays

Um array é um **objeto utilizado para armazenar sequencialmente dados do mesmo tipo**.

- Permanecem com o mesmo tamanho depois de criados.
    - array unidimensional
    - array bidimensional