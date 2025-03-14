/* Escreva um programa que solicite o nome, sobrenome, endereço, cidade e estado 
do usuário e em seguida imprima os dados como no exemplo abaixo: */
import java.util.Scanner;

public class ex37 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu endereço: ");
        String endereco = scanner.nextLine();

        System.out.println("Digite sua cidade: ");
        String cidade = scanner.nextLine();

        System.out.println("Digite seu estado: ");
        String estado = scanner.nextLine();

        System.out.println("Nome: "+nome+ "\nEndereço: "+endereco+ " - "+cidade+"- "+estado);

    }
    
}
