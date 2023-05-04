package br.com.abc.javacore.V_io.teste;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//File - trabalhar com o arquivo
// FileWriter01 - escrever no arquivo
// FileReader - ler o arquivo
// BufferedWriter - escrita no arquivo mais otimizada
// BufferesReader - leitura no arquivo mais otimizada
public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true)) {
            fw.write("O Gabriel esta aprendendo Java, não desista meu parceiro.\nVai dar certo\nConfie em Deus!!!");
            fw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
