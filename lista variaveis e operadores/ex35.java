/* Sabendo que um veículo está a uma velocidade constante de 15m/s, quantos quilômetros o veículo percorrerá em 50 minutos? 
Faça um programa que faça o cálculo utilizando a equação do movimento retilíneo uniforme. */

public class ex35 {
    public static void main(String[] args){
        int metroSe = 15;
        int minutos = 50;
        double segundos = minutos* 60;

        double distanciaMetros = metroSe * segundos;

        double distanciaKm = distanciaMetros / 1000.0;

        System.out.println("O veículo percorrerá "+distanciaKm+" km.");


    }
    
}