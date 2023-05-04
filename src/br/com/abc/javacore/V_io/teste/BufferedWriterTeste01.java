package br.com.abc.javacore.V_io.teste;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTeste01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true);
            BufferedWriter br = new BufferedWriter(fw)) {
            br.write("O Gabriel esta aprendendo Java, não desista meu parceiro. Vai dar certo. Confie em Deus!!!");
            br.newLine();
            br.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
