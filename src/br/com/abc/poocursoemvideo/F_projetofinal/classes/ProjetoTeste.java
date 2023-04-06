package br.com.abc.poocursoemvideo.F_projetofinal.classes;

public class ProjetoTeste {
    public static void main(String[] args) {

        Video[] v = new Video[3];
        v[0] = new Video("AULA 14 POO, CURSO EM VIDEO");
        v[1] = new Video("AULA 15 POO, CURSO EM VIDEO");
        v[2] = new Video("ULTIMA AULA POO, CURSO EM VIDEO");

        v[0].setReproduzindo(true);

        Gafanhoto g = new Gafanhoto("Gabrielson", 21, 'M', "45687", 0);
        System.out.println(g);

        Visualizacao v1 = new Visualizacao(g, v[0]);
        v1.avaliar(10);
        v1.avaliar(98f);
        v1.avaliar();
        System.out.println(v1);

        System.out.println(v[0]);

    }
}
