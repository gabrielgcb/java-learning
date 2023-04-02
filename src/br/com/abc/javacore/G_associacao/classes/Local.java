package br.com.abc.javacore.G_associacao.classes;

public class Local {
    private String rua;
    private String bairro;

    public String getRua() {
        return rua;
    }

    public void imprimirDadosLocal() {
        System.out.println("--------------------\nDADOS DO LOCAL: ");
        System.out.println("Rua: " + this.rua);
        System.out.println("Bairro: " + this.bairro);
    }

    public Local(String rua, String bairro) {
        this.rua = rua;
        this.bairro = bairro;
    }

    public Local() {
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
