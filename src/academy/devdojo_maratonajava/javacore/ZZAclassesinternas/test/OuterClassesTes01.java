package academy.devdojo_maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTes01 {
    private String name = "Luffy";

    class Inner{
        public void printOuterClassAttribute(){
            System.out.println(name);
        }
        
    }
    public static void main(String[] args) {
        OuterClassesTes01 outerClass=  new OuterClassesTes01();
        Inner inner = outerClass.new Inner();
        inner.printOuterClassAttribute();

    }
}
