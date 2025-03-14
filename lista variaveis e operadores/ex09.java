/* Leia uma temperatura em graus Celsius e apresenta-a convertida em graus Kelvin. A fórmula de conversão é: 
𝐾 = 𝐶 + 273,15, sendo C a temperatura em Celsius e K a temperatura em Kelvin. */

import java.util.Scanner;

public class ex09 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println ("Digite a temperatura em Celsius: ");
        double cels = scanner.nextDouble();

        double kel = cels + 273.15;

        System.out.println ("A temperatura em Kelvin é: " +kel);
    }  
}
