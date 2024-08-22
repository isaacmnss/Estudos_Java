package academy.devdojo_maratonajava.javacore.Dconstrutores.domain;

import java.util.Scanner;

public class Anime {
    Scanner scanner = new Scanner(System.in);
    private String nome = scanner.nextLine();
    private String tipo = scanner.nextLine();
    private int episodios = scanner.nextInt();
    private String genero = scanner.nextLine();
    private String estudio = scanner.nextLine();

    public Anime(String nome, String tipo, int episodios, String genero){
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int episodios, String genero, String estudio){
        this(nome, tipo, episodios, genero);
        this.estudio = estudio;
    }

    public Anime(){
        // Sobrecarga de construtor
        System.out.println("Dentro do construtor sem argumentos.");
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void  setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }

    public int getEpisodios(){
        return this.episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
