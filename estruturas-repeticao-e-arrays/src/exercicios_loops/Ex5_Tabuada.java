package exercicios_loops;
import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/
public class Ex5_Tabuada {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.print("digite o numero que vc deseja ver a tabuada: ");
        numero = sc.nextInt();

        for(int i = 0; i < 11; i++){
            System.out.println(numero + " X " + i + " = " + (numero * i) );
        }
    }
}
