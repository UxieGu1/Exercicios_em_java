//Você está gerenciando uma loja online e deseja calcular o desconto total aplicado
//a uma compra com vários itens. Questão: Escreva um programa em Java que solicite ao
//usuário o preço de cada item comprado e o percentual de desconto a ser aplicado. Calcule o
//total da compra com desconto. Mostre o total, quanto ele pagou no final e o que ele
//economizou.

package loopwhile;
import java.util.Scanner;
public class Ex009 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float precoProdutos;
        float totalProdutos = 0;
        int i = 1;

        System.out.print("Digite a quantidade de produtos que você comprará: ");
        int qtdProdutos = ler.nextInt();
        System.out.print("Digite o desconto dos produtos(em %): ");
        float desconto = ler.nextFloat();

        while (i <= qtdProdutos){
            System.out.printf("Digite o preço do %d produto: ", i);
            precoProdutos = ler.nextFloat();
            totalProdutos += precoProdutos;
            i++;
        }
        float totalDesconto = totalProdutos * (desconto / 100);
        float precoFinal = totalProdutos - totalDesconto;

        System.out.printf("O preço total dos produtos é: R$ %.2f%n", totalProdutos);
        System.out.printf("O total de desconto aplicado é: R$ %.2f%n", totalDesconto);
        System.out.printf("O preço total com desconto é: R$ %.2f%n", precoFinal);

        ler.close();
    }
}
