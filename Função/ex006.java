//Crie uma função que receba como entrada uma string e retorne “É palíndromo” se a string for
//um palíndromo e “Não é palíndromo” caso contrário

package Funcoes;

import java.util.Scanner;

public class ex006 {
    public static String palindromo(String texto){
        String textoInvertido = new StringBuilder(texto).reverse().toString().toLowerCase();

        if (texto.equals(textoInvertido)){
            return "É palíndromo!";
        }else {
            return "Não é palíndromo!";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String txt = scan.next();
        System.out.println(palindromo(txt));

    }
}
