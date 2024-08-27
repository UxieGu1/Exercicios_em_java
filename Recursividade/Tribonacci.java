// Os números Tribonacci são definidos pela seguinte recursão
// Implemente um método recursivo que receba por parâmetro um número inteiro positivo
// N e mostre e retorne o N-ésimo número da sequência de Tribonacci.

public class Tribonacci {
    public static int tribonacci(int n){
        if (n == 0) {
            return 0;
        } else if (n == 1){
            return 1;
        } else if (n == 2){
            return 1;
        } else {
            return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
        }
    }
    public static void main(String[] args) {
        int resultado = tribonacci(10);
        System.out.println(resultado);
    }
}
