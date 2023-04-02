package br.com.abc.javacore.G_associacao.classes;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario() {
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Aluno[] getAlunos() {
        return alunos;
    }
    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public Local getLocal() {
        return local;
    }
    public void setLocal(Local local) {
        this.local = local;
    }

    public void imprimirDadosSeminario() {
        System.out.println("--------------------\nDADOS DO SEMINARIO: ");
        System.out.println("Titulo: " + this.titulo);
        if(professor != null) {
            System.out.println("Professor palestrante: " + this.professor.getNome());
        } else {
            System.out.println("Nenhum professor cadastrado para esse seminario.");
        }
        if(local != null) {
            System.out.println("Local: " + this.local.getRua() + ". " + this.local.getBairro());
        } else {
            System.out.println("Nenhum local cadastrado para esse seminario.");
        }
        if(alunos != null && alunos.length != 0) {
            System.out.println("Alunos participantes: ");
                for(Aluno nome : this.alunos) {
                    System.out.println(nome.getNome());
                }
                return;
        }
        System.out.println("Nenhum aluno cadastrado.");
    }

}
