# Classes

Neste capítulo iniciamos os estudos da programação Orientada a Objetos, que é uma das bases do Java. 

Diferente de uma variável de tipo primitivo um objeto ou uma classe, tem uma variável que faz referência a um objeto em memória, e
este objeto, pode conter diversas variáveis.

Geralmente utilizamos classes para armazenar atributos que dão origem a um objeto existente na vida real

```java
public class Carro {
    public String nome;
    public String modelo;
    public int ano;
}
```

Neste caso, temos uma classe que mapeia algo da realidade com atributos, o que é chamado de classe de domínio. 
As classes de domínio geralmente não possuem o método main, logo, não são executáveis

Para inicializar um objeto no código devemos importar a classe (o que é geralmente feito automaticamente pela IDE),
atribuir o tipo da variável (nome da classe), atribuir um nome para a variável que faz referência ao objeto em memória
e criar o objeto

```java
import academy.devdojo_maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public static void main(String[] args) {
    Carro carro = new Carro();

}
```

Para atribuir ou acessar valores em um objeto, devemos usar a variável de referência, e o nome do atributo

```java
import academy.devdojo_maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public static void main(String[] args) {
    Carro carro = new Carro();
    
    carro.ano = 2001;
    carro.nome= "Celta";
    carro.modelo = "Celta LT";

    System.out.println(carro.nome);
    System.out.println(carro.modelo);
    System.out.println(carro.ano);
}
```

Se tentarmos impimir o objeto inteiro usando `System.out.println(carro);`, 
na verdade será impresso o endereço em memória que o objeto está alocado

Podemos também atribuir os valores de um objeto para um segundo objeto do mesmo tipo

```java
public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro1 = new Carro();

        carro.nome = "Celta";
        carro.modelo = "LT Flex";
        carro.ano = 2014;

        carro1.nome = "Corolla";
        carro1.modelo = "LTZ";
        carro1.ano = 2020;

        carro = carro1;
        // Agora a variável carro faz referência ao mesmo objeto carro1, mas isso faz com que os valores de carro sejam perdidos

        System.out.println("Carro 1: " + carro.nome + " " + carro.modelo + " " + carro.ano);
        System.out.println("\n####################");
        System.out.println("\n"+ "Carro 2: "+carro1.nome + " " + carro1.modelo+ " " + carro1.ano);
    }
```

> [!TIP]
> É importante e uma boa prática manter a coesão do código, garantindo que cada classe tenha apenas um propósito.


