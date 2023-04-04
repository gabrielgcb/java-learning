package br.com.abc.poocursoemvideo.D_Heranca.classes;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    public Funcionario(String nome, int idade, char sexo, String setor) {
        super(nome, idade, sexo);
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + super.getNome() + '\'' +
                ", idade='" + super.getIdade() + '\'' +
                ", sexo='" + super.getSexo() + '\'' +
                ", setor='" + this.setor + '\'' +
                ", trabalhando=" + this.trabalhando +
                '}';
    }

    public void mudarTrabalho(String novoTrabalho) {
        this.setor = novoTrabalho;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
