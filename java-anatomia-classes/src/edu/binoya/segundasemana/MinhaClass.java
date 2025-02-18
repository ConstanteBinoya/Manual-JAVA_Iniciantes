package edu.binoya.segundasemana;
public class MinhaClass {

    public static void main (String [] args) {   

        //System.out.print ("Olá turma, sejam bem-vindos");

        String primeiroNome = "Constante";
        String segundoNome = "Binoya";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.println(nomeCompleto); 
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {

        return "Resultado do Método = " + primeiroNome.concat(" ").concat(segundoNome);

    }
    
}
