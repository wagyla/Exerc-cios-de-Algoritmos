/* Escreva um programa que solicite dois números inteiros ao usuário e 
imprima o resultado da divisão inteira entre os números bem como o resto dessa divisão. */
import java.util.Scanner;

public class ex29 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite o primeiro numero: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int n2 = scanner.nextInt();

        int divInte = n1/n2;
        int divRest = n1% n2;

        System.out.println("O resultado da divisão é "+divInte);
        System.out.println("O resto da divisão é "+divRest);
    }
    
}
