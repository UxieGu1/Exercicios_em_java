// Crie um programa que insira 9 números aleatórios em uma lista. Em seguida embaralhe esses
// números e insira em uma nova lista. Imprima as duas listas no formato de matriz e em seguida
// imprima a soma das duas no formato de matrizes também.

package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class ex005 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> lista_numeros = new ArrayList<>();
        List<Integer> nova_lista = new ArrayList<>();

        for (int i = 1; i <= 9 ; i++) {
            int numero_aleatorio = random.nextInt(1, 100);
            lista_numeros.add(numero_aleatorio);
        }
        //declarando tamanho do array
        String[]array = new String [lista_numeros.size()];

        //convertendo lista em array
        lista_numeros.toArray(array);

        //printando o array
        for (int i = 0 ; i < array.length ; i++){
            System.out.print(array[i] + "  ");
        }

        //embaralha e adiciona a lista
        Collections.shuffle(lista_numeros);

        String[]array_2 = new String [lista_numeros.size()];
        lista_numeros.toArray(array_2);

        for (int i = 0; i < array_2.length ; i++) {
            System.out.print(array_2[i] + "  ");
        }
    }
}
