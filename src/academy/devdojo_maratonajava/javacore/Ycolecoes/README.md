# Coleções

---

O pacote de coleções é um dos mais importantes e um dos mais utilizados no dia a dia como desenvolvedor, e nessa seção dissecaremos
os seus usos.

## Equals

---

O equals pode ser utilizado para fazer a comparação de dois valores, no entanto, ao tentar fazer a comparação entre dois objetos, 
recebemos o retorno false, ainda que ambos os objetos tenham os mesmos valores armazenados. Como no exemplo abaixo:

```java
public class equalsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABA2", "Apple");
        Smartphone s2 = new Smartphone("1ABA2", "Apple");
        System.out.println(s1.equals(s2));
    }
}
```

Isso ocorre pois s1 e s2 são variáveis de referência, que fazem referência a objetos **distintos** em memória, como ilustrado abaixo:

<div align="center"> 

![ilustracaoequals.png](/././Images/ilustracaoequals.png)

</div>

Podemos contornar isso declarando as variáveis da seguinte forma, mas isso seria uma má prática e uma redundância.

```java
public class equalsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABA2", "Apple");
        Smartphone s2 = s1;
        System.out.println(s1.equals(s2));
    }
}
```

A maneira correta de fazer essa comparação retornar o valor true é sobrescrevendo o método equals do objeto. 

Para isso, devemos seguir algumas regras. O método equals deve ser Reflexivo, Simétrico, Consistente e Transitivo.

* Reflexivo quer dizer que `x.equals(x)` deve sempre retornar _true_


* Simétrico quer dizer que se `x.equals(y) == true`, `y.equals(x)` também deve retornar _true_


* Consistente quer dizer que `x.equals(x)` sempre retorna _true_ se x for diferente de _null_ e se x != null, `x.equals(null)`
deve retornar _false_


* Transitivo quer dizer que, para x y z diferentes de null, se `x.equals(y) == true` e `x.equals(z) == true`, então `y.equals(z) == true`

O método equals sobrescrito fica desta forma: 

```java
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);

    }
```

Este método verifica se o objeto passado é nulo, se as duas variáveis fazem referência ao mesmo objeto e se os dois objetos 
são da mesma classe, e também verifica se o serial number que é diferente de null é igual ao do objeto passado.


>[!NOTE]
> Este método retornaria true mesmo que os objetos fossem diferentes mas possuíssem o mesmo valor na variável serialNumber,
> o que pode ser um problema a depender da regra de negócio

## Hashcode

---

O Hashcode é um número gerado, que pode auxiliar na performance e usabilidade de algoritmos de busca. 
Um hash bem escrito evita colisões e é utilizado para indexar coleções.

Quanto mais específico o hashcode for, maior será a performance, pois haverá um menor número de objetos dentro do mesmo grupo.

Uma boa forma de compreender o funcionamento do Hash é imaginar que você precisa implementar um algoritmo de busca em um array com muitas posições. 
Se fossemos utilizar o equals para isso, seria necessário verificar os índices do array um a um, o que não seria performático.


<div align="center"> 

![ilustracaoequals.png](/././Images/ilustracaoHashcode.png)

</div>

Utilizando o hashcode, podemos agrupar objetos não necessariamente iguais em diferentes índices (hashes), e buscar pelo
objeto desejado dentro deste grupo utilizando o equals, afunilando os objetos que serão testados e tornando o algoritmo mais performático.



Para implementar um Hashcode, devemos também seguir algumas regras:

* Se `x.equals(y) == true`, então `y.hashCode() == x.hashCode()`


* Se `y.hashCode(x) == x.hashCode`, não necessariamente o `x.equals(y)` deve retornar _true_


* Se `x.equals(y) == false`, então `y.hashCode() != x.hashCode()`


* Se `y.hashCode() != x.hashCode()`, então `x.equals(y)` deve retornar _false_


Utilizando o exemplo do objeto anterior, podemos implementar o hashCode da seguinte forma: 

```java
@Override
    public int hashCode() {
        return serialNumber == null ? 0 : Objects.hashCode(serialNumber);
    }
```

Nesse código verificamos também se o serialNumber é null, para não gerar uma nullPointerException,
mas estamos usando o método padrão de hashcode para Strings do próprio Java

## List

---

Uma List é uma coleção ordenada, ou seja, possui uma sequência. O pacote List é altamente coeso e orientado a interfaces


Podemos inicializar uma lista e indicar qual o tipo de objeto a ser armazenado dentro da lista com a seguinte síntaxe:

```java
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
    } 
```

Diferentemente de um array comum, uma lista é incrementado automaticamente, sem a necessidade reinicializá-la.

Alguns métodos em uma lista também possuem nomes diferentes, por exemplo, ao invés de usar `length` para retornar o tamanho do array, usamos o `size`

Para iterar sob uma lista, podemos usar as seguintes formas:

```java
public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Isaac");
        nomes.add("Meneses");
        nomes.add("Cabral");

        for(Object nome : nomes){
            System.out.println(nome);
        }

        System.out.println("------------");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

    }
```

Para remover um objeto da lista podemos usar o método `lista.remove()`, usando como parâmetro o índice do objeto a ser removido, 
ou o próprio conteúdo. No caso de excluir usando o conteúdo do objeto, é executado o método equals para identificar índices com o valor passado



Podemos também adicionar os valores de um array em outro array, usando o método `lista.addAll(lista2)`, passando como parâmetro uma outra coleção


### Sorting 

Uma das formas de sortir uma lista é usando o método `Collections.sort`, que retorna a lista ordenada, 
no caso de uma lista de Strings, em ordem alfabética e em caso de números, em ordem numérica.

```java
import java.util.Collections;

public static void main(String[] args) {
    List<String> mangas = new ArrayList<>(6);
    mangas.add("One Piece");
    mangas.add("Berserk");
    mangas.add("Fullmetal Alchemist");
    mangas.add("Naruto");
    mangas.add("Bleach");

    Collections.sort(mangas);

    for (String manga : mangas) {
        System.out.println(manga);
    }
}
```

No entanto, há um problema, pois em uma lista de objetos, não fica claro para o Java por onde ele deve começar a ordenação, 
e a tentativa de usar o método `Collections.sort` lança uma Exception. 

Para resolver isso, podemos criar o nosso próprio ordenamento, implementando a interface `Comparable`, 
e o seu método `compareTo`

```java
public class Manga implements Comparable<Manga> {
    private Long id;
    private String nome;
    private double preco;

    @Override
    public int compareTo(Manga outroManga) {
        if(this.id < outroManga.getId()){
            return -1;
        } else if (this.id.equals(outroManga.getId())){
            return 0;
        }else {
            return 1;
        }
    }
} 
```

Dessa forma, o Java consegue organizar numericamente a ordem dos ids, e podemos utilizar o método `Collections.sort()`