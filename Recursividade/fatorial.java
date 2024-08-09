//Escreva uma função que receba como entrada um número inteiro e retorne o fatorial desse
//número.

public class Fatorial {
  public static int fatorial(int n){
    if(n == 0){
      return 1;
    }
    else{
      return n * fatorial(n-1);
    }
  }
  public static void main(String[] args) {
    int resultado = fatorial(5);
    System.out.println(resultado);
  }

}
