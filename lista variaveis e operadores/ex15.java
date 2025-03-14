/* Leia um valor de comprimento em centímetros e apresentado-o convertido em polegadas.  */

import java.util.Scanner;

public class ex15 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Digite o comprimento em centímetros: ");
        double cent = scanner.nextDouble();

        double polegadas = cent/2.54;

        System.out.println ("O comprimento em polegadas é "+polegadas);

    }
    
}
