import java.util.Arrays;

public class BuscaBinaria {
    private int[] array;
    private int valor;

    public BuscaBinaria(int[] array, int valor_desejado) {
        this.array = array;
        this.valor = valor_desejado;
    }

    public void ordenarArray() {
        Arrays.sort(this.array);
        System.out.println("Array ordenado: " + Arrays.toString(this.array));
    }

    public int buscaBinaria() {
        int inicio = 0;
        int fim = array.length - 1;
        int meio;
        while (inicio <= fim) {
            meio = inicio + (fim - inicio) / 2;

            if (array[meio] == this.valor) {
                return meio;
            } else if (array[meio] < this.valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] valores = {12, 32, 54, 6, 8, 24, 64, 72, 6, 43};
        BuscaBinaria busca = new BuscaBinaria(valores, 64);
        busca.ordenarArray();
        int resultado = busca.buscaBinaria();

        if (resultado != -1) {
            System.out.println("Valor encontrado no índice: " + resultado);
        } else {
            System.out.println("Valor não encontrado.");
        }
    }
}
