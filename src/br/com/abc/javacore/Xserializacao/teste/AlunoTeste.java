package academy.devdojo.maratonajava.javacore.Xserializacao.teste;

import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Aluno;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AlunoTeste {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno(65_412, "Gabriel Bispo", "7849656");
        Aluno aluno2 = new Aluno(21_954, "Lucas Bispo", "456423");
        Aluno aluno3 = new Aluno(54_452, "Joao Ricardo", "4567897");
        Aluno aluno4 = new Aluno(25_430, "Leticia Souza", "12345678");
        Aluno aluno5 = new Aluno(55_811, "Araujo Lima", "1234567");
        Aluno aluno6 = new Aluno(87_418, "Euripdes Augusto", "967634");

        Aluno[] alunos = new Aluno[]{aluno1, aluno2, aluno3, aluno4, aluno5, aluno6};

        for (Aluno aluno : alunos) {
            serializar(aluno);
        }

        for (Aluno aluno : alunos) {
            deSerializar(aluno.getId());
        }
    }

    private static void serializar(Aluno aluno) {
        String caminho = "pasta/aluno_" + aluno.getId() + ".ser";
        Path path = Paths.get(caminho);
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deSerializar(long matricula) {
        String caminho = "pasta/aluno_" + matricula + ".ser";
        Path path = Paths.get(caminho);
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

