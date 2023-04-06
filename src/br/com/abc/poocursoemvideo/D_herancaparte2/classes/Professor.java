package br.com.abc.poocursoemvideo.D_herancaparte2.classes;

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
        return super.toString() +
                " Professor{" +
                "especialidade='" + this.especialidade + '\'' +
                ", salario=" + this.salario +
                "} ";
    }

    public void receberAumento(float acrescimoSalario) {
        this.salario += acrescimoSalario;
        System.out.println("---------- @SUCESSO, O SALARIO DO(a) PROFESSOR(a) " + this.nome + " RECEBEU UM AUMENTO (+"+acrescimoSalario+")");
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
