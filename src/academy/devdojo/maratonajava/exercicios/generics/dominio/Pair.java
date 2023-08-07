package academy.devdojo.maratonajava.exercicios.generics.dominio;

public class Pair<T, U> {

    private T valueOfT;
    private U valueOfU;

    public T getFirst() {
        return valueOfT;
    }

    public U getSecond() {
        return valueOfU;
    }

    public void setValueOfT(T valueOfT) {
        this.valueOfT = valueOfT;
    }

    public void setValueOfU(U valueOfU) {
        this.valueOfU = valueOfU;
    }
}
