package academy.devdojo_maratonajava.javacore.Xserialização.test;

import academy.devdojo_maratonajava.javacore.Xserialização.domain.Aluno;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Isaac Meneses", "12344321");
         serializar(aluno);
//        deserializar();
    }


    private static void serializar(Aluno aluno){
        Path path = Paths.get("aluno.ser");
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(path))){
            objectOutputStream.writeObject(aluno);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void deserializar(){
        Path path = Paths.get("aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

}


