# Classes internas

---

## O que são?

Resumidamente uma classe interna, como o próprio nome dá a entender, é uma classe dentro de outra classe.

Geralmente são utilizadas para trabalhas com interfaces gráficas, como em um app com chat, onde teríamos de ter uma classe 
da interface gráfica e uma classe que determina as ações da aplicação.

```java
public class OuterClassesTes01 {
    private String name = "Luffy";

    class Inner{
        
    }
    public static void main(String[] args) {

    }
}
```

A síntaxe é parecida com um método, mas na classe interna podem ser declarados atributos, e a classe interna tem acesso 
a todos os objetos da classe externa

## Funcionamento em código

```java
public class OuterClassesTes01 {
    private String name = "Luffy";

    class Inner{
        public void printOuterClassAttribute(){
            System.out.println(name);
        }
        
    }
    public static void main(String[] args) {
        OuterClassesTes01 outerClass=  new OuterClassesTes01();
        Inner inner = outerClass.new Inner();
        inner.printOuterClassAttribute();

    }
}
```

### Parâmetro `this`

Numa classe interna, o this sempre fará referência ao contexto da classe, ou seja à classe interna, mas ainda
podemos referenciar a classe externa e utilizar o this.

```java
public class OuterClass{
class Inner{
        public void printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClass.this);
        }
    }
}
```

## Classes Locais

---

Classes locais são classes que ficam dentro de um método. Por conta disso, uma vez que o método finaliza, não temos acesso
à classe. Por isso, é necessário instanciar a classe dentro do próprio método para que ela seja utilizável.

```java
public class OuterClassesTest02 {
    private String nome = "Midoriya";

    void print() {
        String lastName = "Izuku";
        class LocalClass {
            public void printLocal() {
                System.out.println(nome);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print();
    }
}
```

As classes locais só podem ter os modificadores de acesso abstract ou final.

Podemos declarar atributos dentro de uma classe local, mas o valor do atributo não pode ser alterado, consequentemente
tornando-o um `final`

## Classes Anônimas

---


As classes anônimas são uma forma de criar uma classe sem precisar dar um nome a ela. Elas são frequentemente usadas para
instanciar rapidamente classes que implementam interfaces ou estendem outras classes, especialmente quando a criação da
classe é temporária e não é necessária em outros pontos do código.

Elas são comumente utilizadas quando precisamos fornecer uma implementação rápida para métodos abstratos de uma interface
ou classe abstrata, como em eventos de interface gráfica ou callbacks.


### Funcionamento em código

As classes anônimas são geralmente instanciadas em um único momento e são definidas diretamente na expressão de 
instância de um objeto.

```java
class Animal{
    public void walk(){
        System.out.println("Animal walking");
    }

public class AnonymousClassTest01 {
    public static void main(String[] args) {

        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Walking in the shadows");
            }
        };
        animal.walk();
    }
    }
}
```

## Classes aninhadas estáticas

