//Implemente uma classe Aluno, que deve ter os seguintes atributos: nome, curso, tempoSemDormir (em horas).
//Essa classe deverá ter os seguintes métodos:
//estudar (que recebe como parâmetro a qtd de horas de estudo e acrescenta tempoSemDormir )
//– Dormir (que recebe como parâmetro a qtd de horas de sono e reduz tempoSemDormir )
//Crie um código de teste da classe, criando um objeto da classe aluno e usando os métodos estudar e dormir. Ao
//final imprima quanto tempo o aluno está sem dormir.

package Classes;

public class Aluno {
    private String nome_aluno;
    private String curso;
    private int tempo_sem_dormir;

    public Aluno(String nome, String curso, int tempo){
        this.nome_aluno = nome;
        this.curso = curso;
        this.tempo_sem_dormir = tempo;
    }
    public int estudar(int qtd_horas){
        this.tempo_sem_dormir += qtd_horas;
        System.out.println("O Aluno " + this.nome_aluno + " está a um total de " + tempo_sem_dormir + " horas sem dormir");
        return this.tempo_sem_dormir;
    }
    public int dormir(int qtd_horas_sono){
        this.tempo_sem_dormir -= qtd_horas_sono;
        System.out.println("O Aluno " + this.nome_aluno + " está a um total de " + tempo_sem_dormir + " horas sem dormir");
        return this.tempo_sem_dormir;
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Riquelme", "informática", 10);
        aluno.estudar(24);
        aluno.dormir(18);
    }
}
