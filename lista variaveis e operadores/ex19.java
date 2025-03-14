/* Leia um número inteiro e imprima o seu antecessor e o seu sucessor. */

import java.util.Scanner;

public class ex19 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Digite um número inteiro: ");
        int num = scanner.nextInt();
        int ante = num - 1;
        int suce = num + 1;
        
        System.out.println("O sucessor de "+num+" é "+suce+".");
        System.out.println("O antecessor de "+num+" é "+ante+".");
    }
    
}
