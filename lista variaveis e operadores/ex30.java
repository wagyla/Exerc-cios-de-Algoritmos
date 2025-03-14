/* Escreva um programa que solicite do usuário quatro notas de um aluno e imprima a média das notas. */
import java.util.Scanner;

public class ex30 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.println("A média das notas é "+media);
    }
    
}
