package Main;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GenerateFiles {
    public static void main(String[] args) throws Exception {

        String rutaFlexOriginal = "src/Scanner/Regex.flex";
        String rutaFlexCup = "src/Scanner/RegexCup.flex";
        String[] rutaCup = {"-parser", "Sintax", "src/Scanner/Syntax.cup"};
        File archivo;
        archivo = new File(rutaFlexOriginal);
        JFlex.Main.generate(archivo);

        archivo = new File(rutaFlexCup);
        JFlex.Main.generate(archivo);

        java_cup.Main.main(rutaCup);

        Files.move(
                Paths.get("Sintax.java"),
                Paths.get("src/Scanner/Sintax.java")
        );

        Files.move(
                Paths.get("sym.java"),
                Paths.get("src/Scanner/sym.java")
        );
    }
}
