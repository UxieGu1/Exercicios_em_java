//Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por
//mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas
//por ele efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor
//total de suas vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva
//o salário final do vendedor.
package condicao;
import java.util.Scanner;
public class Ex007 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o número de carros vendidos: ");
        int carros = ler.nextInt();
        System.out.print("Digite o valor total de vendas: ");
        int valorVendas = ler.nextInt();
        System.out.print("Digite o salário fixo: ");
        int salarioFixo = ler.nextInt();
        System.out.print("Digite o valor por carro vendido: ");
        float valorCarroVendido = ler.nextInt();

        float comissao = 0.05f * valorVendas;
        float salarioFinal = salarioFixo + comissao + (carros * valorCarroVendido);

        System.out.print("O salário final é: R$" + salarioFinal);

        ler.close();
    }
}
