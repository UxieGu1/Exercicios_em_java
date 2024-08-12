//Crie uma função que retorna o seguinte: A função recebe 3 valores float e retornar o
//quadrado do 1º + a soma dos outros dois. Imprima o resultado

package Funcoes;

public class ex002 {

    static float produto(float n1, float n2, float n3){
        double quadrado = Math.pow(n1, 2);
        double resultado = quadrado + (n2 + n3);
        System.out.printf("O resultado da expressão é %.2f%n ", resultado);
        return 0;
    }

    public static void main(String[] args) {
        float numeroUm = 10F;
        float numeroDois = 30F;
        float numeroTres = 15F;
        produto(numeroUm, numeroDois, numeroTres);
    }
}