package Questoes;//Crie uma classe em Java chamada Questoes.Empregado que inclui três partes de
//informações como variáveis de instância – nome (String), sobrenome (String) e um
//salário mensal (double). A classe deve ter um construtor, métodos get e set para cada
//variável de instância. Escreva um aplicativo de teste chamado EmpregadoTeste que cria
//dois objetos Questoes.Empregado e exibe o salário anual de cada objeto. Então dê a cada Questoes.Empregado
//um aumento de 10% e exiba novamente o salário anual de cada Questoes.Empregado.

public class Empregado {
    private String nome;
    private String sobrenome;
    private double salario_mensal;

    public Empregado(String nome, String sobrenome, double salario_mensal){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario_mensal = salario_mensal;
    }

    public void getNome(){
        System.out.println("Nome: "+ this.nome);
    }
    public void setNome(String novo_nome){
        this.nome = novo_nome;
    }
    public void getSobrenome(){
        System.out.println("Sobrenome: "+ this.sobrenome);
    }
    public void setSobrenome(String novo_sobrenome){
        this.sobrenome = novo_sobrenome;
    }
    public void getSalarioMensal(){
        this.salario_mensal *= 12;
        System.out.println("Salario anual: R$ "+ this.salario_mensal);
    }
    public void setSalarioMensal(double novo_salario){
        this.salario_mensal = novo_salario;
    }
    public void aumentoSalarial(){
        this.salario_mensal += (this.salario_mensal * 0.1);
        System.out.println("Salario anual com aumento: R$ "+ this.salario_mensal);
    }
}
