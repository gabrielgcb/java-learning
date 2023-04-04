package br.com.abc.poocursoemvideo.Heranca.classes;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    public Professor(String nome, int idade, char sexo, String especialidade, float salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + super.getNome() + '\'' +
                ", idade='" + super.getIdade() + '\'' +
                ", sexo='" + super.getSexo() + '\'' +
                ", especialidade='" + this.especialidade + '\'' +
                ", salario=" + this.salario +
                '}';
    }

    public void receberAumento(float aumento) {
        this.salario += aumento;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
