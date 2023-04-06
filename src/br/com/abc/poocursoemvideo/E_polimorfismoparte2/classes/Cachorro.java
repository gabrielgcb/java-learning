package br.com.abc.poocursoemvideo.E_polimorfismoparte2.classes;

public class Cachorro extends Lobo {

    public Cachorro(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    @Override
    public String toString() {
        return super.toString() + "Cachorro{} ";
    }

    @Override
    public void emitirSom() {
        System.out.println("--------- @SUCESSO, O CACHORRO ESTA EMITINDO SOM 'AU AU AU AU AU'");
    }

    public void reagir(String frase) {
        if(frase.equals("Ola!") || frase.equals("Toma comida")) {
            System.out.println("---------- @abanar e latir");
            return;
        }
        System.out.println("---------- @rosnar");
    }

    public void reagir(int hora) {
        if(hora < 12) {
            System.out.println("---------- @abanar");
        } else if(hora > 18) {
            System.out.println("---------- @ignorar");
        } else {
            System.out.println("---------- @abanar e latir");
        }
    }

    public void reagir(boolean dono) {
        if(dono = true) {
            System.out.println("---------- @abanar e latir de alegria");
            return;
        }
        System.out.println("---------- @rosnar");
    }

    public void reagir(int idade, float peso) {
        if(idade < 5) {
            if(peso < 10) {
                System.out.println("---------- @abanar");
            } else {
                System.out.println("---------- @latir");
            }
        } else {
            if(peso < 10) {
                System.out.println("---------- @rosnar");
            } else {
                System.out.println("---------- @ignorar");
            }
        }
    }

}
