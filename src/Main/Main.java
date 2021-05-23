package Main;

import java.io.File;
import java.io.StringReader;
import java.nio.file.Files;

import Parser.Parser;
import Scanner.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        File archivo2;

        archivo2 = new File("testing-files/ScannerTest.c");

        String ST = new String(Files.readAllBytes(archivo2.toPath()));
        Parser s = new Parser(new Scanner(new StringReader(ST)));

       s.parse();

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
