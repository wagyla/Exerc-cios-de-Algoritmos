/* Leia uma temperatura em graus Fahrenheit e apresenta-a convertida em graus Celsius. */
import java.util.Scanner;

public class ex07 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println ("Digite a temperatura em Fahrenheit: ");
        double fah = scanner.nextDouble();

        double cel = (5.0/9.0) * (fah - 32);

        System.out.println ("A temperatura em Celsius é: "+cel);
    }
}
