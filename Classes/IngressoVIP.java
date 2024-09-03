public class IngressoVIP extends Ingresso {
    private double valor_adicional;

    public IngressoVIP(double valor_reais, double valor_adicional) {
        super(valor_reais);
        this.valor_adicional = valor_adicional;
    }
    public double ingressoVip(){
        return valor_reais + this.valor_adicional;
    }

    public void imprimirValor() {
        System.out.println("Valor do ingresso VIP: R$ " + ingressoVip());
    }
}
