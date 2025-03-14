/* Leia um número inteiro e imprima a soma do sucessor de seu triplo com o antecessor de seu dobro. */
import java.util.Scanner;

public class ex20 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Digite um número inteiro: ");
        int n1 = scanner.nextInt();

        int sucesTriplo = (n1* 3) + 1;
        
        int anteDobro = (n1* 2) - 1;

        int soma = sucesTriplo + anteDobro ;

        System.out.println("O resultado é "+soma);
    }
}
