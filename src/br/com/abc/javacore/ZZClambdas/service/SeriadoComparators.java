package br.com.abc.javacore.ZZClambdas.service;

import br.com.abc.javacore.ZZClambdas.dominio.Seriado;

public class SeriadoComparators {

    public static int compareByName(Seriado s1, Seriado s2) {
        return s1.getName().compareTo(s2.getName());
    }

    public static int compareByEpisodes(Seriado s1, Seriado s2) {
        return Integer.compare(s1.getEpisodes(), s2.getEpisodes());
    }

    public int compareByNameNonStatic(Seriado s1, Seriado s2) {
        return s1.getName().compareTo(s2.getName());
    }

}
