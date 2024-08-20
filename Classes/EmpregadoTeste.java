package Questoes;

public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado empregadoUm = new Empregado("Guilherme", "Freires", 2200);
        Empregado empregadoDois = new Empregado("Morgana", "Gomes", 3150);

        //Empregado um
        empregadoUm.getNome();
        empregadoUm.getSobrenome();
        empregadoUm.getSalarioMensal();
        empregadoUm.aumentoSalarial();
        System.out.println();
        //Emprgado dois
        empregadoDois.getNome();
        empregadoDois.getSobrenome();
        empregadoDois.getSalarioMensal();
        empregadoDois.aumentoSalarial();
    }
}
