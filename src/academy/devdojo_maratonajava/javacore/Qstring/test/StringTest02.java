package academy.devdojo_maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome ="Luffy";
        String numeros = "012345";
        System.out.println(nome.charAt(3)); // retorna o char na posição indicada
        System.out.println(nome.length()); // retorna o tamanho (chars) da String
        System.out.println(nome.replace('f', 'c')); // substitui um char por outro
        System.out.println(nome.toLowerCase()); // torna tudo minúsculo
        System.out.println(nome.toUpperCase()); // torna tudo maiúsculo
        System.out.println(numeros.length());
        System.out.println(numeros.substring(0, 5)); // inicia e termina a impressão em índices determinados
        // A impressão sempre para antes do último índice determinado
        System.out.println(numeros.substring(1)); // dessa forma é feita impressão até o fim da String
        System.out.println(nome.trim()); // remove espaços vazios no início e no fim da String
    }
}
