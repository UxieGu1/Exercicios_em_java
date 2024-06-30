//9) [OBI 2021]
//Cibele, Camila e Celeste são três irmãs inseparáveis. Estão sempre juntas e adoram
//        fazer esportes, ler, cozinhar, jogar no computador... Agora estão aprendendo a
//programar computadores para desenvolverem seus próprios jogos.
//Mas nada disso interessa para esta tarefa: estamos interessados apenas nas suas idades.
//Sabemos que Cibele nasceu antes de Camila e Celeste nasceu depois de Camila.
//Dados três números inteiros indicando as idades das irmãs, escreva um programa para
//determinar a idade de Camila.
//        Entrada
//A entrada é composta por três linhas, cada linha contendo um número inteiro N, a
//idade de uma das irmãs.
//        Saída
//Seu programa deve produzir uma única linha, contendo um único número inteiro, a
//idade de Camila.BI 2021]
//Cibele, Camila e Celeste são três irmãs inseparáveis. Estão sempre juntas e adoram
//        fazer esportes, ler, cozinhar, jogar no computador... Agora estão aprendendo a
//programar computadores para desenvolverem seus próprios jogos.
//Mas nada disso interessa para esta tarefa: estamos interessados apenas nas suas idades.
//Sabemos que Cibele nasceu antes de Camila e Celeste nasceu depois de Camila.
//Dados três números inteiros indicando as idades das irmãs, escreva um programa para
//determinar a idade de Camila.
//        Entrada
//A entrada é composta por três linhas, cada linha contendo um número inteiro N, a
//idade de uma das irmãs.
//        Saída
//Seu programa deve produzir uma única linha, contendo um único número inteiro, a
//idade de Camila.

package condicao;
import java.util.Scanner;
public class Ex009 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idadeCi, idadeCa, idadeCe;

        System.out.print("Digite a idade de Cibele: ");
        idadeCi = ler.nextInt();
        System.out.print("Digite a idade de Camila: ");
        idadeCa = ler.nextInt();
        System.out.print("Digite a idade de Celeste: ");
        idadeCe = ler.nextInt();

        if(idadeCi < idadeCa && idadeCi > idadeCe || idadeCi > idadeCa && idadeCi < idadeCe){
            int irmaMeio = idadeCi;
            System.out.printf("A irmã do meio é Cibele, com %d anos" ,irmaMeio);
        } else if (idadeCa < idadeCi && idadeCa > idadeCe || idadeCa > idadeCi && idadeCa < idadeCe) {
            int irmaMeio = idadeCa;
            System.out.printf("A irmã do meio é Camila, com %d anos", irmaMeio);
        } else if (idadeCe < idadeCi && idadeCe > idadeCa || idadeCe > idadeCi && idadeCe < idadeCa) {
           int irmaMeio = idadeCe;
            System.out.printf("A irmã do meio é Celeste, com %d anos", irmaMeio);
        }
        ler.close();
    }
}
