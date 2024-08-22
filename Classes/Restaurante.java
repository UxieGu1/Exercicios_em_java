package classes;

import java.util.Scanner;

public class Empresa {
    private String nome_empresa;
    private String endereco;
    private String cidade;
    private String estado;
    private int cep;
    private String fone;

    public Empresa() {
        this.nome_empresa = "";
        this.endereco = "";
        this.cidade = "";
        this.estado = "";
        this.cep = 0;
        this.fone = "";
    }

    public Empresa(String nome_empresa, String endereco, String cidade, String estado, int cep, String fone) {
        this.nome_empresa = nome_empresa;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.fone = fone;
    }

    public void get() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome da empresa:");
        this.nome_empresa = scanner.nextLine();
        System.out.println("Digite o endereço:");
        this.endereco = scanner.nextLine();
        System.out.println("Digite a cidade:");
        this.cidade = scanner.nextLine();
        System.out.println("Digite o estado:");
        this.estado = scanner.nextLine();
        System.out.println("Digite o CEP:");
        this.cep = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o telefone (formato: (XX)XXXXX-XXXX):");
        this.fone = scanner.nextLine();
    }

    public void print() {
        System.out.println("Nome da empresa: " + this.nome_empresa);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Estado: " + this.estado);
        System.out.println("CEP: " + this.cep);
        System.out.println("Telefone: " + this.fone);
    }
}

class Restaurante extends Empresa {
    private String tipo_comida;
    private double preco_medio_prato;

    public Restaurante() {
        super();
        this.tipo_comida = "";
        this.preco_medio_prato = 0.0;
    }

    public Restaurante(String nome_empresa, String endereco, String cidade, String estado, int cep, String fone,
                        String tipo_comida, double preco_medio_prato) {
        super(nome_empresa, endereco, cidade, estado, cep, fone);
        this.tipo_comida = tipo_comida;
        this.preco_medio_prato = preco_medio_prato;
    }

    @Override
    public void get() {
        Scanner scanner = new Scanner(System.in);
        super.get();
        System.out.println("Digite o tipo de comida:");
        this.tipo_comida = scanner.nextLine();
        System.out.println("Digite o preço médio do prato:");
        this.preco_medio_prato = scanner.nextDouble();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Tipo de comida: " + this.tipo_comida);
        System.out.println("Preço médio do prato: R$ " + this.preco_medio_prato);
    }

    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        restaurante.get();
        System.out.println("\nDados do Restaurante:");
        restaurante.print();
    }
}
