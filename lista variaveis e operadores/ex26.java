/* Escreva um programa de ajuda para vendedores. 
A partir de um valor total lido, mostre: - O total a pagar com desconto de 10%; 
- O valor de cada parcela, no parcelamento de 3× sem juros; 
- A comissão do vendedor, no caso da venda ser a vista (5% sobre o valor com desconto) 
- A comissão do vendedor, no caso da venda ser parcelada (5% sobre o valor total)  */
import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor da compra: ");
        double compra = scanner.nextDouble();
        
        // Cálculo do valor com desconto de 10%
        double descVista = (compra * 10) / 100;
        double valorVista = compra - descVista;

        // Cálculo do valor de cada parcela (3x sem juros)
        double parcela = compra / 3;
        
        // Cálculo da comissão do vendedor para venda à vista (5% sobre o valor com desconto)
        double comisVista = (valorVista * 5) / 100;
        
        // Cálculo da comissão do vendedor para venda parcelada (5% sobre o valor total)
        double comisParc = (compra * 5) / 100;

        // Exibindo os resultados
        System.out.println("O valor a vista é: " + valorVista);
        System.out.println("O valor de cada parcela é: " + parcela);
        System.out.println("A comissão do vendedor com a venda a vista: " + comisVista);
        System.out.println("A comissão do vendedor com a venda a prazo: " + comisParc);
    }
}