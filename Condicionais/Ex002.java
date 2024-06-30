//Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-
//Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
//Inválido!", conforme o caso.
package condicao;
import java.util.Scanner;
public class Ex002 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char turno;

        System.out.printf("Informe o turno que você estuda (M-matutino, V-vespertino, N-noturno): ");
        turno = ler.next().toUpperCase().charAt(0);

        if(turno == 'M'){
            System.out.println("Bom Dia!");
        } else if (turno == 'V') {
            System.out.println("Boa Tarde!");
        } else if (turno == 'N') {
            System.out.println("Boa Noite!");
        }else {
            System.out.println("Valor Inválido");
        }
        ler.close();
    }
}