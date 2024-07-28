//Os números primos possuem várias aplicações dentro da Computação, por exemplo na
//Criptografia. Um número primo é aquele que é divisível apenas por um e por ele mesmo. Faça um
//programa que peça um número inteiro e determine se ele é ou não um número primo

package loopfor;

import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = ler.nextInt();
        ler.close();

        if (numero < 2) {
            System.out.println("Não é primo!");
        } else {
            boolean primo = true;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    primo = false; 
                    break;
                }
            }

            if (primo) {
                System.out.println("É primo!");
            } else {
                System.out.println("Não é primo!");
            }
        }
    }
}

