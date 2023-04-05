package br.com.abc.poocursoemvideo.E_polimorfismo.classes;

public abstract class Ave extends Animal {

    private String corPena;

    public Ave(float peso, int idade, int membros, String corPena) {
        super(peso, idade, membros);
        this.corPena = corPena;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Ave{" +
                "corPena='" + corPena + '\'' +
                "}";
    }

    public abstract void fazerNinho();

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

}
