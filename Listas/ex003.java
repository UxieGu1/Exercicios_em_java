//Faça um programa que insira 10 números aleatórios de 1 a 100 em uma lista.
//Em seguida percorra a lista e conte quantos números são pares ou impares e
//quantos são maiores e menores que 50.

package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class ex003 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<Integer> lista_numeros = new ArrayList<Integer>();
        Random random = new Random();

        for (int i = 1; i <= 10; i++){
            int numero_aleatorio = random.nextInt(1, 100);
            lista_numeros.add(numero_aleatorio);
        }
        System.out.println("Valores adicionados com sucesso!");
        int pares = 0;
        int impares = 0;
        int maior_50 = 0;
        int menor_50 = 0;

        for(int n : lista_numeros){
            if(n % 2 == 0){
                pares += 1;
            } else if (n % 2 == 1) {
                impares += 1;
            } if (n > 50) {
                maior_50 += 1;
            } else{
                menor_50 += 1;
            }
        }
        System.out.println("Pares: "+ pares);
        System.out.println("ìmpares : "+ impares);
        System.out.println("Maiores que 50: "+ maior_50);
        System.out.println("Menores que 50 "+ menor_50);
    }
}
