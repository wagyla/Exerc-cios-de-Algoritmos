/* Leia o salário de um funcionário. Calcule e imprima o valor do novo salário, sabendo que ele recebeu um aumento de 25%. */
import java.util.Scanner;

public class ex23 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        double salario = scanner.nextDouble();
        double bonus = (salario * 25) / 100;
        double newSalario = salario + bonus;

        System.out.println("O novo salário é "+newSalario);


    }
    
}
