//Crie um programa que declare uma lista L, a qual você pode preenchê-la aleatoriamente com
//números entre 1 e 20. Em seguida, o programa deve calcular a média aritmética entre o menor
//e o maior elemento da lista L. Ao fim, o programa deve imprimir a média aritmética encontrada
//e verificar se existe esse número na lista.

package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ex006 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();
        Random random = new Random();
        int tamanho_lista = 10;

        for (int i = 0; i < tamanho_lista; i++){
            int numeros_aleatorios = random.nextInt(1, 20);
            lista.add(numeros_aleatorios);
        }
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for(int numero : lista){
            if(numero > maior){
                maior = numero;

            }
            if(numero < menor){
                menor = numero;
            }
        }
        double media = (maior + menor) / 2;
        System.out.printf("A média do menor e maior valor é %.2f%n", media);

        boolean media_presente = lista.contains(media);

        if(media_presente){
            System.out.print("A média está na lista!");
        }else {
            System.out.print("A média não está na lista!");
        }
    }
}
