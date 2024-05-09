package academy.devdojo_maratonajava;

public class Foco_total4_Operadores {
    public static void main(String[] args) {
        // + - / *
        int number01 = 10;
        int number02 = 20;
        int result = number02 / number01;
        System.out.println("Valor: "+ result);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte " +isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez "+ isDezDiferenteDez);

        // && (AND) || (OR) !
        int idade = 21;
        float salario = 3500;

        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta "+ isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+ isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupança = 10000;
        float valorPlaystation = 5000f;
        boolean isPs5Compravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupança > valorPlaystation;
        System.out.println("isPs5Compravel " +isPs5Compravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        System.out.println(bonus);
        bonus -= 1000;
        System.out.println(bonus);
        bonus *= 2;
        System.out.println(bonus);
        bonus /= 2;
        System.out.println(bonus);
        bonus %= 2;
        System.out.println(bonus);

        //
        int contador = 0;
        contador +=1; //contador = contador +1; == contador++
        contador++;
        contador--;
        ++contador;
        --contador;
        System.out.println(contador);
        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(contador2);
        int contador3 = 0;
        System.out.println(++contador3);


    }
}
