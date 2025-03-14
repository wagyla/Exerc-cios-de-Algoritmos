/* Faça um programa para converter uma letra maiúscula em letra minúscula. */
import java.util.Scanner;

public class ex27 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma letra MAIUSCULA: ");
        String letra = scanner.nextLine().toLowerCase();

        System.out.println("A letra é "+letra);
    }
    
}
