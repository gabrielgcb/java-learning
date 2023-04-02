package br.com.abc.javacore.B_introducaometodos.classes;

public class Professor {
    public String nome;
    public String matricula;
    public String rg;
    public String cpf;

    public void imprime() {
        System.out.println("----------------------");
        System.out.println(this.cpf); // this me permite pegar os valores que já estão dentro do próprio objeto
        System.out.println(this.matricula); // não sendo neccessário e referenciar de novo o endereco no qual
        System.out.println(this.rg); // o meu método já se encontra, pois meu método já está dentro do meu objeto
        System.out.println(this.nome); // ou seja, já está no endereco ao qual o meu objeto já se encontra
    }

}
