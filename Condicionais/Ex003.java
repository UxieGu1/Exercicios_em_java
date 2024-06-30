//Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcula r e
//escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for
//maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo
//Negativo'.

package condicao;
import java.util.Scanner;
public class Ex003 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.printf("Digite o número da conta: ");
        int numeroConta = ler.nextInt();

        System.out.printf("Digite o saldo na conta: ");
        double saldo = ler.nextDouble();

        System.out.printf("Digite o débito atual: ");
        double debitoAtual = ler.nextDouble();

        System.out.printf("Digite o crédito atual: ");
        double creditoAtual = ler.nextDouble();

        //Calcular saldo
        double saldoAtual = (saldo - debitoAtual + creditoAtual);
        if(saldoAtual >= 1){
            System.out.println("Saldo positivo!");
            System.out.println("Seu saldo é: R$!"+saldoAtual);
        }else{
            System.out.println("Saldo negativo!");
            System.out.println("Seu saldo é: R$!"+saldoAtual);
        }
        ler.close();
    }
}