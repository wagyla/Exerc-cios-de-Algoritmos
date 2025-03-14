/* Sabendo que uma pedra cai com uma aceleração 20,2m/s2, faça um programa que solicite do usuário uma duração (tempo) 
em minutos e calcule a altura necessária para que ao ser largada a pedra caia e atinja o solo no tempo informado pelo usuário. */
import java.util.Scanner;

public class ex36 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a duração em minutos: ");
        double minutos = scanner.nextDouble();

        double segundos = minutos* 60;
        double aceler = 20.2;
        double tempoQuadra = segundos* segundos;

        double altura = 0.5 * aceler * tempoQuadra;

        System.out.println("A altura necessária para que a pedra caia em "+minutos+" minutos é "+altura);

    }
    
}
