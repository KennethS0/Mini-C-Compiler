package Main;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GenerateFiles {
    public static void main(String[] args) throws Exception {

        String rutaFlexCup = "src/Scanner/Regex.flex";
        String[] rutaCup = {"-parser", "Parser", "src/Parser/Syntax.cup"};
        File archivo;

        archivo = new File(rutaFlexCup);
        JFlex.Main.generate(archivo);

        java_cup.Main.main(rutaCup);

        Files.delete(Paths.get("src/Parser/Parser.java"));
        Files.delete(Paths.get("src/Parser/sym.java"));

        Files.move(
                Paths.get("Parser.java"),
                Paths.get("src/Parser/Parser.java")
        );

        Files.move(
                Paths.get("sym.java"),
                Paths.get("src/Parser/sym.java")
        );
    }
}
