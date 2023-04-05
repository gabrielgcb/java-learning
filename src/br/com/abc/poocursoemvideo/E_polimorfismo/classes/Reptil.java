package br.com.abc.poocursoemvideo.E_polimorfismo.classes;

public abstract class Reptil extends Animal {

    private String corEscama;

    public Reptil(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    @Override
    public String toString() {
        return super.toString() + " Reptil{" +
                "corEscama='" + corEscama + '\'' +
                "} ";
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

}
