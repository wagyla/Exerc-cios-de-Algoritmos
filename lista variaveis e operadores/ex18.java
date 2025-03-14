/* Faça a leitura de três valores e apresente como resultado a soma dos quadrados dos três valores lidos. */

import java.util.Scanner;

public class ex18 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite o segundo valor: ");
        int n2 = scanner.nextInt();

        System.out.println("Digite o terceiro valor: ");
        int n3 = scanner.nextInt();

        int quad1 = n1 * n1;
        int quad2 = n2 * n2;
        int quad3 = n3 * n3;
        int soma = quad1 + quad2 + quad3;

        System.out.println("A soma dos quadrados dos três valores é "+soma);

    }
    
}
