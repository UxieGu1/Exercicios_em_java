//Crie uma classe chamada "ContaBancária" que possui os atributos número da conta e saldo.
//Implemente métodos para depositar e sacar dinheiro da conta. O método sacar deverá analisar
//se será possível sacar o valor requisitado. Em seguida, crie um objeto da classe ContaBancária
//e realize algumas operações de depósito e saque.

package Classes;

public class ContaBancaria {
    private int numero_conta;
    private float saldo_conta;

    public ContaBancaria(int numero, float saldo){
        this.numero_conta = numero;
        this.saldo_conta = saldo;
    }

    public float depositar(int numero, float valor_deposito){
        if(numero == this.numero_conta) {
            this.saldo_conta += valor_deposito;
            System.out.printf("O valor a ser depositado é: R$ %.2f%n", valor_deposito);
            System.out.printf("O valor do saldo atual é: R$ %.2f%n", this.saldo_conta);
        }else {
            System.out.println("Número da conta inválido!");
        }
        return 0;
    }

    public float sacar(int numero, float valor_saque){
        if(numero == this.numero_conta) {
            this.saldo_conta -= valor_saque;
            System.out.printf("O valor a ser sacado é: R$ %.2f%n", valor_saque);
            System.out.printf("O valor do saldo atual é: R$ %.2f%n", this.saldo_conta);
        }else {
            System.out.println("Número da conta inválido!");
        }
        return 0;
    }

    public static void main(String[] args) {
        ContaBancaria objeto = new ContaBancaria(1234567, 1500);
        objeto.depositar(1234567, 10000);
        objeto.sacar(1234567, 5000);
        objeto.sacar(123456, 5000);
    }
}
