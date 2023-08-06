package academy.devdojo.maratonajava.javacore.ZZDoptional.teste;

import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.Filme;
import academy.devdojo.maratonajava.javacore.ZZDoptional.repositorio.FilmeRepository;

import java.util.Optional;

public class OptionalTeste03 {
    public static void main(String[] args) {

        Optional<Filme> filmeByTitle = FilmeRepository.findByTitle("Os Vingadores");
        filmeByTitle.ifPresent(filme -> filme.setTitulo("Os Vingadores 2"));
        System.out.println(filmeByTitle);

        Optional<Filme> filmeById = FilmeRepository.findById(2);
        filmeById.orElseThrow(IllegalArgumentException::new);

        Filme newFilme = FilmeRepository.findByTitle("Homem-Aranha")
                .orElse(new Filme(6, "Homem-Aranha"));

        System.out.println(newFilme);

    }
}
