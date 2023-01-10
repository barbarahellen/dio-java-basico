# Aprendendo a sintaxe Java

### Anatomia das classes:

A escrita de códigos de um programa é feita através da composição de, palavras pré-definidas pela linguagem, com as expressões que utilizamos para determinar o nome do nossos arquivos, classes, atributos e métodos.

```java
public class MinhaClasse {
    // corpo da classe
		public static void main(String[] args){
			// corpo do método main
		}
}
```

- 99,9% das nossas classes iniciarão com `public class;`
- Toda classe precisa de nome, exemplo `MinhaClasse;`
- O nome do arquivo deve ser idêntico ao nome da classe pública;
- Após o nome, definir o corpo `{ }` , onde iremos compor nossas classes com atributos e métodos.
- Dentro de uma aplicação, **recomenda-se que somente uma classe possua o método** `main`, responsável por iniciar todo o nosso programa.
- O método main recebe seu nome `main`, sempre terá a visibilidade `public`, será definido como `static`, não retornará nenhum valor com `void` e receberá um parâmetro do tipo array de caracteres `String[]`.

### Padrão de nomenclatura:

- **Arquivo .java**: Todo arquivo .java deve começar com letra MAIÚSCULA. Se a palavra for composta, a segunda palavra deve também ser maiúscula, exemplo:`Calculadora.java`, `CalculadoraCientifica.java`
- **Nome da classe no arquivo**: A classe deve possuir o mesmo nome do arquivo.java, exemplo:
    
    ```java
    public class CalculadoraCientifica {
        
    }
    ```
    
- **Nome de variável**
Toda variável deve ser escrita com letra minúscula, porém se a palavra for composta, a primeira letra da segunda palavra deverá ser MAIÚSCULA, exemplo: `ano`e `anoFabricacao` . O nome dessa prática para nomear variáveis dessa forma se chama "camelCase".

- Existe uma regra adicional para variáveis quando queremos identificar que ela não sofrerá alteração de valor, exemplo: queremos determinar que uma variável de nome **br** sempre representará **"Brasil"** e nunca mudará seu valor, logo determinamos como escrita o código abaixo:

```java
String BR = "Brasil";
    double PI = 3.14;
    int ESTADOS_BRASILEIROS = 27;
    int ANO_2000 = 2000;
```

### Declarando variáveis e métodos:

- **Variáveis**

```java
Tipo NomeBemDefinido = Atribuicao (opcional em alguns casos)

// Exemplo

int idade = 23;
double altura = 1.62;
Dog spike; // aqui a variável spike não tem valor, é normal
```

- **Métodos**
    - Devem ser nomeados como verbos, através de uma mistura de letras minúsculas e maiúsculas. Em princípio todas as letras que compõem o nome devem ser mantidas em minúsculo, com exceção da primeira letra de cada palavra composta, a partir da segunda palavra.