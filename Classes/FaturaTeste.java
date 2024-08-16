package Classes;

public class FaturaTeste {
    public static void main(String[] args) {
        Fatura faturaTeste = new Fatura("12345", "Fonte ATX", 10, 50.0 );
        faturaTeste.getNumero();
        faturaTeste.getDescricao();
        faturaTeste.getQtd_comprada_item();
        faturaTeste.getPreco_item();
        faturaTeste.getTotalFatura();
    }
}
