/* Leia um valor de área em metros quadrados m2 e apresenta-o convertido em hectares. 
 */
import java.util.Scanner;

public class ex16 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Digite o comprimento em metros quadrados: ");
        int mQuad = scanner.nextInt();

        double hec = mQuad * 0.0001;

        System.out.println ("O comprimento em hectares é "+hec);
    }
    
}
