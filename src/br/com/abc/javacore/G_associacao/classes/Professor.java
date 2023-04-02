package br.com.abc.javacore.G_associacao.classes;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void imprimirDadosProfessor() {
        System.out.println("--------------------\nDADOS DO PROFESSOR: ");
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if(seminarios != null && seminarios.length != 0) {
            System.out.println("Seminarios no qual ira palestrar: ");
            for(Seminario sem : seminarios) {
                System.out.println(sem.getTitulo());
            }
            return;
        }
        System.out.println("O professor nao sera palestrante em nenhum seminario.");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public Seminario[] getSeminarios() {
        return seminarios;
    }
    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

}
