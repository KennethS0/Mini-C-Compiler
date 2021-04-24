package Main;

import Scanner.Scanner;

public class Main {
    public static void main(String[] args) {
        for(String argument: args){
            System.out.println("Analysis File: " + argument);
            Scanner scanner = new Scanner();
            scanner.readFile(argument);
            System.out.println("===== Tokens: ====== \n");
            System.out.println(scanner.getData().toString());
            System.out.println("======== Errors:  ====== \n");
            System.out.println(scanner.getErrors().toString());

        }

    }
}
