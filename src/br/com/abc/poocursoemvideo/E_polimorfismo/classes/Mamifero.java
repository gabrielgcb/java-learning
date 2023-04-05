package br.com.abc.poocursoemvideo.E_polimorfismo.classes;

public abstract class Mamifero extends Animal {

    protected String corPelo;

    public Mamifero(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros);
        this.corPelo = corPelo;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Mamifero{" +
                "corPelo='" + corPelo + '\'' +
                "}";
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

}