package academy.devdojo_maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {
    private String nome;
    private static int [] episodios;
    // 0 - Bloco de Inicialização
    // 1- Alocação de espaço em memório
    // 2 - Criação de atributos e inicialização.
    // 3 - bloco de inicialização
    // 4 - construtores.
    static {
        System.out.println("Dentro do bloco de inicialização estático");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização 2");
     }
     static {
         System.out.println("Dentro do bloco de inicialização 3");
     }
     {
        System.out.println("Dentro doo bloco de inicialização não estático");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int episodio : Anime.episodios){
            System.out.print(episodio + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
