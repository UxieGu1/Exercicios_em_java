// Crie uma classe chamada Ingresso, que possui um valor em reais e um método imprimirValor(). 
// Crie uma classe IngressoVIP, que herda de Ingresso e possui um valor adicional. 
// Crie um método que retorne o valor do ingresso VIP (com o adicional incluído). 
// Crie um programa para criar as instâncias de Ingresso e IngressoVIP, mostrando a diferença de preços.

public class IngressoMain {
    public static void main(String[] args) {

        Ingresso ingressoNormal = new Ingresso(100.00);
        System.out.println("Ingresso Normal:");
        ingressoNormal.imprimirValor();
        
        IngressoVIP ingressoVIP = new IngressoVIP(100.00, 50.00);
        System.out.println("\nIngresso VIP:");
        ingressoVIP.imprimirValor();
    }
}