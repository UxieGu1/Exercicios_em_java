//Faça um programa que calcule o número médio de alunos por turma. Para isto, peça a quantidade
//de turmas e a quantidade de alunos para cada turma. As turmas não podem ter mais de 40 alunos.
//(use um while para impedir que a turma tenha mais de 40 alunos)

package loopfor;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int total = 0;

        System.out.println("Digite a quantidade de turmas: ");
        int qtd_turmas = ler.nextInt();

        for (int t = 1; t <= qtd_turmas; t++) {
            System.out.println("Digite a quantidade de alunos para a turma " + t + ": ");
            int num_alunos = ler.nextInt();

            while (num_alunos > 40 || num_alunos < 0) {
                System.out.println("Número inválido. Digite novamente a quantidade de alunos (entre 0 e 40): ");
                num_alunos = ler.nextInt();
            }

            total += num_alunos;
        }

        if (qtd_turmas > 0) {
            double media = (double) total / qtd_turmas;
            System.out.printf("A média de alunos por turma é: %.2f%n", media);
        } else {
            System.out.println("Número de turmas deve ser maior que 0.");
        }

        ler.close();
    }
}

