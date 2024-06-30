//Um colecionador de DVD’s decidiu saber em média quanto gastou em seus produtos.
//Faça um programa que receba o número de DVD’s que o colecionador tem, em seguida
//digite o valor de cada DVD para que ao final imprima a média de valor gasto com os
//DVD’s.
package loopwhile;
import java.util.Scanner;
public class Ex002 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numeroDvd;

        System.out.printf("Digite o número de DVD´s do colecionador: ");
        numeroDvd = ler.nextInt();

        int i = 0;
        float somaValores = 0;
        while(i < numeroDvd){
            System.out.printf("Digite o valor do %d° DVD: ", i + 1);
            float valorDvd = ler.nextFloat();
            somaValores += valorDvd;
            i++;
        }
        float mediaValores = somaValores / numeroDvd;
        System.out.printf("A média dos valores é R$ %.2f", mediaValores);
        ler.close();
    }
}
