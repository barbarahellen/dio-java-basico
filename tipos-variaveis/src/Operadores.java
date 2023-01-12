public class Operadores {
    public static void main(String[] args) {

        // Operador aritmético (caso de concatenação)

        String nomeCompleto = "LINGUAGEM " + "JAVA";
		System.out.println(nomeCompleto);

        //qual o resultado das expressoes abaixo?
        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao); // 31

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao); // 1111

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao); // 1111

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao); // 1111

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao); // 13


        // --------------------------------------------------

        // Operador Unário

        int numero = 5;

        numero = - numero;
            
        //Imprimindo o numero negativo
        System.out.println(numero);

        //incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);

        //incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

        //ordem de precedencia conta aqui
        System.out.println(++ numero);


        boolean variavel = true;
       
        System.out.println("Inverteu " + !variavel);



        // ---------------------------------------------------------

        // Operador Ternário

        int a, b;

        a = 5;
        b = 6;

        /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
            if(a==b)
                resultado = "verdadeiro";
            else
                resultado = "falso";
        */

        // Mesma condicional, mas dessa vez, utilizando o operador ternário.
        String resultado = (a==b) ? "verdadeiro" : "false";

        System.out.println(resultado);


        // --------------------------------------------------------

        // Operadores Lógicos

        boolean condicao1 = true;

        boolean condicao2 = false;

        /* Aqui estamos utilizando o operador lógico E para fazer a união de duas expressões.

        É como se estivesse escrito:

        "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
        */

        if(condicao1 && condicao2)
            System.out.print("Os dois valores precisam ser verdadeiros");

        //Se condicao1 OU condicao2 for verdadeira, executar código.
        if(condicao1 || condicao2)
            System.out.print("Um dos valores precisa ser verdadeiro");



        // --------------------------------------------------------



        // Operadores relacionais

        if(condicao1 && condicao2)

        System.out.print("Os dois valores precisam ser verdadeiros");;

        //Se condicao1 OU condicao2 for verdadeira, executar código.

        if(condicao1 || condicao2)

        System.out.print("Um dos valores precisa ser verdadeiro");


        int numero1 = 1;
        int numero2 = 2;

        if(numero1 > numero2)
            System.out.print("Numero 1 maior que numero 2");

        if(numero1 < numero2)
            System.out.print("Numero 1 menor que numero 2");

        if(numero1 >= numero2)
            System.out.print("Numero 1 maior ou igual que numero 2");

        if(numero1 <= numero2)
            System.out.print("Numero 1 menor ou igual que numero 2");

        if(numero1 != numero2)
            System.out.print("Numero 1 é diferente de numero 2");


        // comparação de objetos

        String nomeUm = "barbara";
        String nomeDois = new String("barbara");
        System.out.println(nomeUm.equals(nomeDois));      //método equals compara os conteúdos dos objetos 
    }
    
}
