//Fazer uma classe ESorteio para:
//Sortear um número de 0 a 1000 (dica: usar Math.random())
//Pedir um palpite ao usuário. Se ele errar, informar se o palpite é maior ou
//menor do que o número sorteado.
//Pedir novos palpites até que o usuário acerte e, depois disso, mostrar em
//quantas tentativas ele acertou.

package Classes;

import java.util.Random;
import java.util.Scanner;

public class Sorteio {
    private final Random random = new Random();
    private int palpite;
    private int contador_maior = 0;
    private int contador_menor = 0;
    private int numero_random;

    public Sorteio() {
    }

    public void gerar_numero() {
        numero_random = random.nextInt(1001);
    }

    public void verificar_numero() {
        Scanner ler = new Scanner(System.in);

        while (true) {
            System.out.print("Digite seu palpite (0 a 1000): ");
            this.palpite = ler.nextInt();

            if (this.palpite == numero_random) {
                System.out.println("Você acertou o número, Parabéns!");
                break;
            } else if (this.palpite > numero_random) {
                System.out.println("Seu número é maior que o sorteado!");
                contador_maior++;
            } else if (this.palpite < numero_random) {
                System.out.println("Seu número é menor que o sorteado!");
                contador_menor++;
            }
        }
        ler.close();
    }

    public void mostrarTentativas() {
        System.out.println("Tentativas maiores que o número sorteado: " + contador_maior);
        System.out.println("Tentativas menores que o número sorteado: " + contador_menor);
    }

    public static void main(String[] args) {
        Sorteio objeto = new Sorteio();
        objeto.gerar_numero();
        objeto.verificar_numero();
        objeto.mostrarTentativas();
    }
}
