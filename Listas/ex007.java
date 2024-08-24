//Que um programa em Java que implemente as seguintes funções:
//a) totalPares: a função recebe como parâmetro um array de inteiros e retorna um  número inteiro indicando o
//total de números pares existentes no array.
//b) maiorValor: a função recebe como parâmetro um array de inteiros e retorna o  maior número existente no
//array.
//c) totalIguais: a função recebe como parâmetro dois arrays de inteiros e retorna o  total de números
//iguais existentes em ambos os arrays.
//Em seguida, crie a função principal do programa para testar as funções criadas em arrays  definidos
//estaticamente ou informados pelo usuário.

package Listas;

import java.util.HashSet;
import java.util.Set;

public class ex007 {

    public static int totalPares(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int maiorValor(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int totalIguais(int[] array1, int[] array2) {
        Set<Integer> set = new HashSet<>();
        int totalIguais = 0;

        for (int num : array1) {
            set.add(num);
        }

        for (int num : array2) {
            if (set.contains(num)) {
                totalIguais++;
            }
        }

        return totalIguais;
    }

    public static void main(String[] args) {
        int[] valores = {23, 45, 67, 89, 12, 34, 56, 78, 90, 21, 43, 65};
        int[] valores_dois = {7, 14, 23, 32, 41, 50, 59, 68, 77, 86, 95, 104};

        int totalParesResult = totalPares(valores);
        System.out.println("Total de números pares: " + totalParesResult);

        int maiorValorResult = maiorValor(valores);
        System.out.println("Maior valor: " + maiorValorResult);

        int totalIguaisResult = totalIguais(valores, valores_dois);
        System.out.println("Total de números iguais: " + totalIguaisResult);
    }
}

