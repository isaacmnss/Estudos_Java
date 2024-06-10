package academy.devdojo_maratonajava.introdução;

public class A07_Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, double
        // char '\u0000 '''
        // boolean false
        // String null

        String [] nomes = new String[4];
        nomes[0] = "Isaac";
        nomes[1] = "Gisele";
        nomes[2] = "Fabricio";
        nomes[3] = "Marli";

        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
        nomes = new String[5];
        System.out.println(nomes[1]);


    }
}
