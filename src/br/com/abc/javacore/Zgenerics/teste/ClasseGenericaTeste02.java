package academy.devdojo.maratonajava.javacore.Zgenerics.teste;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.RentavelService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTeste02 {
    public static void main(String[] args) {

        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Mercedes")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Iate")));

        RentavelService<Carro> carroRentavelService = new RentavelService<>(carrosDisponiveis);

        Carro carro = carroRentavelService.buscarObjetoDisponivel();
        System.out.println("Usando carro por uma semana...");
        carroRentavelService.retornarObjetoAlugado(carro);

        System.out.println("-------------------");

        RentavelService<Barco> barcoRentavelService = new RentavelService<>(barcosDisponiveis);

        Barco barco = barcoRentavelService.buscarObjetoDisponivel();
        System.out.println("Usando barco por um mês...");
        barcoRentavelService.retornarObjetoAlugado(barco);

    }
}
