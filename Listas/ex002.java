//Uma turma de formandos está vendendo rifas para angariar recursos financeiros para sua
//cerimônia de formatura. Construa um programa para cadastrar os nomes das pessoas que
//compraram a rifa. Ao fim, o programa deve sortear o ganhador do prêmio e imprimir o seu nome.

package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class ex002 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();
        List<String> compradores = new ArrayList<String>();

        for (int i = 1; i <= 5; i++){
            System.out.printf("Digite o nome do %d° aluno que comprou a rifa: ", i);
            String alunos = ler.next();
            compradores.add(alunos);
            ler.nextLine();
        }
        int indiceRandom = random.nextInt(compradores.size());
        String ganhador = compradores.get(indiceRandom);
        System.out.println("O ganhador foi "+ ganhador +"!");

        ler.close();
    }
}
