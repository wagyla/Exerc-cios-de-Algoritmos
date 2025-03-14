/* Faça um programa que leia o valor de um produto e imprima o valor com desconto, tendo em vista que o desconto foi de 12% */
import java.util.Scanner;

public class ex22 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor do produto: ");
        double valor = scanner.nextDouble();

        double desc = (valor* 12)/100;
        double descFim = valor - desc;

        System.out.println("O valor do produto com desconto é: "+descFim);
    }
    
}
