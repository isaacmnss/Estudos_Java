package academy.devdojo_maratonajava.javacore.Gassociação.test;

import academy.devdojo_maratonajava.javacore.Gassociação.domain.Jogador;
import academy.devdojo_maratonajava.javacore.Gassociação.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pedro");
        Time time = new Time("Flamengo");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
