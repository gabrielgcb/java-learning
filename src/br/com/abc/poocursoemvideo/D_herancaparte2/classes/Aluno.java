package br.com.abc.poocursoemvideo.D_herancaparte2.classes;

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
        return super.toString() +
                " Aluno(a){" +
                "matricula='" + matricula + '\'' +
                ", curso='" + curso + '\'' +
                "}";
    }

    public void pagarMensalidade() {
        System.out.println("--------- @SUCESSO, A MENSALIDADE DO ALUNO(a) " + this.nome +" FOI PAGA.");
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
