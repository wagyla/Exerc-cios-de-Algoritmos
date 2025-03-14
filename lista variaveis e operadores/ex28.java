/* Escreva um programa que leia as coordenadas x e y de pontos no R2 e calcule sua distância da origem (0,0). 
Use Math.sqrt(...) para calcular a raiz quadrada. */

import java.util.Scanner;

public class ex28 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a coordenada x: ");
        int x = scanner.nextInt();

        System.out.println("Digite a coordenada y: ");
        int y = scanner.nextInt();

        int somaRaiz = (y*y) + (x*x);

        double raizQuadrada = Math.sqrt(somaRaiz);

        System.out.println("A distancia de origem é "+raizQuadrada);
    }
    
}