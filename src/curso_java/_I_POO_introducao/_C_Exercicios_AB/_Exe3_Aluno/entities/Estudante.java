package curso_java._I_POO_introducao._C_Exercicios_AB._Exe3_Aluno.entities;

public class Estudante {
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public double notaFinal() {
        return nota1 + nota2 + nota3;
    }
    public double faltaParaPassar() {
        if (notaFinal() < 60.0) {
            return 60.0 - notaFinal();
        }
        else {
            return 0.0;
        }
    }
}
