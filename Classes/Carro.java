//Implemente uma classe chamada Carro com as seguintes propriedades:
//Um veículo tem um certo consumo de combustível (medidos em km / litro) e uma certa quantidade de
//combustível no tanque.
//O consumo é especificado no construtor e o nível de combustível inicial é 0.
//Forneça um método andar( ) que simule o ato de dirigir o veículo por uma certa distância, reduzindo o nível de
//combustível no tanque de gasolina. Esse método recebe como parâmetro a distância em km.
//Forneça um método obterGasolina( ), que retorna o nível atual de combustível.
//Forneça um método adicionarGasolina( ), para abastecer o tanque.
//Faça um programa para testar a classe Carro.

package Classes;

public class Carro {
    private double consumo;
    private double qtd_tanque;

    public Carro(double consumo) {
        this.consumo = consumo;
        this.qtd_tanque = 0;
    }

    public void andar(double distancia) {
        double litrosNecessarios = distancia / consumo;
        if (litrosNecessarios <= qtd_tanque) {
            qtd_tanque -= litrosNecessarios;
            System.out.println("Você andou " + distancia + " km. Restam " + qtd_tanque + " litros de gasolina.");
        } else {
            System.out.println("Não há combustível suficiente para andar essa distância.");
        }
    }

    public double obterGasolina() {
        return qtd_tanque;
    }

    public void adicionarGasolina(double mais_gasolina) {
        qtd_tanque += mais_gasolina;
        System.out.println("Adicionou " + mais_gasolina + " litros de gasolina no tanque.");
    }

    public static void main(String[] args) {
        Carro carrin = new Carro(12);
        carrin.adicionarGasolina(100);
        carrin.andar(5);
        System.out.println("Quantidade atual de gasolina: " + carrin.obterGasolina() + " litros.");
    }
}

