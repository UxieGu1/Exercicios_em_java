//Você é um engenheiro espacial trabalhando na contagem regressiva para o
//lançamento de um foguete. Escreva um programa que simule essa contagem regressiva. O
//programa deve imprimir os números de 10 até 1 enquanto aguarda o momento exato do
//lançamento. Quando atingir zero, deve imprimir "Lançamento!". Faça a contagem ser lenta(
//dica, use outro loop para desacelerar a contagem)

package loopwhile;
public class Ex005 {
    public static void main(String[] args) {
        int inicio = 10;

        while (inicio >= 0) {
            System.out.println(inicio);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            inicio--;
        }

        System.out.println("Lançamento!");
    }
}
