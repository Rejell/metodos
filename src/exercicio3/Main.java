package exercicio3;

public class Main {

    public static void main(String[] args) {

        // Retorno
        System.out.println("Exercício de cálculo de área - Retorno");

        double areaQuadrado = Retorno.area(3);
        System.out.println(" Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Retorno.area(5d, 5d);
        System.out.println(" Área do retângulo: " + areaRetangulo);

        double areaTrapesio = Retorno.area(7, 8, 9);
        System.out.println(" Área do trapésio: " + areaTrapesio);

        double areaLosango = Retorno.area(5f,5f);
        System.out.println(" Área do losango: " + areaLosango);

    }

}
