package br.com.abc.poocursoemvideo.C_relacionamentoentreclasses.classes;

import jdk.swing.interop.SwingInterOpUtils;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    @Override
    public String toString() {
        return "Lutador{" +
                "nome='" + nome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                ", peso=" + peso +
                ", categoria='" + categoria + '\'' +
                ", vitorias=" + vitorias +
                ", derrotas=" + derrotas +
                ", empates=" + empates +
                '}';
    }

    public void apresentar() {
        System.out.println("********** APRESENTACAO **********");
        System.out.println("---------- @E AGORA, RECEBAM COM MUITOS APLAUSOS O LUTADORRRR " + this.nome + "!!!");
        System.out.println("---------- @NACIONALIDADE: " + this.nacionalidade);
        System.out.println("---------- @IDADE: " + this.idade);
        System.out.println("---------- @PESO: " + this.peso + "Kg");
        System.out.println("---------- @CATEGORIA: " + this.categoria);
        System.out.println("---------- @ALTURA: " + this.altura + "m");
        System.out.println("---------- @VITORIAS: " + this.vitorias);
        System.out.println("---------- @DERROTAS: " + this.derrotas);
        System.out.println("---------- @EMPATES: " + this.empates);
    }

    public void status() {
        System.out.println("********** INFORMACOES DO LUTADOR: **********");
        System.out.println("---------- @NOME: " + this.nome);
        System.out.println("---------- @VITORIAS: " + this.vitorias);
        System.out.println("---------- @DERROTAS: " + this.derrotas);
        System.out.println("---------- @EMPATES: " + this.empates);
    }


    public void ganharLuta() {
        this.vitorias = this.vitorias + 1;
    }
    public void perderLuta() {
        this.derrotas = this.derrotas + 1;
    }
    public void empatarLuta() {
        this.empates = this.empates + 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if(this.peso < 52.2) {
            this.categoria = "Invalido";
            return;
        } else if(this.peso <= 70.3){
            this.categoria = "Leve";
            return;
        } else if(this.peso <= 83.9) {
            this.categoria = "Media";
            return;
        } else if(this.peso <= 120.2) {
            this.categoria = "Pesado";
            return;
        } else {
            this.categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
