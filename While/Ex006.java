//O departamento de meteorologia contratou você para desenvolver um sistema que
//receba várias temperaturas e ao final indique qual foi a maior e a menor temperatura
//registrada do programa. O programa encerra digitando o valor 999 na temperatura.

package loopwhile;
import java.util.Scanner;
public class Ex006 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float temperatura;
        float maior = Float.MIN_VALUE;
        float menor = Float.MAX_VALUE;

        while (true) {
            System.out.print("Digite a temperatura(em C°): ");
            temperatura = ler.nextFloat();

            if (temperatura == 999) {
                break;
            }
            if (temperatura > maior) {
                maior = temperatura;
            }
            if (temperatura < menor) {
                menor = temperatura;
            }
        }

        ler.close();

        if (maior != Float.MIN_VALUE && menor != Float.MAX_VALUE) {
            System.out.printf("A maior temperatura encontrada foi: %.1f C°%n", maior);
            System.out.printf("A menor temperatura encontrada foi: %.1f C°%n", menor);
        } else {
            System.out.println("Nenhuma temperatura foi digitada.");
        }
    }
}
