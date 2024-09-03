

public class Ingresso {
    public double valor_reais;

    public Ingresso(double valor_reais){
        this.valor_reais = valor_reais;
    }
    
    public void imprimirValor() {
        System.out.println("Valor do ingresso: R$ " + this.valor_reais);
    }

}