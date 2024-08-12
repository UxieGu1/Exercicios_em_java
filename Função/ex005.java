//Faça uma função que retorne o reverso de um número inteiro informado. No caso o número
//será uma String Por exemplo: 127 -> 721
package Funcoes;

public class ex005 {
    public static void main(String[] args) {
    reverso(721);
    }
    public static int reverso(int n1){
        int numero_reverso = 0;
        int numero = n1;

        while (numero != 0) {
            int digito = numero % 10;
            numero_reverso = numero_reverso * 10 + digito;
            numero /= 10;
        }
        System.out.print(numero_reverso);
        return 0;
    }
}
