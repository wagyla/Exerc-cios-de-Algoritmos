/* Leia um valor de comprimento em polegadas e apresentado-o convertido em centímetros
 */
import java.util.Scanner;

public class ex14 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o comprimento em polegadas: ");
        double polegadas = scanner.nextDouble();

        double cent = polegadas * 2.54;

        System.out.println ("O comprimento em centímetros é "+cent);
    }
    
}
