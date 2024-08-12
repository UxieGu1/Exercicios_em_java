//Criar uma função que receba um caractere como parâmetro e retorne 1 (um) caso seja uma
//vogal e zero caso não seja.

package Funcoes;

import java.util.Scanner;

public class ex001 {
    static int vogal(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return 1;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um caractere para verificarmos se é vogal: ");
        char caractere = ler.next().charAt(0);
        int resultado = vogal(caractere);
        if (resultado == 1){
            System.out.println("É vogal!");
        }else {
            System.out.println("Não é vogal!");
        }
    }
}
