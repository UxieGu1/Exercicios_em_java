//Você é o gerente de uma loja e precisa controlar o estoque de produtos. Escreva
//um programa que simule o controle de estoque. O programa deve continuar a solicitar a
//entrada de produtos enquanto houver espaço no estoque. O programa deve permitir a compra
//e venda do produto, atualizando o estoque e o caixa da loja conforme necessário. O programa
//deve continuar em execução até que o usuário decida encerrá-lo ou então o estoque zerar
//total. Mostre o lucro que a empresa teve sabendo que o produto é comprado por 3 reais e
//vendido por 5 reias

package loopwhile;
import java.util.ArrayList;
import java.util.Scanner;
public class Ex007 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int estoque = 0;
        int caixa = 0;
        int lucro = 0;
        int capacidadeMaxima = 100; 
        
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Comprar produto");
            System.out.println("2. Vender produto");
            System.out.println("3. Ver estoque");
            System.out.println("4. Ver caixa");
            System.out.println("5. Ver lucro");
            System.out.println("6. Sair");

            int opcao = ler.nextInt();

            if (opcao == 1) {
                System.out.println("Quantos produtos deseja comprar?");
                int quantidade = ler.nextInt();
                if (estoque + quantidade <= capacidadeMaxima) {
                    estoque += quantidade;
                    caixa -= quantidade * 3;
                    System.out.println("Compra realizada com sucesso! Estoque atual: " + estoque);
                } else {
                    System.out.println("Não há espaço suficiente no estoque!");
                }
            } else if (opcao == 2) {
                System.out.println("Quantos produtos deseja vender?");
                int quantidade = ler.nextInt();
                if (estoque >= quantidade) {
                    estoque -= quantidade;
                    caixa += quantidade * 5;
                    lucro += quantidade * 2;
                    System.out.println("Venda realizada com sucesso! Estoque atual: " + estoque);
                } else {
                    System.out.println("Não há produtos suficientes no estoque!");
                }
            } else if (opcao == 3) {
                System.out.println("Estoque atual: " + estoque);
            } else if (opcao == 4) {
                System.out.println("Caixa atual: R$" + caixa);
            } else if (opcao == 5) {
                System.out.println("Lucro acumulado: R$" + lucro);
            } else if (opcao == 6) {
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }

            if (estoque == 0) {
                System.out.println("Estoque zerado. Encerrando programa.");
                break;
            }
        }

        ler.close();
    }
}
