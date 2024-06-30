//Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome
//do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.
package condicao;
import java.util.Scanner;
public class Ex004 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Nome do primeiro time: ");
        String nomeTime1 = ler.nextLine();
        System.out.print("Número de gols do primeiro time: ");
        int golsTime1 = ler.nextInt();
        ler.nextLine();

        System.out.print("Nome do segundo time: ");
        String nomeTime2 = ler.nextLine();
        System.out.print("Número de gols do segundo time: ");
        int golsTime2 = ler.nextInt();

        if (golsTime1 > golsTime2) {
            System.out.printf("O time vencedor é %s com um total de %d gols", nomeTime1, golsTime1);
        } else if (golsTime2 > golsTime1) {
            System.out.printf("O time vencedor é %s com um total de %d gols", nomeTime2, golsTime2);
        } else {
            System.out.println("EMPATE");
        }

        ler.close();
    }
}
