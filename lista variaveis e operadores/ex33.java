/* Faça um programa que receba uma quantidade de minutos e imprima o equivalente em horas. */
import java.util.Scanner;

public class ex33 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de minutos: ");
        double minutos = scanner.nextDouble();
        double horas = minutos/60;

        System.out.println(minutos+" minutos equivale a "+horas+" horas.");

    }
    
}
