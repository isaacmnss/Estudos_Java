package academy.devdojo_maratonajava.javacore.Oexception.error.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade(){
        recursividade();
    }

    //o método recursividade está sendo chamado infinitamente pois não tem um limite imposto.
    // Gerando o StackOverflowError
}
