// Crie uma classe para representar um jogador de futebol, com os atributos nome, 
// posição, data de nascimento, nacionalidade, altura e peso. Crie os métodos públicos 
// necessários para sets e gets também um método para imprimir todos os dados do jogador. 
// Crie um método para calcular a idade do jogador e outro método para mostrar quant tempo 
// falta para o jogador se aposentar. Para isso, considere que os jogadores da posição de defesa 
// se aposentam em média aos 40 anos, os jogadores de meio-campo aos 38 e os atacantes aos 35.

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Jogador {
    private String nome;
    private String posição;
    private LocalDate dataNasc;
    private String nacionalidade;
    private float altura;
    private float peso;

    public Jogador(String nome, String posição, LocalDate dataNasc, String nacionalidade, float altura, float peso) {
        this.nome = nome;
        this.posição = posição;
        this.dataNasc = dataNasc;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }

    public int calcularIdade() {
        LocalDate hoje = LocalDate.now();
        return Period.between(dataNasc, hoje).getYears();
    }

    public String tempoParaAposentadoria() {
        int idadeAposentadoria;

        switch (posição.toLowerCase()) {
            case "defesa":
                idadeAposentadoria = 40;
                break;
            case "meio-campo":
                idadeAposentadoria = 38;
                break;
            case "atacante":
                idadeAposentadoria = 35;
                break;
            default:
                return "Posição desconhecida";
        }

        int idadeAtual = calcularIdade();
        int anosRestantes = idadeAposentadoria - idadeAtual;

        if (anosRestantes < 0) {
            return "Já se aposentou";
        } else {
            return anosRestantes + " anos restantes até a aposentadoria";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosição() {
        return posição;
    }

    public void setPosição(String posição) {
        this.posição = posição;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void exibirDados() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataNascFormatada = dataNasc.format(formatter);

        System.out.println("Nome: " + this.nome);
        System.out.println("Posição: " + this.posição);
        System.out.println("Data de Nascimento: " + this.dataNasc);
        System.out.println("Nacionalidade: " + this.nacionalidade);
        System.out.println("Altura: " + this.altura);
        System.out.println("Peso: " + this.peso);
        System.out.println("Idade: " + calcularIdade());
        System.out.println(tempoParaAposentadoria());
    }
    //Classe principal
    public static void main(String[] args) {
        Jogador obj = new Jogador("Guilherme Arana", "defesa", LocalDate.of(2000, 07, 06), "Brasileiro", 1.80F, 83F);
        obj.exibirDados();
    }
}
