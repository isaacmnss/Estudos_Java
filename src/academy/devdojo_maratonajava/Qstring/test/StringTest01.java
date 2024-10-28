package academy.devdojo_maratonajava.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "William"; // String constant pool
        String nome2 = "William";
        nome.concat("aaasa"); // cria uma nova String sem valor de referência e então concatena
//        System.out.println(nome.equals(nome2)); //compara o valor das Strings
        System.out.println(nome == nome2); // compara se as duas Strings fazem referência ao mesmo objeto

        // A String é imutável, por isso o resultado sempre será true, a não ser que a concatenação seja impressa
        // antes da comparação
        String nome3 = new String("William"); // criando variável de referência, objeto String e uma String no pool
        System.out.println(nome2 == nome3);
        System.out.println(nome2 ==  nome3.intern());

    }
}
