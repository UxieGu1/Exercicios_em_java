public class Potenciacao{
    public static int potencia(int x, int k){
        if (k == 0) {
            return 1;
        } else if(k == 1){
            return x;
        } else {
            return x * potencia(x, k - 1);
        }
    }
    public static void main(String[] args) {
        int resultado = potencia(2, 2);
        System.out.println(resultado);
    }
}
