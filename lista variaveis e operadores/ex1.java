/* Faça um programa que leia um número inteiro e a imprima. */

import java.util.Scanner;

public class ex1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Digite um numero inteiro: ");
        int num = scanner.nextInt();

        System.out.println ("Você digitou o número: " + num);
    }
    
}
