//Faça uma função que receba o número inteiro. Esse número inteiro corresponde ao número
//de vezes que um dado foi arremessado. A função deverá gerar um número aleatório entre 1
//e 6. Faça o programa mostrar quantas vezes o número 5 saiu.

package Funcoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ex004 {
    public static int arremeso_dado(int n){
        Random random = new Random();
        List<Integer> lista_numeros = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++){
            int numero_aleatorio = random.nextInt(6) + 1;
            if(numero_aleatorio == 5){
                lista_numeros.add(numero_aleatorio);
            }
        }
        System.out.printf("O número cinco saiu um total de %d vezes%n", lista_numeros.size());
        return 0;
    }
    public static void main(String[] args) {
        arremeso_dado(10);
    }
}
