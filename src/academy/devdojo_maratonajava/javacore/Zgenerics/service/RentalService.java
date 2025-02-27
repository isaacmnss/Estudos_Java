package academy.devdojo_maratonajava.javacore.Zgenerics.service;
import java.util.List;

public class RentalService<T>{
    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis){
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T retrieveAvailableObject(){
        System.out.println("Buscando carro disponível....");
        T t = objetosDisponiveis.remove(0);
        System.out.println("alugando carro: "+t);
        System.out.println("Carros disponíveis para alugar:");
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void retornarObjeto(T t){
        System.out.println("Devolvendo carro: "+t);
        objetosDisponiveis.add(t);
        System.out.println("Carros disponíveis para alugar: ");
        System.out.println(objetosDisponiveis);
    }
}
