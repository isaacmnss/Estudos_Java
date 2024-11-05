package academy.devdojo_maratonajava.javacore.VjavaIO.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//File
//FileWriter
//FileReader
//BufferedWriter
//BufferedReader
public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true)) {
            fw.write("Flamengo"+System.lineSeparator()+"Flamengo");
            fw.flush();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
