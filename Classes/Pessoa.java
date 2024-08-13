//Crie uma classe chamada "Pessoa" que possui os atributos nome, idade e profissão. Em
//seguida, crie um objeto da classe Pessoa e atribua valores aos seus atributos. Por fim, exiba na
//tela as informações da pessoa.

package Classes;

public class Pessoa {
    private String nome;
    private int idade;
    private String profissao;

    public Pessoa(String nome, int idade, String profissao){
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }
    public void mostrar_atributos(){
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Profissão: "+ profissao);
    }

    public static void main(String[] args) {
        Pessoa objeto = new Pessoa("Gui", 18, "Desenvolvedor Mobile");
        objeto.mostrar_atributos();
    }

}

