//Escreva uma função que recebes 3 valores reais X, Y e Z e que verifique se esses valores
//podem ser os comprimentos dos lados de um triângulo, Crie outra função que retorne qual é o
//tipo de triângulo formado.
//Para que X, Y e Z formem um triângulo é necessário que a seguinte propriedade seja satisfeita
//o comprimento de cada lado de um triângulo é menor do que a soma do comprimento dos
//outros dois lados O procedimento deve identificar o tipo de triângulo formado observando as
//seguintes definições
//Triângulo Equilátero: os comprimentos dos 3 lados são iguais
//Triângulo Isósceles: os comprimentos de 2 lados são iguais
//Triângulo Escaleno: os comprimentos dos 3 lados são diferentes

package Funcoes;


public class ex008 {
    public static boolean validarTriangulo(float l1, float l2, float l3){
        if(l1 + l2 > l3 && l2 + l3 > l1 && l1 + l3 > l2){
            System.out.println("Triângulo válido!");
            return true;
        } else {
            System.out.println("Triângulo inválido");
            return false;
        }

    }
    public static float tipoTriangulo(float l1, float l2, float l3){
        if(l1 == l2 && l1 == l3 && l2 == l3){
            System.out.println("Seu triângulo é equilátero!");
        } else if (l1 == l2 || l1 == l3 || l2 == l3) {
            System.out.println("Seu triângulo é isósceles!");
        } else {
            System.out.println("Seu triângulo é escaleno!");
        }
        return 0;
    }
    public static void main(String[] args) {
        float x = 10;
        float y = 15;
        float z = 10;

        boolean verificar = validarTriangulo(x, y, z);

        if(verificar){
            tipoTriangulo(x, y, z);
        }
    }

}
