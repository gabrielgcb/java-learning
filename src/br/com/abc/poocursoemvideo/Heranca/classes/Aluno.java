package br.com.abc.poocursoemvideo.Heranca.classes;

public class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    public Aluno(String nome, int idade, char sexo, String matricula, String curso) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + super.getNome() + '\'' +
                ", idade='" + super.getIdade() + '\'' +
                ", sexo='" + super.getSexo() + '\'' +
                ", matricula='" + this.matricula + '\'' +
                ", curso='" + this.curso + '\'' +
                '}';
    }

    public void cancelarMatricula() {
        this.matricula = null;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
