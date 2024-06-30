//1) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem
//compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule
//e escreva o custo total da compra.
package condicao;
import java.util.Scanner;
public class Ex001 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int macasCompradas;

        System.out.printf("Informe o valor de maças compradas: ");
        macasCompradas = ler.nextInt();

        if(macasCompradas < 12){
            System.out.println("O valor pago pelas maças será: " + (macasCompradas * 1.30));
        } else if(macasCompradas >= 12) {
            System.out.println("O valor pago pelas maças será: " + (macasCompradas * 1.00));
        }
        ler.close();
    }
}
