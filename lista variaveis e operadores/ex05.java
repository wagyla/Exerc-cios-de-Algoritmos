/* Leia um número real e imprima a quinta parte deste número */
import java.util.Scanner;

public class ex05 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Digite um numero: ");
        float num = scanner.nextFloat();

        float quint = (num/5);

        System.out.println ("A quinta parte de "+num+ " é "+quint);
    }
    
}
