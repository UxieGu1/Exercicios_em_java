// Os números de Pell são definidos pela seguinte recursão
// Exemplo de números desta sequência são: 0, 1, 2, 5, 12, 29, 70, 169, 408, 985...
// Implemente um método recursivo que receba como entrada um número N e retorne o Nésimo número de Pell

public class Pell {
    public static int numerosPell(int n){
        if (n == 0){
            return 0;
        } else if(n == 1){
            return 1;
        } else {
            return 2 * numerosPell(n - 1) + numerosPell(n - 2);
        }
    }
    public static void main(String[] args) {
        int resultado = numerosPell(4);
        System.out.println(resultado);
    }
}
