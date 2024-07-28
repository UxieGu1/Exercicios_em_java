//Numa eleição existem três candidatos (candidato A, candidato B e candidato C). Faça um
//programa que peça o número total de eleitores. Peça para cada eleitor votar e ao final mostrar o
//número de votos de cada candidato

package loopfor;

import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int candidato_a = 0;
        int candidato_b = 0;
        int candidato_c = 0;
        String candidato;

        System.out.println("Número total de eleitores: ");
        int eleitores = ler.nextInt();
        ler.nextLine();

        for(int i = 1; i <= eleitores; i++){
            System.out.println("Selecione o candidato que você deseja votar(candidato A, candidato B e candidato C)");
            candidato = ler.nextLine().toUpperCase();
            switch (candidato){
                case "A":
                    candidato_a++;
                    break;
                case "B":
                    candidato_b++;
                    break;
                case "C":
                    candidato_c++;
                    break;
                default:
                    System.out.println("Voto inválido");
                    i--;
                    break;
            }
        }

        System.out.println("Candidato A: "+ candidato_a);
        System.out.println("Candidato B: "+ candidato_b);
        System.out.println("Candidato C: "+ candidato_c);
        ler.close();
    }
}
