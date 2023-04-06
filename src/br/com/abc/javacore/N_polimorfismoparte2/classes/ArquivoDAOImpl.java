package br.com.abc.javacore.N_polimorfismoparte2.classes;

public class ArquivoDAOImpl implements GenericDAO {
    @Override
    public void save(){
        System.out.println("---------- @Salvando dados nos arquivos.");
    }
}
