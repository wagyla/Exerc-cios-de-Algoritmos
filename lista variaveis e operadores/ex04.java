/* Leia um número real e imprima o resultado do quadrado desse número */

import java.util.Scanner;

public class ex04 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Digite um numero: ");
        float num = scanner.nextFloat();

        float quadrado = (num * num);

        System.out.println ("O quadrado de "+num+ " é: "+ quadrado);
    }
}
