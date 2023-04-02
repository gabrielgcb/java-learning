package br.com.abc.javacore.A_introducaoclasses.teste;

import br.com.abc.javacore.A_introducaoclasses.classes.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.nome = "Lorena";
        prof.matricula = "512";
        prof.rg = "456851-2";
        prof.cpf = "056.845.741-52";

        Professor prof2 = new Professor();
        prof2.nome = "Janaina";
        prof2.matricula = "2010101117";
        prof2.rg = "658498-5";
        prof2.cpf = "651.548.623-51";

        System.out.println(prof);
        System.out.println("Nome: " + prof.nome);
        System.out.println("Matricula: " + prof.matricula);
        System.out.println("RG: " + prof.rg);
        System.out.println("CPF: " + prof.cpf);
        System.out.println("-----------------------------------");
        System.out.println(prof2);
        System.out.println("Nome: " + prof2.nome);
        System.out.println("Matricula: " + prof2.matricula);
        System.out.println("RG: " + prof2.rg);
        System.out.println("CPF: " + prof2.cpf);
    }
}
