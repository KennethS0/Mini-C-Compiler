package Main;

import Scanner.Sintax;


import java.awt.*;
import java.io.File;
import java.io.StringReader;
import java.nio.file.Files;
import java_cup.runtime.Symbol;

public class Main {
    public static void main(String[] args) throws Exception {
        File archivo2;

        archivo2 = new File("testing-files/ScannerTest.c");

        String ST = new String(Files.readAllBytes(archivo2.toPath()));
        Sintax s = new Sintax(new Scanner.ScannerCup(new StringReader(ST)));

        try {
            Object result = s.parse().value;
            System.out.println("Analisis realizado correctamente");
        } catch (Exception ex) {
            Symbol sym = s.getS();
            System.out.println("Error de sintaxis. Linea: " + (sym.right + 1) + " Columna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"");
        }

        /*
        for(String argument: args){
            System.out.println("Analysis File: " + argument);
            Scanner scanner = new Scanner();
            scanner.readFile(argument);
            System.out.println("===== Tokens: ====== \n");
            System.out.println(scanner.getData().toString());
            System.out.println("======== Errors:  ====== \n");
            System.out.println(scanner.getErrors().toString());

        }
        */


    }
}
