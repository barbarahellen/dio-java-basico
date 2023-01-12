# **Documentação**

Uma das maiores características da linguagem Java é que, desde suas primeiras versões, tínhamos em nossas mãos, uma documentação rica e detalhada dos recursos da linguagem.

Conforme site oficial, podemos compreender e explorar, todos os recursos organizados por pacotes e classes bem específicas, sem nem mesmo escrever uma linha de código.

Hoje, costuma-se afirmar que, para se tornar um desenvolvedor nível avançado, é um requisito imprescindível adquirir a habilidade de compreender, a documentação oficial da linguagem e dos frameworks que são incorporados nos projetos atuais.

 → link da documentação de uma das principais classes da linguagem Java: **[String (Java Platform SE 7 )](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)**

## **Tags**

Mas e quais as informações, que obtemos através de classes documentadas, na linguagem ? Java Documentation é composto por tags que, representam dados relevantes para a compreensão da proposta de uma classe e os conjuntos de seus métodos e atributos conforme tabela abaixo:

Tag	     |   Descrição
------------- --------------------------------------------------------
@autor	     |   Autor / Criador
@version     |   Versão do recurso disponibilizado
@since	     |	Versão / Data de início da disponibilização do recurso
@param	     |	Descrição dos parâmetros dos métodos criados
@return	     |	Definição do tipo de retorno de um método
@throws	     |	Se o método lança alguma exceção

## Terminal

Vamos ilustrar como executar uma classe, depois de compilada, sem precisar usar a IDE.

1. Abra o MS-DOS ou Power Shell;
2. Localize o diretório do seu projeto: **`cd C:\estudos\dio-trilha-java-basico\java-terminal**;`
3. Acesse a pasta na qual está o arquivo e digite `**javac nomeDaClasse**` para compilar.
4. Agora digite o comando:`**java NomeDaClasse**` *(sem a extensão .**class**).*

## Argumentos

Quando executamos uma classe, que contenha o método main, o mesmo permite que passemos um array `[]` de argumentos, do tipo String. Logo, podemos após a definição da classe a ser executada, informar estes parâmetros, exemplo:

java MinhaClasse agumentoUm argumentoDois

Exemplo:

```java
public class AboutMe {

	public static void main(String[] args) {
	
	//os argumentos começam com indice 0
	
	String nome = args [0];
	
	String sobrenome = args [1];
	
	int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
	
	double altura = Double.valueOf(args[3]);
	
	System.out.println("Ola, me chamo " + nome + " " + sobrenome);
	
	System.out.println("Tenho " + idade + " anos ");
	
	System.out.println("Minha altura é " + altura + "cm ");
	
	}

}
```

## Scanner

Nos exemplos anteriores, percebemos que podemos receber, dados digitados pelo usuário do nosso sistema, porém, tudo precisa estar em uma linha e também é necessário informar os valores nas posições correspondentes. Esta abordagem pode deixar margens de execução, com erro do nosso programa. Para isso, com a finalidade de deixar as nossas entradas de dados mais seguras, agora vamos receber estes dados via **Scanner**.

A classe **Scanner,** permite que o usuário tenha, uma interação mais assertiva com o nosso programa, veja como vamos mudar o nosso programa **`AboutMe`** para deixar mais intuitivo aos usuários:
```
import java.util.Locale;

import java.util.Scanner;

public class AboutMe {

	public static void main(String[] args) {
	
	//criando o objeto scanner
	
	Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
	
	System.out.println("Digite seu nome");
	
	String nome = scanner.next();
	
	System.out.println("Digite seu sobrenome");
	
	String sobrenome = scanner.next();
	
	System.out.println("Digite sua idade");
	
	int idade = scanner.nextInt();
	
	System.out.println("Digite sua altura");
	
	double altura = scanner.nextDouble();
	
	//imprimindo os dados obtidos pelo usuario
	
	System.out.println("Ola, me chamo " + nome + " " + sobrenome);
	
	System.out.println("Tenho " + idade + " anos ");
	
	System.out.println("Minha altura é " + altura + "cm ");
	
	}

}
```