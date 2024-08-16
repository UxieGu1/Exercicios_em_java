//Escreva um programa que, com base em uma temperatura em graus celsius, a converta e
//exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas:
//F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67.

package Funcoes;

public class ex009 {
    public static void temperatura(int celsius){
        float F = (celsius * 1.8F + 32);
        float K = celsius + 273.15F;
        float Re = celsius * 0.8F;
        float Ra = celsius * 1.8F + 32 + 459.67F;
        System.out.println("A conversão de Celsius para Fahrenheit (F) é: "+ F);
        System.out.println("A conversão de Celsius para Kelvin (K) é: "+ K);
        System.out.println("A conversão de Celsius para Réaumur (Re) é: "+ Re);
        System.out.println("A conversão de Celsius para Rankine (Ra) é: "+ Ra);

    }
    public static void main(String[] args) {
        byte celsius = 26;
        temperatura(celsius);
    }
}
