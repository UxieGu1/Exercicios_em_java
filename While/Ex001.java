//Imagine que você está ajudando um fazendeiro a contar suas ovelhas. Escreva
//um programa que simule essa situação, onde o programa conta de 1 até o número total de
//ovelhas enquanto as exibe na tela. O programa deve parar de contar quando todas as
//ovelhas forem contadas, a quantidade de ovelhas é definida pelo usuário.
//EX: Total de ovelhas: 4
//Ovelha 1
//Ovelha 2
//Ovelha 3
//Ovelha 4
package loopwhile;
import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int ovelhas;

        System.out.printf("Digite a quantidade de ovelhas: ");
        ovelhas = ler.nextInt();
        int i = 1;

        while (i <= ovelhas) {
            System.out.printf("Ovelha %d%n", i);
            i++;
        }

        ler.close();
    }
}
