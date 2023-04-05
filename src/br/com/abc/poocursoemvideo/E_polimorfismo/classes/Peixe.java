package br.com.abc.poocursoemvideo.E_polimorfismo.classes;

public abstract class Peixe extends Animal {

    private String corEscama;

    public Peixe(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Peixe{" +
                "corEscama='" + corEscama + '\'' +
                "}";
    }

    public abstract void soltarBolha();

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

}