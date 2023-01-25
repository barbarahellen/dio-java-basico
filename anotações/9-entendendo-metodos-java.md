# Entendendo métodos Java

## Criação de métodos:

Método é uma porção de código (sub-rotina) que é disponibilizada por uma classe. Este é executado quando é feita uma requisição a ele. São responsáveis por definir e realizar um determinado comportamento.

- Padrão de definição:

<visibilidade> <tipo> <modificador> **retorno**

**nome**(<parâmetros>) <exceções> **corpo**

** itens em negrito são obrigatórios.

onde:

- **visibilidade** — pode ser “public”, “protected” ou “private”.
- tipo — concreto ou abstrato
- modificador — “static” ou “final”
- **retorno** — tipo de dado (int, long, float…) ou void
- **Nome** — nome que é fornecido ao método
- **Parâmetros** — que podem receber
- Exceções — que podem lançar
- **Código** — que possui ou vazio

**Exemplos:**
```
public String getNome(){…}

public double calcularTotalNota(){…}

public int verificarDistancia(int coordenada1, int coordenada2){…}

pubblic abstract void executar();

public void alterarFabricante(Fabricante fabricante){…}

public Relatorio gerarDadosAnaliticos(Cliente cliente){…}
```

### Utilização:

Passa-se uma mensagem através de uma classe ou objeto.

nome_da_classe.nome_do_metodo(); ou nome_da_classe.nome_do_metodo(…);

nome_do_objeto.nome_do_metodo(); ou nome_do_objeto.nome_do._metodo(…);

Math.random(); ou Math.sqrt(4);

usuario.getEmail(); ou usuario.alterarEndereco(endereco); 

### Particularidades:

**Assinatura**: é a forma de identificar unicamente o método, sendo igual ao nome + parâmetros.

- **Método:**

public double calcularTotalVenda(double precoItem1, double precoItem2, double precoItem3){…}

- **Assinatura:**

calcularTotalvenda(double precoItem1, double precoItem2, double precoItem3)

- **Construtor e Destrutor:** são métodos especiais usados na orientação a objetos.
- **Mensagem:** é o ato de solicitar ao método que ele execute. Esta pode ser direcionada a um objeto ou a uma classe.
- **Passagem de parâmetros:**
    - Por valor (cópia)
        
        ```java
        int i = 10;
        public void fazerAlgo(int i){
        	i = i + 10;
          System.out.println("valor de i dentro: " + i); // mostra 20
        }
        System.out.println("valor de i fora: " + i); // mostra 10
        
        ```
        
    - Por referência (endereço)
    

### Boas práticas:

- nomes devem ser descritivos, mas curtos.
- notação camelCase.
- deve possuir entre 80 e 120 linhas.
- evite lista de parâmetros longas.
- visibilidades adequadas.

# Sobrecarga

é a capacidade de definir métodos para diferentes contextos, mas preservando o seu nome, ou seja, altera a assinatura do método: nome + parâmetros

### **Criação (exemplos)**:

```java
converterParaInteiro(float f);

converterParaInteiro(double d);

converterParaInteiro(String s);

converterParaInteiro(float f, RoundType rd);  // RoundType serve para arredondar para baixo ou para cima

converterParaInteiro(double d, RoundType rd);

converterParaInteiro(String s , RoundType rd);

converterParaInteiro(RoundType rd, String s);

converterParaInteiro();
```

## Uso de retornos:

O método executa seu retorno quando:

- completa todas as suas instruções internas
- chega a uma declaração explícita de retorno
- lança uma exceção

O tipo de retorno do método é definido na sua criação e pode ser um tipo primitivo ou objeto.

O tipo de dado do return deve ser compatível com o do método

Se o método for sem retorno (void), pode ou não ter um “return” para encerrar sua execução.

exemplos:
```java
public String getMensagem(){
	return "olá!";
}

public double getJuros(){
	return 2.36;
}

public int getParcelas(){
	return 1.36f   // não é compatível
}

public void setIdade(){
	return 10;  // não é compatível
}

public void executar(){
	....
	return;    // se o método for void, pode ou não ter o return
	....
}
```