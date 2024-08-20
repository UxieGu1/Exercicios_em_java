package Questoes;

public class DataTeste {
    public static void main(String[] args) {
        Data data = new Data(11, 07, 2023);
        data.displayData();

        data.setDia(5);
        data.setMes(8);
        data.setAno(2024);

        System.out.println("Data modificada:");
        data.displayData();
    }
}
