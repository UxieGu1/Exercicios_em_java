//Um comerciante comprou um produto e quer vendê-lo com lucro de 45% se o valor da compra for
//menor que 20,00; caso contrário, o lucro será de 30%. Escreva um programa que entre com o
//valor do produto e imprimir o valor da venda.
package condicao;
import java.util.Scanner;
public class Ex005 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o preço do produto comprado: ");
        float produto = ler.nextFloat();

        float venderProduto;
        if (produto < 20.00) {
            venderProduto = produto + (produto * 0.45f);
        } else {
            venderProduto = produto + (produto * 0.30f);
        }

        System.out.printf("O valor do produto a venda será R$ %.2f%n", venderProduto);

        ler.close();
    }
}
