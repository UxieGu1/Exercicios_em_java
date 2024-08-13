//Uma loja de routada, ganpa resolveu fazer uma promoção onde o cliente vai falar uma frase. De acordo
////com a frase cihará um desconto em sua compra. Faça uma função que receba uma
//frase e conte quantas vogais “a” ela possui. O programa deverá retornar o valor encontrado e
//esse será o desconto que o cliente ganhará. Em seguida faça outra função que receba o valor
//de desconto e o preço da compra e em seguida imprima o valor descontado e o novo preço
//que será pago

package Funcoes;

public class ex007 {
    public static int contar_a(String frase){
        int contador_a = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'A') {
                contador_a++;
            }
        }
        return contador_a;
    }
    public static void desconto(int valor_desconto, float preco){
        float desconto = preco * (valor_desconto / 100.0f);
        float novo_preco = preco - desconto;
        System.out.printf("O valor do desconto é: %.2f%n", desconto);
        System.out.printf("O preço a ser pago será: %.2f%n", novo_preco);

    }
    public static void main(String[] args) {
        int desconto_percentual = contar_a("morgana linda");
        desconto(desconto_percentual, 1000);
    }
}
