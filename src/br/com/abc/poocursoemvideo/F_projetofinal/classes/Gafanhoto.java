package br.com.abc.poocursoemvideo.F_projetofinal.classes;

public class Gafanhoto extends Pessoa {

    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, char sexo, String login, int totAssistido) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() +
                "login='" + login + '\'' +
                ", totAssistido=" + totAssistido +
                "} ";
    }

    public void viuMaisUm() {
        this.totAssistido += 1;
        this.experiencia += 1;
    }

    @Override
    public void ganharExp() {
        this.experiencia += 1;
        this.totAssistido += 1;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

}
