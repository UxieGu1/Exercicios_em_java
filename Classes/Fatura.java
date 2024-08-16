//Crie uma classe em Java chamada fatura para uma loja de
//suprimentos de informática. A classe deve conter quatro variáveis – o número (String), a
//descrição (String), a quantidade comprada de um item (int) e o preço por item
//(double). A classe deve ter um construtor e um método get e set para cada variável de
//instância. Além disso, forneça um método chamado getTotalFatura que calcula o valor
//da fatura e depois retorna o valor como um double. Se o valor não for positivo, ele deve ser
//configurado como 0. Se o preço por item não for positivo, ele deve ser configurado como 0.0.
//Escreva um aplicativo de teste chamado FaturaTeste (em outro arquivo) que demonstra
//as capacidades da classe Fatura.

package Classes;

public class Fatura {
    private String numero;
    private String descricao;
    private int qtd_comprada_item;
    private double preco_item;

    public Fatura(String numero, String descricao, int qtd_comprada_item, double preco_item) {
        this.numero = numero;
        this.descricao = descricao;
        this.qtd_comprada_item = qtd_comprada_item;
        this.preco_item = preco_item;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void getNumero() {
        System.out.println("Número da fatura: " + this.numero);
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void getDescricao() {
        System.out.println("Descrição da fatura: " + this.descricao);
    }

    public void setQtd_comprada_item(int qtd_comprada_item) {
        this.qtd_comprada_item = qtd_comprada_item;
    }

    public void getQtd_comprada_item() {
        System.out.println("Quantidade comprada: " + this.qtd_comprada_item);
    }

    public void setPreco_item(double preco_item) {
        this.preco_item = preco_item;
    }

    public void getPreco_item() {
        System.out.println("Preço por item: " + this.preco_item);
    }

    public void getTotalFatura() {
        double fatura_total = this.qtd_comprada_item * this.preco_item;
        if (fatura_total < 0 || this.preco_item <= 0) {
            fatura_total = 0.0;
        }
        System.out.println("Total da fatura: " + fatura_total);
    }
}

