package academy.devdojo_maratonajava.javacore.Gassociação.test;

import academy.devdojo_maratonajava.javacore.Gassociação.domain.Jogador;
import academy.devdojo_maratonajava.javacore.Gassociação.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Pedro");
        Jogador jogador1 = new Jogador("Gerson");
        Time time = new Time("Flamengo");
        Jogador[] jogadores = {jogador, jogador1};

        jogador.setTime(time);
        jogador1.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("----------------- Jogador -----------------");
        jogador.imprime();
        System.out.println("----------------- time -----------------");
        time.imprime();
    }
}
