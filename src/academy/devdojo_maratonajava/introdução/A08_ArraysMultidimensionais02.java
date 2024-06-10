package academy.devdojo_maratonajava.introdução;

public class A08_ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        int[] array = {1, 2, 3};

        arrayInt[0] = new int[2];
        // array inicializado com valor padrão de arrays tipo int (0)
        arrayInt[1] = array;
        // array inicializado fazendo referência a outro array, na linha 6, onde foram determinados os valores de cada posição.
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};
        // array inicializado com posições determinadas na mesma linha

        int[][] arrayInt2 = {{0, 0}, {1, 2, 3, 4}, {1, 2, 3, 4, 5, 6}};
        // array multidimensional inicializado com posições determinadas na mesma linha

        for (int[] arrayBase : arrayInt) {
            System.out.println("\n-----");
            for (int num : arrayBase)
                System.out.println(num + " ");
        }
        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n-----");
            for (int num : arrayBase)
                System.out.println(num + " ");
        }
    }
}
