package curso_java._J_POO_ProgramacaoOrientadaObjetos._A_classe_objeto._A_exemplo_triangulo._C_Exercicios_AB._Exe2_Funcionario.application;

import curso_java._J_POO_ProgramacaoOrientadaObjetos._A_classe_objeto._A_exemplo_triangulo._C_Exercicios_AB._Exe2_Funcionario.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeCalculator {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();

        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + employee);
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + employee);

        sc.close();
    }
}
