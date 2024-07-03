//O Sr Manoel acaba de adquirir uma panificadora e pretende implantar a metodologia
//da tabelinha, que já é um sucesso em sua loja. Você foi contratador para desenvolver o
//programa que monta a tabela de preços de Paes, de 1 a 50 pães, a partir do preço do
//pão informado pelo usuário conforme o exemplo abaixo

package loopwhile;
import java.util.Scanner;
public class Ex003 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.printf("O preço do pão: R$ ");
        float pao = ler.nextFloat();
        System.out.println("Panificadora Pães de Ontem - Tabela de Preço");

        int i = 1;
        while (i <= 50) {
            float precoPao = pao * i;
            System.out.printf("%d - R$ %.2f%n", i, precoPao);
            i++;
        }
    }
}
