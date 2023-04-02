package br.com.abc.javacore.F_modificadorestatico.classes;

public class Carro {
    // Velocidade limite deve ser de 240km/h
    private String nome;
    private float velocidadeMaxima;
    private static float velocidadeLimite = 240;

    public Carro(String nome, float velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro() {
    }

    // Não é possível acessar atributos não-estáticos a partir de metodos estáticos, pois os métodos estáticos
    // existem antes mesmo da criação do objeto, ou seja, no tempo que o programa estaria sendo compilado
    // o objeto e os seus atributos estáticos ainda não foram instaciados, pois os atributos não estáticos só são
    // criados no momento em que o objeto é instaciad logo os métodos estáticos não "enxergam" os
    // atributos não-estáticos
    // Relebrando...
    // Ordem de execucao de um programa java:
    // 1º Alocado espaço na memoria para o objeto que será criado
    // >>> Nesse momento a classe já está criada, mas o objeto e seus atributos ainda não <<<
    // 2º Cada atributo de classe é criado e inicializado com seus valores default ou valores explicitos
    // 3º Bloco de inicialização é executado
    // 4º O construtor é executado
    public void imprimeDadosCarro() {
        System.out.println("--------------------\nDados do carro: ");
        System.out.println("Nome: " + this.nome);
        System.out.println("Valocidade maxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade limite " + velocidadeLimite);
    }

    public static void setVelocidadeLimite(float velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }
    public static float getVelocidadeLimite() {
        return velocidadeLimite;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public void setVelocidadeMaxima(float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }


}
