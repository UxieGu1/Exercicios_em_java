//Crie uma classe chamada "Produto" que possui os seguintes atributos:
//Nome do produto.
//Preço do produto.
//Quantidade em estoque do produto.
//A classe "Produto" deve ter os seguintes métodos:
//Um método para adicionar unidades do produto ao estoque.
//Um método para remover unidades do produto do estoque.
//Um método para exibir todas as informações do produto.
//Crie um objeto da classe "Produto" e teste todos os métodos implementados.

package Classes;

public class Produto {
    String nome_produto;
    float preco_produto;
    int qtd_estoque_produto;

    public Produto(String nome, float preco, int qtd_estoque){
        this.nome_produto = nome;
        this.preco_produto = preco;
        this.qtd_estoque_produto = qtd_estoque;
    }

    public int adicionar_estogue(int numero_mais){
        qtd_estoque_produto += numero_mais;
        return qtd_estoque_produto;
    }

    public int remover_estoque(int numero_menos){
        qtd_estoque_produto -= numero_menos;
        return qtd_estoque_produto;
    }

    public void exibir_info(){
        System.out.println("O nome do produto é: "+ this.nome_produto);
        System.out.println("O preço do produto é: "+ this.preco_produto);
        System.out.println("A quantidade do estoque do produto é: "+ this.qtd_estoque_produto);
    }

    public static void main(String[] args) {
        Produto objeto = new Produto("Creatina", 85.00F, 8);
        objeto.adicionar_estogue(12);
        objeto.remover_estoque(8);
        objeto.exibir_info();

    }

}
