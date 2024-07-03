//Você está abastecendo seu carro em um posto de gasolina. Escreva um
//programa que simule esse processo. O programa deve continuar a bombear gasolina
//enquanto o tanque do carro não estiver cheio. O litro de gasolina custa 5,40 e cada loop a
//bomba libera 200ml de gasolina. O programa deve mostrar o processo de abastecimento do
//carro. O cliente deverá informar quantos litros o tanque tem e sua capacidade.

package loopwhile;
import java.util.Scanner;
public class Ex004 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Quantos litros o tanque contém: ");
        double litrosTanque = ler.nextDouble();
        System.out.print("Qual a capacidade do tanque: ");
        double capacidadeTanque = ler.nextDouble();

        double precoGasolina = 5.40;
        double custoTotal = 0.0;
        //se quiser colocar um metodo pra ficar mais lento tem na net.
        while (litrosTanque < capacidadeTanque) {
            litrosTanque += 0.200;
            custoTotal += 0.200 * precoGasolina;
            System.out.printf("Estamos abastecendo seu carro. Litros no tanque: %.2f%n", litrosTanque);
        }
        System.out.printf("O tanque foi preenchido com sucesso! Custo total: R$ %.2f%n", custoTotal);
        ler.close();
    }
}
