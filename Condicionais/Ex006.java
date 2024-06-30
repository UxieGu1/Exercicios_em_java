//Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades
//dos homens serão sempre diferentes entre si, bem como as das mulheres). Calcule e escreva a
//soma das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem
//mais novo com a mulher mais velha.
package condicao;
import java.util.Scanner;
public class Ex006 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //idade do zomi
        System.out.print("Digite a idade do primeiro homem: ");
        int idadeHomemUm = ler.nextInt();
        System.out.print("Digite a idade do segundo homem: ");
        int idadeHomemDois = ler.nextInt();
        //idade das muié
        System.out.print("Digite a idade da primeira mulher: ");
        int idadeMulherUm = ler.nextInt();
        System.out.print("Digite a idade da segunda mulher: ");
        int idadeMulherDois = ler.nextInt();

        int maisVelhoHomem, maisNovoHomem;
        if (idadeHomemUm > idadeHomemDois) {
            maisVelhoHomem = idadeHomemUm;
            maisNovoHomem = idadeHomemDois;
        } else {
            maisVelhoHomem = idadeHomemDois;
            maisNovoHomem = idadeHomemUm;
        }

        int maisVelhaMulher, maisNovaMulher;
        if (idadeMulherUm > idadeMulherDois) {
            maisVelhaMulher = idadeMulherUm;
            maisNovaMulher = idadeMulherDois;
        } else {
            maisVelhaMulher = idadeMulherDois;
            maisNovaMulher = idadeMulherUm;
        }

        int soma = maisVelhoHomem + maisNovaMulher;
        int produto = maisNovoHomem * maisVelhaMulher;

        System.out.println("A soma do homem mais velho com a mulher mais nova é: " + soma);
        System.out.println("O produto das idades do homem mais novo com a mulher mais velha é: " + produto);

        ler.close();
    }
}
