import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("digite o seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("digite sua altura: ");
        double altura = scanner.nextDouble();


        /* 
        //os argumentos começam com indice 0
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
        double altura = Double.valueOf(args[3]);
        */

        // imprimindo os dados inseridos pelo usuário:
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        
    }
}
