package curso_java._I_POO_introducao._C_Exercicios_AB._Exe1_Retangulo.entities;

public class Retangulo {
    public double width;
    public double height;

    public double arearetangulo() {
        return width * height;

    }

    public double perimetroRetangulo() {
        return 2 * (width + height);
    }

    public double diagonalRetangulo() {
        return Math.sqrt(width * width + height * height);
    }
}
