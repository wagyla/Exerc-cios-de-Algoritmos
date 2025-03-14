/* Leia uma velocidade em km/h (quilômetros por hora) e apresenta-a convertida em m/s (metros por segundo). A fórmula de conversão é: 
𝑀 = 𝐾/3.6, sendo K a velocidade em km/he M em m/s. */

import java.util.Scanner;

public class ex10 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Digite a velocidade em km/h: ");
        double km = scanner.nextDouble();

        double ms = km/3.6;

        System.out.printf ("A velocidade em m/s é "+ms);
    }
    
}
