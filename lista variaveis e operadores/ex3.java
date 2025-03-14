/* Peça ao usuário para digitar três valores inteiros e imprimir a soma deles. */

import java.util.Scanner;

public class ex3 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println ("Digite o primeiro numero: ");
        int n1 = scanner.nextInt();

        System.out.println ("Digite o segundo numero: ");
        int n2 = scanner.nextInt();

        System.out.println ("Digite o terceiro numero: ");
        int n3 = scanner.nextInt();

        int soma = (n1 + n2+ n3);

        System.out.println ("|A soma dos numeros é: " + soma);
    }
    
}
