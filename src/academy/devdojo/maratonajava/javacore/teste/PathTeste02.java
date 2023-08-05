package academy.devdojo.maratonajava.javacore.Wnio.teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTeste02 {
    public static void main(String[] args) throws IOException {

        Path pastaPath = Paths.get("arquivo2"); // File file = new File("pasta");
        if(Files.notExists(pastaPath)) {
            Path pastaDirectory = Files.createDirectory(pastaPath);
        }
        Path subPastaPath = Paths.get("/subpasta/subsubpasta");
        Path subPastaDirectory = Files.createDirectories(subPastaPath);
        Files.delete(subPastaPath);

    }
}
