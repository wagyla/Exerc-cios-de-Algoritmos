/* Alonso decidiu passear pelas cidades próximas da região onde mora. 
Para conhecer os locais, ele gastou 2 horas percorrendo uma distância de 120 km. 
Escreva um programa que calcule e imprima a velocidade média que Alonso esteve em seu passeio. */

public class ex31 {
    public static void main(String[] args){
        int km = 120;
        int horas = 2;
        int kmHora = km/horas;

        System.out.println("A velocidade média de Alonso foi "+kmHora+"km/h");
    }
    
}
