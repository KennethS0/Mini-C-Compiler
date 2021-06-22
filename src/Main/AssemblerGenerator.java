package Main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AssemblerGenerator {

    public AssemblerGenerator(){}

    public FileWriter assemblerFileWriter;

    public void generateAssemblerFile(String args){
        try {
            String nombreArchivo = args.substring(0, args.length()-2);;

            File assemblerFile = new File(nombreArchivo + ".asm");
            assemblerFile.createNewFile();
            this.assemblerFileWriter = new FileWriter(assemblerFile);
            //TODO Meter.code y todo eso
        } catch (IOException e) {
            System.out.println("Problema al escribir el archivo");
            e.printStackTrace();
        }
    }

    public void writeAssemblerCode(String assemblerLine){
        try { assemblerFileWriter.write(assemblerLine+"\n"); }
        catch (IOException e) { System.out.println("Error al escribir en el archivo ensamblador");  }
    }

    public void closeFile(){
        try { assemblerFileWriter.close(); }
        catch (IOException e) { System.out.println("Error al cerrar el acceso al archivo"); }
    }
}
