package br.com.abc.javacore.D_sobrecargaconstrutores.classes;

public class Estudante {
    private String matricula;
    private String nome;
    private float[] notas;
    private String dataMatricula;

    public Estudante(String matricula, String nome, float[] notas) {
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }
    public Estudante(String matricula, String nome, float[] notas, String dataMatricula) {
        this(matricula, nome, notas); //Chamada para um outro construtor, obrigatoriamente na primeira linha
        this.dataMatricula = dataMatricula;
    }

    public Estudante(){

    }
    public void imprimeDadosEstudante() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.print("Notas: ");
        for(float nota : this.notas) {
            System.out.print(nota + " | ");
        }
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float[] getNotas() {
        return notas;
    }
    public void setNotas(float[] notas) {
        this.notas = notas;
    }
    public String getDataMatricula() {
        return this.dataMatricula;
    }
    public void setdataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

}
