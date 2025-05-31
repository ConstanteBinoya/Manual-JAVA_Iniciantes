package curso_java._J_POO_ProgramacaoOrientadaObjetos._A_classe_objeto._A_exemplo_triangulo._C_Exercicios_AB._Exe1_Retangulo.entities;

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
