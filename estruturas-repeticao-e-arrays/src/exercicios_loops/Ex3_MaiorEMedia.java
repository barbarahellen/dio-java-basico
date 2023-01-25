package exercicios_loops;
import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia{
    public static void main(String[] args) {
        
        int numero;
        int maior = 0;
        int soma = 0;

        Scanner sc = new Scanner(System.in);

        int count = 0;
        do{
            System.out.print("digite um numero: ");
            numero = sc.nextInt();

            soma += numero;

            if(numero > maior){
                maior = numero;
            }

            count++;  
            
        } while(count < 5);
 
        
        /* 
        for(int i = 0; i < 5; i++){
            System.out.print("digite um numero: ");
            numero = sc.nextInt();

            soma = soma + numero;
            
            if(numero > maior)
                maior = numero;
            
        }
        */
        System.out.println("maior: " + maior);
        System.out.println("media: "+ soma/5);
    }
}