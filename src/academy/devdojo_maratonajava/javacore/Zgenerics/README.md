# Generics

---
Generics foram introduzidos no java como uma forma de escrever código mais limpo e com menos validações, mas, simultaneamente,
mantendo a compatibilidade com versões anteriores do Java.

Em versões anteriores, as coleções eram iniciadas sem ser declarado o tipo de elemento que seria armazenado, pois esta era
a única forma possível.

```java
public static void main(String[] args) {
        List list = new ArrayList();
    }
```

O problema disso é que pode ser adicionado qualquer tipo de elemento nesta lista, logo, caso seja necessário manipular 
um elemento dentro da lista, seria necessário verificar o tipo antes de fazer a execução.

```java
public static void main(String[] args) {
        List list = new ArrayList();

        list.add("Midoriya");
        list.add(123L);
        list.add(new Consumidor("Isaac"));

        for (Object o : list) {
            if (o instanceof String){
                System.out.println(o);
            }
            
            if (o instanceof Long){
                System.out.println(o);
            }

            if (o instanceof Object){
                Consumidor c = (Consumidor) o;
                System.out.println(c);
            }
        }
    }
```

Em um programa robusto isso geraria dezenas de linhas de código a mais.

Para manter a compatibilidade, o Generic é adicionado em tempo de compilação

```java
public static void main(String[] args) {
        List<String> list = new ArrayList();
    }
```

No caso, do código acima a lista aceita apenas Strings, e o código não é compilado caso seja adicionado outro tipo na coleção


## Wildcard

---

Quando trabalhamos com listas podemos ter problemas com a lógica polimórfica, pois quanto utilizamos uma lista, o tipo
do objeto deve ser o mesmo passado anteriormente. Ainda que se trate de uma classe-filha.

```java
public class WildcardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsulta();

    }

    private static void printConsulta(List<Animal> animals){
        for (Animal animal : animals) {
            animal.consulta();
        }

    }
}
```

No código acima, não haveria sequer a compilação, pois estamos tentando imprimir um elementos de tipos diferentes do passado 
no parâmetro da função privada.

Para resolver isso, podemos implementar um Wildcard, usando uma `?`

```java
  private static void printConsulta(List<? extends Animal> animals){}
```

Isso faz com que possamos passar qualquer objeto que seja classe-filha da classe Animal, mas por conta disso, não podemos
adicionar outros elementos na lista 

Se quisermos adicionar elementos na lista, podemos fazer da seguinte forma:

```java
 private static void printConstultaAnimal(List<? super Animal> animals){

}
```

Dessa forma podemos passar apenas objetos do tipo Animal ou classes superiores, como Object

## Classes Genéricas

Quando estamos trabalhando com múltiplas classes, em alguns cenários podemos possuir classes com métodos idênticos, 
mas que precisariam de classes service separadas, o que afeta a manutenibilidade do código. Para resolver isso, 
podemos utilizar uma classe Genérica. 

Segue a comparação de uma Classe não genérica vs a mesma classe de forma genérica.

Classe não genérica:

```java
package academy.devdojo_maratonajava.javacore.Zgenerics.service;

import academy.devdojo_maratonajava.javacore.Zgenerics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));

    public Carro retrieveAvailableCar(){
        System.out.println("Buscando carro disponível....");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("alugando carro: "+carro);
        System.out.println("Carros disponíveis para alugar:");
        System.out.println(carrosDisponiveis);
        return carro;
    }

    public void retornarCarro(Carro carro){
        System.out.println("Devolvendo carro: "+carro);
        carrosDisponiveis.add(carro);
        System.out.println("Carros disponíveis para alugar: ");
        System.out.println(carrosDisponiveis);
    }
}

```

Classe genérica:

```java
package academy.devdojo_maratonajava.javacore.Zgenerics.service;

import academy.devdojo_maratonajava.javacore.Zgenerics.domain.Carro;

import java.util.ArrayList;
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
```

Para usar a classe genérica usamos a síntaxe comum, podendo passar objeto desejado.

```java
RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);
```

## Métodos Genéricos

---

Além de classes genéricas podemos também criar métodos que recebem tipos que não são declarados explicitamente.

```java
public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Lancha"));
        System.out.println(barcoList);

    }

    private static <T> List<T> criarArrayComUmObjeto(T t){
        return List.of(t);
    }
}

```

Podemos também indicar que o método aceita apenas objetos comparáveis

```java
private static <T extends Comparable<T>> List<T> criarArrayComUmObjeto(T t){
        return List.of(t);
    }
```