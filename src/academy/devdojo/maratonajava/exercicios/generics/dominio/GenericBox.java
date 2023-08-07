package academy.devdojo.maratonajava.exercicios.generics.dominio;

public class GenericBox<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
