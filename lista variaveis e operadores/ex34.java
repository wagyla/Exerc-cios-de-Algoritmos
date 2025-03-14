/* Faça um programa que receba uma quantidade de horas e imprima o equivalente em segundos. */
import java.util.Scanner;

public class ex34 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de horas: ");
        int horas = scanner.nextInt();
        int segundo = horas* 3600;

        System.out.println(horas+" horas equivale a "+segundo+" segundos");

    }
    
}
