import java.util.Scanner;

public class ex17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println ("Digite o comprimento em hectares: ");
        int hec = scanner.nextInt();

        int mQuad = hec * 10000;

        System.out.println("O comprimento em metros é "+mQuad);

    }
    
}
