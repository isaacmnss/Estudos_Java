package academy.devdojo_maratonajava.javacore.Oexception.exception.test;

import academy.devdojo_maratonajava.javacore.Oexception.exception.domain.Leitor1;
import academy.devdojo_maratonajava.javacore.Oexception.exception.domain.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {

    }
    public static void lerArquivo() {
        try (Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2()){

        }catch (IOException e){
        }
    }

    // SEM TRY WITH RESOURCES
//    public static void  lerArquivo(){
//        Reader reader = null;
//        try{
//            reader = new BufferedReader(new FileReader("teste.txt"));
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }finally {
//            try {
//                reader.close();
//            }catch (IOException e){
//                e.printStackTrace();
//            }
//        }
//    }

}
