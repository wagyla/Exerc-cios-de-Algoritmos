/* Leia o valor do raio de um círculo e calcule e imprima a área do círculo correspondente. 
A área do círculo é π ∗ raio², considere π = 3,141592 */
import java.util.Scanner;

public class ex21 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do raio: ");
        int raio = scanner.nextInt();

        double area = 3.14159* (raio*raio);

        System.out.println("A área do circulo é "+area);
    }
    
}
