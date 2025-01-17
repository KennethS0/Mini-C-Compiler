package Main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import Parser.Parser;
import Scanner.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        for (int i = 0; i < args.length; i++) {
            File archivo;
            archivo = new File(args[i]);

            String ST = new String(Files.readAllBytes(archivo.toPath()));
            Scanner scanner = new Scanner(new StringReader(ST));
            Parser s = new Parser(scanner);

            s.assemblerGenerator.generateAssemblerFile(args[i]);
            s.parse();
            s.assemblerGenerator.closeFile();
            System.out.println(scanner.toString());
            System.out.println(s.toString());

            if (!s.getErroresSemanticos().isEmpty()) {
                s.assemblerGenerator.archivo.delete();
            }
        }
        /*
        for(String argument: args){
            System.out.println("Analysis File: " + argument);
            Scanner scanner = new Scanner();
            scanner.readFile(argument);
            System.out.println(scanner.toString());
        }

         */
    }
}
