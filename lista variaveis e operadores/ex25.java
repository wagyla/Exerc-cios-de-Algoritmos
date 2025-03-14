/* Receba o salário-base de um funcionário. 
Calcule e imprima o salário a receber, sabendo-se que esse funcionário tem uma gratificação de 5% sobre o salário-base. 
Além disso, ele paga 7% de imposto sobre o salário-base. */
import java.util.Scanner;

public class ex25 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário: ");
        double salario = scanner.nextDouble();

        double gratificação = (salario* 5)/100;
        double imposto = (salario* 7)/100;
        double newSalario = (salario - imposto) + gratificação;

        System.out.println("O novo salário é R$"+newSalario);
    }
    
}
