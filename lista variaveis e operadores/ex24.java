/* A importância de R$ 780.000,00 será dividida entre três ganhadores de um concurso. Sendo que da quantia total:

O primeiro ganhador recebera 46%;
O segundo recebera 32%;
O terceiro recebera o restante.
Calcule e imprima a quantia ganha por cada um dos ganhadores */

public class ex24 {
    public static void main(String[] args){
        int importancia = 780000;

        double primGa = (importancia* 46)/100;
        double valorPriGa = importancia - primGa;
        System.out.println("O primeiro ganhador receberá R$"+valorPriGa);

        double seguGa = (importancia* 32)/100;
        double valorSegGa = importancia - primGa;
        System.out.println("O segundo ganhador receberá R$"+valorSegGa);

        double tercGa = (valorPriGa+valorSegGa) - 780000;
        System.out.println("O terceiro ganhador receberá R$"+tercGa);

    }   
}
