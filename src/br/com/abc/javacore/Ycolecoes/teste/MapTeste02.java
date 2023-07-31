package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Filme;

import java.util.HashMap;
import java.util.Map;

public class MapTeste02 {
    public static void main(String[] args) {

        Consumidor consumidor1 = new Consumidor("Gabriel");
        Consumidor consumidor2 = new Consumidor("Lucas");

        Filme filme1 = new Filme(5L, "Homem Aranha", 25.99);
        Filme filme2 = new Filme(1L, "Vingadores Guerra Infinita", 56.99);
        Filme filme3 = new Filme(56L, "Tron, o legado", 15.99);
        Filme filme4 = new Filme(25L, "A origem", 22.49);
        Filme filme5 = new Filme(7L, "Mamma Mia", 15.49);
        Filme filme6 = new Filme(11L, "Happy Feet", 9.90);

        Map<Consumidor, Filme> consumidorFilme = new HashMap<>();

        consumidorFilme.put(consumidor1, filme2);
        consumidorFilme.put(consumidor2, filme6);

        for(Map.Entry<Consumidor, Filme> entry : consumidorFilme.entrySet()){
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }

    }
}
