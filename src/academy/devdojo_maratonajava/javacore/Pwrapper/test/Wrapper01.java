package academy.devdojo_maratonajava.javacore.Pwrapper.test;

public class Wrapper01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 100;
        char charP = 'P';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;
        // Wrappers são variáveis de referência e geram um objeto
        // Usar tipos primitivos é boa prática

        int i = intW; // unboxing (usar wrapper dentro de tipo primitivo)
        Integer intW2 = Integer.parseInt("1");
//        Integer intW3 = new Integer("2");
        boolean verdadeiro = Boolean.parseBoolean("TrUe");
        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('3'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('T'));
        System.out.println(Character.isLowerCase('T'));

    }
}
