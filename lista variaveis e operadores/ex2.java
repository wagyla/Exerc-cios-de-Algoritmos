/* Faça um programa que leia um número real e o imprima. */

import java.util.Scanner;

public class ex2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println ("Digite um numero real com vírgula: ");
        Float n1 = scanner.nextFloat();

        System.out.println("Você digitou o numero: "+ n1);
    }
}
