//Crie uma classe em Java chamada Data que inclui três informações
//como variáveis de instância – mês (int), dia (int) e ano (int). A classe deve ter métodos
//get e set para cada variável e um construtor que inicializa as variáveis e assume que os valores
//fornecidos são corretos. Forneça um método displayData que exibe o dia, o mês e o ano
//separados por barras normais ( / ). Escreva um aplicativo de teste chamado DataTeste que
//demonstra as capacidades da classe Data.

package Questoes;

public class Data {
    private int mes;
    private int dia;
    private int ano;

    public Data(int mes, int dia, int ano){
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }
    public void getMes(){
        System.out.println("Mês: "+ this.mes);
    }
    public void setMes(int novo_mes){
        this.mes = novo_mes;
    }
    public void getDia(){
        System.out.println("Dia: "+ this.dia);
    }
    public void setDia(int novo_dia){
        this.dia = novo_dia;
    }
    public void getAno(){
        System.out.println("Ano: "+ this.ano);
    }
    public void setAno(int novo_ano){
        this.ano = novo_ano;
    }
    public void displayData(){
        System.out.printf(" %d / %d / %d", this.dia, this.mes, this.ano);
        System.out.println();
    }
}
