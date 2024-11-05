package academy.devdojo_maratonajava.javacore.VjavaIO.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created "+ isCreated);
            System.out.println("path "+file.getPath());
            System.out.println("Absolute path "+file.getAbsolutePath());
            System.out.println("Is directory "+file.isDirectory());
            System.out.println("Is file "+ file.isFile());
            System.out.println("Is hidden "+ file.isHidden());
            System.out.println("last modified "+ file.lastModified());
            System.out.println("last modified "+ new Date(file.lastModified()));
            System.out.println("last modified "+ Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime());
            boolean exists = file.exists();
           if (exists){
               System.out.println("Deleted "+ file.delete()); ;
           }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
