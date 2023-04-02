package br.com.abc.javacore.G_associacao.teste;

import br.com.abc.javacore.G_associacao.classes.Aluno;
import br.com.abc.javacore.G_associacao.classes.Professor;
import br.com.abc.javacore.G_associacao.classes.Seminario;
import br.com.abc.javacore.G_associacao.classes.Local;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Gabriel", 21);
        Aluno aluno2 = new Aluno("Joao", 20);
        Aluno aluno3 = new Aluno("Jonas", 19);
        Aluno aluno4 = new Aluno("Luiz", 18);
        Aluno aluno5 = new Aluno("Gabriela", 21);
        Aluno aluno6 = new Aluno("Julia", 20);
        Aluno aluno7 = new Aluno("Saula", 19);
        Aluno aluno8 = new Aluno("Isa", 22);
        Aluno aluno9 = new Aluno("Kaua", 23);
        Aluno aluno10 = new Aluno("Yuan", 20);

        Seminario seminario1 = new Seminario("PROGRAMACAO ORIENTADA A OBJETO");
        Seminario seminario2 = new Seminario("BANCO DE DADOS RELACIONAL COM MYSQL");
        Seminario seminario3 = new Seminario("API SPRING BOOT COM JAVA");

        Professor professor1 = new Professor("ROBERTO ALVES", "LINGUAGEM JAVA");
        Professor professor2 = new Professor("LORENA TEREZA", "FRAMEWORKS E LINGUAGEM OO");
        Professor professor3 = new Professor("VANIA MONTEIRO", "BANCO DE DADOS RELACIONAL");
        Professor professor4 = new Professor("ANDERSON DO CARMO", "PHD EM ENGENHARIA DE SOFTWARE");
        Professor professor5 = new Professor("JOSE LUIZ", "SCRUM MASTER PROJETOS I.A");

        Local local = new Local("Rua 10, Numero 53", "Setor Central");

        aluno1.setSeminario(seminario1);
        aluno2.setSeminario(seminario1);
        aluno3.setSeminario(seminario1);
        aluno4.setSeminario(seminario2);
        aluno5.setSeminario(seminario3);
        aluno6.setSeminario(seminario3);
        aluno7.setSeminario(seminario2);
        aluno8.setSeminario(seminario1);
        aluno9.setSeminario(seminario3);
        aluno10.setSeminario(seminario3);

        seminario1.setLocal(local);
        seminario1.setProfessor(professor1);
        seminario1.setAlunos(new Aluno[]{aluno1, aluno2, aluno3, aluno8});

        seminario2.setLocal(local);
        seminario2.setProfessor(professor4);
        seminario2.setAlunos(new Aluno[]{aluno4, aluno7});

        seminario3.setLocal(local);
        seminario3.setProfessor(professor5);
        seminario3.setAlunos(new Aluno[]{aluno5, aluno6, aluno9, aluno10});

        professor1.setSeminarios(new Seminario[]{seminario1, seminario3});
        professor2.setSeminarios(new Seminario[]{seminario1, seminario3});
        professor3.setSeminarios(new Seminario[]{seminario2});
        professor4.setSeminarios(new Seminario[]{seminario1, seminario2});
        professor5.setSeminarios(new Seminario[]{seminario2});

        /*Seminario[] semArray = new Seminario[1];
        semArray[0] = seminario1;
        professor1.setSeminarios(semArray);*/

        aluno1.imprimirDadosAluno();
        aluno2.imprimirDadosAluno();
        aluno3.imprimirDadosAluno();
        aluno4.imprimirDadosAluno();
        aluno5.imprimirDadosAluno();
        aluno6.imprimirDadosAluno();
        aluno7.imprimirDadosAluno();
        aluno8.imprimirDadosAluno();
        aluno9.imprimirDadosAluno();
        aluno10.imprimirDadosAluno();

        seminario1.imprimirDadosSeminario();
        seminario2.imprimirDadosSeminario();
        seminario3.imprimirDadosSeminario();

        professor1.imprimirDadosProfessor();
        professor2.imprimirDadosProfessor();
        professor3.imprimirDadosProfessor();
        professor4.imprimirDadosProfessor();
        professor5.imprimirDadosProfessor();

        local.imprimirDadosLocal();

    }
}
