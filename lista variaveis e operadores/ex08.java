/* Leia uma temperatura em graus Kelvin e apresenta-a convertida em graus Celsius */

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite a temperatura em Kelvin: ");
        double kel = scanner.nextDouble();

        double cels = kel - 273.15;
        System.out.println ("A temperatura em Celsius é: "+cels);
    }
    
}
