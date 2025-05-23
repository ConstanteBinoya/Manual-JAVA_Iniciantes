package curso_java._I_POO_ProgramacaoOrientadaObjetos._A_classe_objeto._A_exemplo_triangulo._C_Exercicios_AB._Exe2_Funcionario.entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax; // Aqui é um valor em reais, não um percentual.

    public double netSalary() {
        return grossSalary - tax;
    }
    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * percentage / 100.0;
    }
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", netSalary());
    }
}
