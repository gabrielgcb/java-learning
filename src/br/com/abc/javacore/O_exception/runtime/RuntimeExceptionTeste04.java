package br.com.abc.javacore.O_exception.runtime;

public class RuntimeExceptionTeste04 {
    public static void main(String[] args) {

        try {
            throw new RuntimeException();
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch(IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch(ArithmeticException | NullPointerException | IllegalArgumentException e) {
            System.out.println("Dentro do ArithmeticException ou NullPointerException ou IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

    }
}
