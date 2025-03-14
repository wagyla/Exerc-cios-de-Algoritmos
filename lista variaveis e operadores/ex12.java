/* Leia um ângulo em graus e apresenta-o convertido em radianos. A fórmula de conversão é:
$$ 𝑅 = 𝐺 ∗ \frac{𝜋}{180} $$ , sendo G o angulo em graus e R em radianos e π = 3,14. */

import java.util.Scanner;

public class ex12 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Digite o ângulo em graus: ");
        double graus = scanner.nextDouble();

        double radianos = graus * (3.14159/180);

        System.out.println ("O ângulo em Radianos é "+radianos);
    }
    
}
