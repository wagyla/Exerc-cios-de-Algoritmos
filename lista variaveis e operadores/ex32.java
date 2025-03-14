/* Escreva um programa que solicite do usuário o valor da cotação do dólar em reais, 
e um determinado valor em real, faça a conversão do valor em real para dólar e imprima o resultado. */
import java.util.Scanner;

public class ex32 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a cotação do dolar com virgula: ");
        double dolar = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Digite o valor em real: ");
        double real = scanner.nextDouble();

        scanner.nextLine();

        double conver = real/dolar;
        System.out.println("O valor em dólar é "+conver);
    }
    
}
