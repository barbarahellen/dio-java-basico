package exercicios_loops;
import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar{
    public static void main(String[] args) {

        int numero = 0;
        int qtdNumeros;
        int qtdPares = 0, qtdImpares = 0;

        Scanner sc = new Scanner(System.in);

        // usando do-while
        System.out.println("digite a quantidade de numeros a ser lida: ");
        qtdNumeros = sc.nextInt();

        int count = 0;
        do{
            System.out.println("número: ");
            numero = sc.nextInt();
            count++;

            if(numero % 2 == 0)
                qtdPares++;
            else qtdImpares++;

        } while(count < qtdNumeros);

        /* 
        // usando for
        System.out.println("digite a quantidade de numeros a ser lida: ");
        qtdNumeros = sc.nextInt();

        for(int i = 0; i < qtdNumeros; i++){
            System.out.print("numero: ");
            numero = sc.nextInt();

            if(numero % 2 == 0)
                qtdPares++;
            else qtdImpares++;
        }
        */
        System.out.println("quantidade de pares: " + qtdPares);
        System.out.println("quantidade de impares: " + qtdImpares);

    }
}