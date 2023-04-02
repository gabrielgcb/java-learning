package br.com.abc.javacore.B_introducaometodos.teste;

import br.com.abc.javacore.B_introducaometodos.classes.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.cpf = "056.651.984-78";
        prof.matricula = "11-7";
        prof.rg = "569842-5";
        prof.nome = "Lorena";

        Professor prof2 = new Professor();
        prof2.cpf = "621,654,952-03";
        prof2.matricula = "20173265";
        prof2.rg = "658471-2";
        prof2.nome = "Janaina";

//        prof.imprime(prof); //Passando um paramentro do tipo reference, fazendo que aux tenha a mesma referencia que prof/prof2
//        prof.imprime(prof2); //Passando o endereço de memoria do objeto prof/prof2

        prof.imprime();
        prof2.imprime();
    }
}
