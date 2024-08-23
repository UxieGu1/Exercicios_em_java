package classes;

//Escreva um método recursivo e estático que rebeba um número inteiro positivo N e
//calcule o somatório dos números de 1 a N.

public class somaN {
    public static int somatorio(int n){
        if (n <= 0) {
            System.out.println("O número deve ser positivo");
        }
        if (n == 1) {
            return 1;
        }
        else{
            return n + somatorio(n - 1);
        }
    }
    public static void main(String[] args) {
       int resultado = somatorio(3);
        System.out.println(resultado);
    }
}
