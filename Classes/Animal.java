//Crie uma classe chamada "Animal" que possui os atributos nome e idade. Implemente um
//método para exibir o som do animal. Em seguida, crie objetos das classes "Cachorro", "Gato" e
//"Pato", que herdam da classe Animal, e implemente o método de exibir o som para cada um
//deles.

package Classes;

public class Animal {
    String nome;
    int idade;

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public void somCachorro(){
        System.out.println("AU AU AU");
    }
    public void somGato(){
        System.out.println("MIAU");
    }
    public void somPato(){
        System.out.println("QUACK QUACK");
    }

    public static void main(String[] args) {
        Animal cachorro = new Animal("Chico", 1);
        cachorro.somCachorro();
        Animal gato = new Animal("teo", 3);
        gato.somGato();
        Animal pato = new Animal("zeca", 2);
        pato.somPato();
    }
}
