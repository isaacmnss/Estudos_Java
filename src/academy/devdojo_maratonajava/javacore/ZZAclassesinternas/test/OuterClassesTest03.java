package academy.devdojo_maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest03 {
    private String name ="Isaac";

    static class Nested{
        private String lastname = " Meneses";
        void print(){
            System.out.println(new OuterClassesTest03().name+lastname);
        }
    }

    public static void main(String[] args) {
        Nested nested =  new Nested();
        nested.print();

    }
}
