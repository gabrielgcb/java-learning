package br.com.abc.poocursoemvideo.Heranca.teste;

import br.com.abc.poocursoemvideo.Heranca.classes.Aluno;
import br.com.abc.poocursoemvideo.Heranca.classes.Funcionario;
import br.com.abc.poocursoemvideo.Heranca.classes.Professor;

public class HerancaTeste {
    public static void main(String... args) {
        Aluno a1 = new Aluno("Gabriel Bispo", 21, 'M', "Engenharia de Software", "20215604");

        Funcionario f1 = new Funcionario("Joao Alencar", 35, 'M', "Recursos Humanos");
        f1.setTrabalhando(true);

        Professor p1 = new Professor("Lorena Terezza", 26, 'F', "Programacao orientada a objetos", 10500);
        p1.receberAumento(2500f);

        System.out.println(a1);
        System.out.println(f1);
        System.out.println(p1);
    }
}
