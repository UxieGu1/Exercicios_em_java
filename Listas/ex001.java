//Desenvolva um programa que pede 6 números para o usuário digitar para que sejam inseridas
//em uma lista. Em seguida exclua o segundo e o quinto número. Ao final, faça a média aritmética
//com os números que sobraram e imprima a lista.

package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<Integer> lista_numeros = new ArrayList<Integer>();

        for (int i = 1; i <= 6; i++){
            System.out.printf("Digite o %dº número: ", i);
            int numeros = ler.nextInt();
            lista_numeros.add(numeros);
        }
        lista_numeros.remove(1);
        lista_numeros.remove(4);
        int soma = lista_numeros.stream().mapToInt(Integer::intValue).sum();
        int tamanho = lista_numeros.size();

        if (tamanho > 0) {
            float media = (float) soma / tamanho;
            System.out.println("A média da lista é: " + media);
            System.out.println(lista_numeros);
        } else {
            System.out.println("A lista está vazia. Não é possível calcular a média.");
        }

        ler.close();

    }
}
