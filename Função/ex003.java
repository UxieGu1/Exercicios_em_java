//Faça um programa com uma função chamada somaImposto. A função possui dois parâmetros
//formais: taxaImposto, que é a quantia de imposto sobre vendas expressa em porcentagem e
//custo, que é o custo de um item antes do imposto. A função “altera” o valor de custo para incluir o
//imposto sobre venda

package Funcoes;

public class ex003 {
    public static float calcularImposto(float taxa, float custo) {
        float resultado = ((taxa / 100) * custo) + custo;
        System.out.printf("O resultado do calculo foi %.2f%n ", resultado);
        return 0;
    }
        public static void main(String[] args) {
            calcularImposto(10, 1000);
    }
}

