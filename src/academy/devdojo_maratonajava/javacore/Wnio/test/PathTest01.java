package academy.devdojo_maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\ispit\\Documents\\Foco total\\ddj1\\src\\academy\\devdojo_maratonajava\\javacore\\Wnio\\README.md");
        Path p2 = Paths.get("C:\\Users\\ispit\\Documents\\Foco total\\ddj1\\src\\academy\\devdojo_maratonajava\\javacore\\Wnio", "README.md");
        Path p3 = Paths.get("C:", "Users\\ispit\\Documents\\Foco total\\ddj1\\src\\academy\\devdojo_maratonajava\\javacore\\Wnio\\README.md");
        Path p4 = Paths.get("C:","Users", "ispit", "Documents", "Foco total","ddj1", "src", "academy", "devdojo_maratonajava", "javacore", "Wnio", "README.md");
        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());
        System.out.println(p4.getFileName());

    }
}
