package br.com.abc.poocursoemvideo.D_Herancaparte2.classes;

public class Tecnico extends Aluno{

    private String registroProfissional;

    public Tecnico(String nome, int idade, char sexo, String matricula, String curso, String registroProfissional) {
        super(nome, idade, sexo, matricula, curso);
        this.registroProfissional = registroProfissional;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Tecnico{" +
                "registroProfissional='" + registroProfissional + '\'' +
                "} ";
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("--------- @SUCESSO, A MENSALIDADE DO(a) TECNICO(a) " + this.nome + " FOI PAGA.");
    }

    public void praticar() {
        System.out.println("---------- @SUCESSO, O(a) TECNICO(a) " + this.nome + " ESTA PRATICANDO");
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
