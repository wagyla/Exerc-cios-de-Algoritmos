/* Leia um ângulo em radianos e apresenta-o convertido em graus.  */

import java.util.Scanner;

public class ex13 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite o ângulo em radianos: ");
        double radianos = scanner.nextDouble();

        double graus = radianos * (180/3.14159);

        System.out.println ("O ângulo em graus é "+graus);
    }
    
}
