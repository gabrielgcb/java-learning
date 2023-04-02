package br.com.abc.javacore.B_introducaometodos.classes;

public class Estudante {
    private String nome;
    private int idade;
    private float[] notas;
    private boolean aprovado;

    //getters and setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float[] getNotas() {
        return this.notas;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }
    public boolean isAprovado() {
        return this.aprovado;
    }

    public void imprimeDadosEstudante() {
        System.out.println("***** DADOS DO ESTUDANTE *****");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        if(this.getNotas() == null) {
            System.out.println("Esse aluno nao possui notas.");
            return;
        }
        System.out.print("Notas do estudante: ");
        /*for (float nota : this.getNotas()) {
            System.out.print(nota + " | ");
        }*/
        for (int i = 0; i < this.notas.length; i++) {
            System.out.print(this.getNotas()[i] + " | ");
        }
        System.out.println();
    }

    public void calculaMedia(float... notas) {
        if(notas == null){
            System.out.println("Esse aluno nao possui notas.");
            return;
        }
        float media = 0;
        for(float nota : notas) {
            media += nota;
        }
        media = media/notas.length;
        System.out.printf("Media: %.2f\n", media);

        if(media >=6) {
            this.aprovado = true;
            System.out.println("Aprovado.");
        } else {
            this.aprovado = false;
            System.out.println("Reprovado.");
        }
    }

}
