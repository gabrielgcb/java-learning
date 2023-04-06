package br.com.abc.poocursoemvideo.F_projetofinal.classes;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    @Override
    public String toString() {
        return "Visualizacao{" +
                "espectador=" + espectador +
                ", filme=" + filme +
                '}';
    }

    public void avaliar() {
        filme.setViews(filme.getViews()+1);
        filme.setAvaliacao(filme.getAvaliacao() + 1);
    }

    public void avaliar(int nota) {
        filme.setAvaliacao(nota);
        filme.setAvaliacao(filme.getAvaliacao() + 1);
    }

    public void avaliar(float porcentagem) {
        filme.setAvaliacao((int)porcentagem/100);
        filme.setAvaliacao(filme.getAvaliacao() + 1);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
}
