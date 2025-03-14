import java.util.Scanner;

public class ex11 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite a velocidade em m/s: ");
        double ms = scanner.nextDouble();

        double km = ms * 3.6;

        System.out.println ("A velocidade em km/h é "+km+"km/h");
    }    
}
