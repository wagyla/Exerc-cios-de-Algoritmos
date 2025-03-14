/* Leia uma temperatura em graus Celsius e apresenta-a convertida em graus Fahrenheit. A fórmula de conversão é:
𝐹 = 𝐶 * 9/5 + 32,0, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius. */
import java.util.Scanner;

public class ex06 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println ("Digite a temperatura em Celcius: ");
        int celc = scanner.nextInt();

        int fahr = celc * 9/5 + 32;

        System.out.println ("A temperatura Fahrenheit é: " +fahr);
    }
    
}
