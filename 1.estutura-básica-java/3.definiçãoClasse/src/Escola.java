public class Escola {
    public static void main(String[] args) {

        // Criando um objeto aluno1
        Aluno aluno1 = new Aluno();
        
        aluno1.nome = "Carlos";
        aluno1.curso = "Engenharia de Software";
        aluno1.idade = 22;

        // Criando um segundo objeto aluno2
        Aluno aluno2 = new Aluno();
        aluno2.nome = "Ana";
        aluno2.curso = "Medicina";
        aluno2.idade = 25;

        // Chamando métodos para cada objeto
        aluno1.apresentar();
        aluno2.apresentar();
    }
}
