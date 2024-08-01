//Crie um programa que solicite o usuário um número N ímpar maior que 1
//Em seguida, preencha uma lista com N números inteiros positivos (suponha que o
//usuário sempre digitará números inteiros positivos). Selecione o elemento que está no centro da lista.
// Ao final, calcule e escreva o fatorial do elemento selecionado


package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<Integer> lista_numeros = new ArrayList<Integer>();

        System.out.print("Digite um número impar maior que 1: ");
        int n = ler.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite valores para preencher a lista: ");
            int valores = ler.nextInt();
            lista_numeros.add(valores);
        }
        int indiceCentral = lista_numeros.size() / 2;
        int valorCentral = lista_numeros.get(indiceCentral);
        int n_fatorial = (int) calcularFatorial(valorCentral);

        System.out.println("O fatorial do valor central é: " + n_fatorial);
    }
    public static long calcularFatorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
