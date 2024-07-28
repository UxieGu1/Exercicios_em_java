//O Sra. Ana Mary possui uma grande loja de doces, onde o produto mais vendido são suas trufas.
//Para agilizar o cálculo de quanto cada cliente deve pagar pelas trufas, ela desenvolveu uma tabela
//que contém o número de itens que o cliente comprou e ao lado o valor da conta. Desta forma a
//atendente do caixa precisa apenas contar quantos itens o cliente está levando e olhar na tabela de
//preços. Você foi contratado para desenvolver o programa que monta esta tabela de preços, que
//conterá os preços de 1 até 50 produtos, conforme o exemplo abaixo:
//o Lojas Doces Mary - Tabela de preços
//o 1 - R$ 2.49
//o 2 - R$ 4.98
//o ...
//o 50 - R$ 124.50"

package loopfor;

public class ex001 {
    public static void main(String[] args) {
    float valor_doce = 2.49F;

    for(int i = 1; i <= 50; i++){
        float precos = valor_doce * i;
        System.out.printf("0 %2d - R$ %.2f%n", i, precos);
    }
    }
}
