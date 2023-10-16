# Operadores:

São símbolos especiais, que tem um significado próprio para a linguagem e estão associados a determinadas operações.

### Classificação do operadores

- **Atribuição**
    - Representado pelo símbolo de igualdade `"=".`
    - O operador de atribuição é utilizado para definir o valor inicial ou sobrescrever o valor de uma variável. em Java, definimos um tipo, nome e opcionalmente atribuímos um valor à variável através do operador de atribuição. Exemplos abaixo:

    ```java

    String nome = "Bárbara";
    int idade = 22;
    double peso = 68.5;
    char sexo = "F";
    boolean conectado = true;
    Date dataNascimento = new Date();
    ```

- **Aritméticos**:
    - O operador aritmético, é utilizado para realizar operações matemáticas entre valores numéricos, podendo se tornar ou não uma expressão mais complexa.
    - Os operadores aritméticos são: `+` (adição), `-` (subtração), `*` (multiplicação) e `/` (divisão).

    **ATENÇÃO!** O operador de adição (+), quando utilizado em variáveis do tipo texto, realizará a “concatenação de textos”.

- **Unários**:

    Esses operadores, são aplicados juntamente com um outro operador aritmético. Eles realizam alguns trabalhos básicos como incrementar, decrementar, inverter valores numéricos e booleanos.

    (+) **Operador unário de valor positivo** – números são positivos sem esse operador explicitamente;

    (-) **Operador unário de valor negativo** – nega um número ou expressão aritmética;

    (++) **Operador unário de incremento de valor** – incrementa o valor em 1 unidade;

    (--) **Operador unário de decremento de valor** – decrementa o valor em 1 unidade;

    (!) **Operador unário lógico de negação** – nega o valor de uma expressão booleana.

    ```java
    int numero = 5;

    //Imprimindo o numero negativo
    System.out.println(- numero);

    //incrementando numero em mais 1 numero, imprime 6
    numero ++;
    System.out.println(numero);

    //incrementando numero em mais 1 numero, imprime 7
    System.out.println(numero ++);// ops algo de errado não está certo

    System.out.println(numero);// agora sim, numero virou 7

    //ordem de precedencia conta aqui
    System.out.println(++ numero);

    boolean verdadeiro = true;

    System.out.println("Inverteu " + !verdadeiro);
    ```


- **Ternário**

    O operador de condição ternária é uma forma resumida para definir uma condição e escolher por um dentre dois valores. Você deve pensar numa condição ternária, como se fosse uma condição IF normal, porém, de uma forma em que toda a sua estrutura estará escrita numa única linha.

    O operador ternário é representado pelos símbolos `"?" e ":"` utilizados na seguinte estrutura de sintaxe:

    `<Expressão Condicional>`` **?**``<Caso condição seja true>``**:** ``<Caso condição seja false>`

    ```java
    int a, b;

    a = 5;
    b = 6;

    /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
    if(a==b)
       resultado = "verdadeiro";
    else
       resultado = "falso";
    */

    //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
    String resultado = (a==b) ? "verdadeiro" : "false";

    System.out.println(valor);
    ```

- **Relacionais**:

    Os operadores relacionais, avaliam a relação entre duas variáveis ou expressões. Neste caso, mais precisamente, definem se o operando à esquerda é igual, diferente, menor, menor ou igual, maior, maior ou igual ao da direita, retornando um valor booleano como resultado.

    `==` Quando desejamos verificar se uma variável é IGUAL A outra.

    `!=` Quando desejamos verificar se uma variável é DIFERENTE da outra.

    `>` Quando desejamos verificar se uma variável é MAIOR QUE a outra.

    `>=` Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.

    `<` Quando desejamos verificar se uma variável é MENOR QUE outra.

    `<=` Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.


- **Lógicos**:

    Os operadores lógicos, representam o recurso que nos permite criar expressões lógicas maiores, a partir da junção de duas ou mais expressões.

    `&&` Operador Lógico "E"

    `||` Operador Lógico "OU"

    - curiosidades:
        - operadores bitwise: & e | — mexe com bits de números inteiros.
        - operadores shift: ~, >>, >>>, << — inverte os bits ou mexe com os 0 à esquerda ou direita.