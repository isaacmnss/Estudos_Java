package academy.devdojo_maratonajava.javacore.VjavaIO.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
       try (FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr)){
           String linha;
            while ((linha = br.readLine()) != null){
                System.out.println(linha);// retorna null quando chega ao fim do arquivo
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
