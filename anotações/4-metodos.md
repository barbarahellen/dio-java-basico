# Métodos:

Os métodos correspondem a **funções** ou **sub-rotinas** disponíveis dentro de nossas classes.

- **Critério de nomeação de Métodos**
    - Deve ser nomeado como verbo;
    - Seguir o padrão camelCase (Todas as letras minúsculas com a exceção da primeira letra da segunda palavra).

Todos os **métodos** devem SEMPRE ser definidos dentro de uma classe.

Essa convenção é determinada pelos aspectos abaixo:

1. **Qual a proposta principal do método?** Você deve se perguntar constantemente até compreender a real finalidade do mesmo.
2. **Qual o tipo de retorno esperado após executar o método?** Você deve analisar se o método será responsável por retornar algum valor ou não.

Caso o método não retorne nenhum valor, ele será representado pela palavra-chave `void`.

1. **Quais os parâmetros serão necessários para execução do método?** Os métodos às vezes precisarão de argumentos como critérios para a execução.
2. **O método possui o risco de apresentar alguma exceção?** Exceções são comuns na execução de métodos, as vezes é necessário prever e tratar a possível existência de uma exceção.
3. **Qual a visibilidade do método?** Avaliar se será necessário que o método seja visível a toda aplicação, somente em pacotes, através de herança ou somente a nível a própria classe.

```
public class MyClass {
	
	public double somar(int num1, int num2){
		//LOGICA - FINALIDADE DO MÉTODO
		return ... ;
	}
	
	public void imprimir(String texto){
		//LOGICA - FINALIDADE DO MÉTODO
		//AQUI NÃO PRECISA DO RETURN
		//POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
	}
	
	public double dividir(int dividendo, int divisor) throws Exception{
		// indica que o método a aser utilizado poderá gerar uma exceção
	}
}
```