package academy.devdojo_maratonajava.javacore.Gassociação.test;

import academy.devdojo_maratonajava.javacore.Gassociação.domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pedro");
        Jogador jogador2 = new Jogador("Pelé");
        Jogador jogador3 = new Jogador("Arrascaeta");
        Jogador [] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador Jogador : jogadores){
            Jogador.imprime();
        }
    }
}


