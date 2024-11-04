package academy.devdojo_maratonajava.javacore.URegex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = todos os dígitos
        // \D = tudo que não é dígito
        // \s = todos os espaços em branco ou \t \n \f \r
        // \S = Todos os caracteres não brancos
        // \w = Alfanuméricos e _
        // \W = Todos exceto alfanuméricos e _
        String regex = "\\W";
//        String texto = "abaaba";
        String texto2 = "h@hj212hvsa12";
        Pattern pattern = Pattern.compile(regex);
//        pattern.matcher(texto);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto:  "+texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("Posições encontradas: ");
        while (matcher.find()){
            System.out.println(matcher.start()+" "+ matcher.group()+" ");
        }
    }
}
