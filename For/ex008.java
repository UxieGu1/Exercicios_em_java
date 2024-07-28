//Crie um programa que calcule a média de um conjunto de números inteiros informados pelo
//usuário. O programa deve solicitar ao usuário a quantidade de números que serão informados e, em
//seguida, solicitar cada um desses números. Ao final, o programa deve exibir a média APENAS DOS
//NÚMEROS IMPARES.

package loopfor;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<Integer> lista_numeros = new LinkedList<>();
        int soma = 0;
        int contador = 0;

        System.out.print("Digite a quantidade de números: ");
        int qtd_numeros = ler.nextInt();

        for(int i = 1; i <= qtd_numeros; i++){
            System.out.print("Informe um número: ");
            int numeros = ler.nextInt();
            ler.nextLine();
            lista_numeros.add(numeros);

            if(numeros % 2 != 0){
                soma += numeros;
                contador += 1;
            }
        }
        if (contador == 0){
            System.out.print("Nenhum número impar");
        }else {
            float media = (float) soma / contador;
            System.out.print("A média dos valores impares é: "+ media);
        }

    }
}
