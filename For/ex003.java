//A função len() em Python tem ela tem por objetivo retornar o comprimento do item inserido, o
//retorno dela sempre vai ser algum número, ou um erro caso sua sintaxe esteja errada.
//Analise o código a seguir
//No exemplo, o texto “Uma casa linda” possui 12 letras e 2 espaços, totalizando 14 caracteres.
//É possível acessar letra por letra de um texto a partir do seu índice. Por exemplo:
//Com isso, faça um programa usando um for e os conceitos mostrado anteriormente para pedir ao
//usuário que escreva uma frase e depois mostre:
//a) Quantas vogais, quantas consoantes e quantos espaços o texto tem?
//b) Escreva a frase ao contrário
//c) Imprimir a frase novamente mas onde tiver vogal “a” , “i” e “u” colocar um “–“, e onde tiver as
//vogais “e” e “o” colocar um “@”

package loopfor;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int vogais = 0;
        int consoantes = 0;
        int espacos = 0;
        System.out.println("Digite uma frase: ");
        String frase = ler.next();

        for(int i = 0; i < frase.length(); i++){
            char letra = frase.charAt(i);

            if (isVogal(letra)) {
                vogais++;

            }else if(Character.isLetter(letra)){
                consoantes++;

            }else if(Character.isWhitespace(espacos)) {
                espacos++;
            }
        }
        System.out.println("Quantidade de vogais: "+ vogais);
        System.out.println("Quantidade de consoantes: "+ consoantes);
        System.out.println("Quantidade de espaços: "+ espacos);

        String fraseInvertida = inverterString(frase);

        System.out.println("Frase ao contrário: " + fraseInvertida);
    }
    private static boolean isVogal(char c) {
        c = Character.toLowerCase(c);
        return "aeiou".indexOf(c) != -1;
    }
    private static String inverterString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
