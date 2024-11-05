package academy.devdojo_maratonajava.javacore.VjavaIO.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
       try (FileReader fr = new FileReader(file)) {
//            char[] in = new char[18];
//            fr.read(in);
//           // System.out.println(fr.read()); // retorna um Int que corresponde ao primeiro caractere do texto
//            for (char c : in) {
//                System.out.print(c);
//            }
        int i;
        while ((i=fr.read())!=-1){ // quando o método read chega ao fim do texto ele sempre retorna -1
            System.out.println((char) i);
        }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
