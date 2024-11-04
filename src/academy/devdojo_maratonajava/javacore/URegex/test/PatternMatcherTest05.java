package academy.devdojo_maratonajava.javacore.URegex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // \d = todos os dígitos
        // \D = tudo que não é dígito
        // \s = todos os espaços em branco ou \t \n \f \r
        // \S = Todos os caracteres não brancos
        // \w = Alfanuméricos e _
        // \W = Todos exceto alfanuméricos e _
        // [] = range
        // ? Zero ou uma
        //* Zero ou mais
        // + uma ou mais
        // {n, m} de n até m
        //()
        // |
        // $
        // . = caractere coringa
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto2 = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";
        System.out.println("Email válido");
        System.out.println(" "+ "#@!zoro@mail.br".matches(regex));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto:  "+texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("Posições encontradas: ");
        while (matcher.find()){
            System.out.println(matcher.start()+" "+ matcher.group()+" ");
        }

        int numeroHex = 0x59F86A;
        System.out.println(numeroHex);
    }
}
