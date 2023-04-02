package br.com.abc.poocursoemvideo.A_introducao.classes;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public Caneta(String cor, String modelo, boolean tampada) {
        this.setCor(cor);
        this.setModelo(modelo);
        this.setTampada(tampada);
    }

    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return this.cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
    public int getCarga() {
        return this.carga;
    }
    public void setCarga(int carga) {
        this.carga = carga;
    }
    public boolean isTampada() {
        return this.tampada;
    }
    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void status() {
        System.out.println("Modelo da caneta: " + this.getModelo());
        System.out.println("Cor da caneta: " + this.getCor());
        System.out.println("Ponta da caneta: " + this.getPonta());
        System.out.println("Carga da caneta: " + this.getCarga());
        System.out.println("A caneta esta tampada? " + this.isTampada());
    }
    public void rabiscar() {
        if(this.isTampada()) {
            System.out.println("Erro, a caneta esta tampada.");
        } else {
            System.out.println("Rabisco...");
        }
    }
    public void tampar() {
        this.setTampada(true);
    }
    public void destampar() {
        this.setTampada(false);
    }

}
