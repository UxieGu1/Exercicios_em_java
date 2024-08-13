//Crie uma classe chamada "Círculo" que possui o atributo raio. Implemente métodos para calcular
//a área e o perímetro do círculo. Em seguida, crie um objeto da classe Círculo e teste os métodos
//implementados.

package Classes;

public class Circulo {
    private float raio;

    public Circulo(float raio){
        this.raio = raio;
    }
    public float area(){
        float pi = (float) Math.PI;
        float area = pi * (this.raio * this.raio);
        System.out.printf("A área do círculo é: %.2f%n", area);
        return area;
    }
    public float perimetro(){
        float pi = (float) Math.PI;
        float perimetro = 2 * pi * this.raio;
        System.out.printf("A perímetro do círculo é: %.2f%n", perimetro);
        return perimetro;
    }
    public static void main(String[] args) {
        Circulo objeto = new Circulo(4);
        objeto.area();
        objeto.perimetro();
    }
}
