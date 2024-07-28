//Desenvolver um programa para verificar a nota do aluno em uma prova com 5 questões, o programa
//deve perguntar ao aluno a resposta de cada questão e ao final comparar com o gabarito da prova (cada
//questão possui alternativas de A até E) e assim calcular o total de acertos e a nota (atribuir 2 pontos
//por resposta certa). Corrija a prova de três alunos de acordo com o gabarito que cada um marcou e
//veja qual foi o que teve a maior pontuação na prova
//Caso queira concatenar (unir) várias letras em uma variável, basta utilizar o sinal de adição “+”

package loopfor;

import java.util.Objects;
import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i = 5;

        while (i <= 5){
            int acerto = 0;
            int erro = 0;
            for (int a = 1; a < 6; a++) {
                System.out.print("Digite a questão que o aluno marcou: ");
                String resposta_aluno = ler.next();
                System.out.print("Digite a resposta do gabarito: ");
                String resposta_gabarito = ler.next();
                if (Objects.equals(resposta_aluno, resposta_gabarito)) {
                    acerto += 1;
                } else {
                    erro += 1;
                }
            }
            i+=1;
            int nota = acerto * 2;
            System.out.printf("a nota do aluno %2d foi %2d%n", i + 1, nota);
        }
        ler.close();
    }
}
