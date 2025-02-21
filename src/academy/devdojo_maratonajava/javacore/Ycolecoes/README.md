# Coleções

---

O pacote de coleções é um dos mais importantes e um dos mais utilizados no dia a dia como desenvolvedor como meios de armazenar dados,
o Java possui diversos pacotes de coleção que serão abordados neste capítulo.


<div align="center">

![ilustracaoequals.png](/././Images/diagrama_collections.jpg)
</div>


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



Podemos também adicionar os valores de um array em outro array, usando o método `lista.addAll(lista2)`, passando como 
parâmetro uma outra coleção


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

Outra forma de fazer isso é usando o método compareTo que já foi implementado no Wrapper da classe `Long`. Assim, 
podemos substituir todo o código acima por apenas uma linha:

```java
public class Manga implements Comparable<Manga> {
    private Long id;
    private String nome;
    private double preco;

    @Override
    public int compareTo(Manga outroManga) {
        return this.id.compareTo(outroManga.getId());
    }
} 
```

Só podemos fazer essa implementação caso não estejamos lidando com tipos primitivos. No entanto, ainda podemos fazer o 
casting de um tipo primitivo para um Wrapper, e assim implementar o método `.compare`

```java
public class Manga implements Comparable<Manga> {
    private Long id;
    private String nome;
    private double preco;

    @Override
    public int compareTo(Manga outroManga) {
        return Double.compare(preco, outroManga.getPreco());
    }
} 
```


Outra interface utilizada para sortir a lista é a `Comparator`. Para implementar a Comparator devemos criar uma nova classe
que implementa a interface comparator e implementar o método compare dentro desta classe. 

```java
class MangaByIdComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga( 4L,"One Piece", 32.5));
        mangas.add(new Manga( 2L,"Berserk", 32.5));
        mangas.add(new Manga( 1L,"Fullmetal Alchemist", 32.5));
        mangas.add(new Manga( 5L,"Naruto", 32.5));
        mangas.add(new Manga( 3L,"Bleach", 32.5));


        mangas.sort(new MangaByIdComparator());

        for (Manga manga : mangas){
            System.out.println(manga);
        }

    }
}
```

Essa abordagem permite que a lista seja sortida de formas diferentes sem fazer alterações no código ou até mesmo
quebrar o código.

#### Binary Search

---

Outro método de fazer busca em uma coleção ou Array é o Binary Search, com a diferença que o binary search retorna também
a posição em que um elemento deve ser inserido caso ele não exista, mas para que isso ocorra, a lista deve ser ordenada.

Os parâmetros do método `Collections.binarySearch` são a lista, o valor que se deseja encontrar, e caso necessário, o comparator utilizado.

Caso o valor não seja encontrado, o método retorna o índice em que ele deveria ser inserido conforme o sorting da lista - 1

Por exemplo, no caso de um valor que não exista, mas pode ser adicionado no índice 0, o método retorna -1.

Se essa regra não existisse, se fizéssemos a chamada do método para o valor no índice zero e também para um valor que
pode ser adicionado no índice 0, o método retornaria 0 em ambos os casos, o que não ocorre.

```java
public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);
        // (-(ponto de inserção)-1)
        Collections.sort(numeros);
        System.out.println(Collections.binarySearch(numeros, 0));
        System.out.println(Collections.binarySearch(numeros, -1));

    }
```


### Conversão

---

Em alguns casos podemos querer fazer a conversão de um array para uma lista e vice-versa.

No caso da conversão de uma Lista para um array, podemos usar o método `.toArray`, como no código a seguir:

```java
 public static void main(String[] args) {
    List<Integer> numeros = new ArrayList<>();
    numeros.add(1);
    numeros.add(2);
    numeros.add(3);
    Integer[] listToArray = numeros.toArray(new Integer[0]);
    System.out.println(Arrays.toString(listToArray));
}
```

Já no caso da conversão de um array para lista, temos algumas opções


 Utilizando o método `Arrays.asList`:

```java
public static void main(String[] args) {
    Integer [] numerosArray = new Integer[3];
    numerosArray[0] = 1;
    numerosArray[1] = 2;
    numerosArray[2] = 3;

    List<Integer> arraysToList = Arrays.asList(numerosArray);
    System.out.println(Arrays.toString(numerosArray));
    System.out.println(arraysToList);
}
```

>[!WARNING]
> O método Arrays.asList cria uma ligação entre a lista e o array original, então se for feita alguma alteração nos 
> elementos da lista, ela se refletirá no array. Em decorrência disso não é possível adicionar um elemento na lista 
> usando este método

Para contornar isso, podemos criar um ArrayList e passar no parâmetro deste, a conversão do array para lista.

```java
List<Integer> numerosList =  new ArrayList<>(Arrays.asList(numerosArray));
```

### Remoção de objetos

---

Em alguns casos, podemos querer remover um elemento de uma lista. Para isso, podemos usar a iteração foreach, mas isso 
geraria uma exceção

```java
public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga( 4L,"One Piece", 32.5, 0));
        mangas.add(new Manga( 2L,"Berserk", 32.5, 5));
        mangas.add(new Manga( 1L,"Fullmetal Alchemist", 32.5, 0));
        mangas.add(new Manga( 5L,"Naruto", 32.5, 2));
        mangas.add(new Manga( 3L,"Bleach", 32.5, 0));

        for (Manga manga : mangas){
            if (manga.getQuantidade()==0){
                mangas.remove(manga);
            }
        }
    }
```

Uma boa forma de fazer a remoção, seria utilizando um Iterator. Um iterator é uma classe que faz validações antes que 
seja feita alguma ação.

```java
public static void main(String[] args) {
    Iterator<Manga> mangaIterator = mangas.iterator();
    while (mangaIterator.hasNext()){
        if (mangaIterator.next().getQuantidade() == 0 ){
            mangaIterator.remove();
        }
    }
}
```

No caso acima, o iterator verifica se existe um objeto seguinte para fazer a remoção


Uma outra forma de remover objetos da lista, seria utilizando o método `Collections.removeIf`


```java
public static void main(String[] args) {
    mangas.removeIf(manga -> manga.getQuantidade()==0);
}
```


## Set e HashSet

O Set é uma interface da Collections que não permite elementos duplicados dentro da coleção.
Antes de inserir um atributo no Set, o Java valida por meio do método equals se ele já existe na coleção e caso já exista, é ignorado.

O Set não é indexado, então não é possível imprimir um elemento de um índice. Para isso, seria necessário iterar sob a coleção

```java
 public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga( 4L,"One Piece", 32.5, 0));
        mangas.add(new Manga( 2L,"Berserk", 32.5, 5));
        mangas.add(new Manga( 1L,"Fullmetal Alchemist", 32.5, 0));
        mangas.add(new Manga( 5L,"Naruto", 32.5, 2));
        mangas.add(new Manga( 3L,"Bleach", 32.5, 0));


        for (Manga manga: mangas){
            System.out.println(manga);
        }
    }
```

O HashSet não mantém a ordem de inserção dos elementos, e caso desejemos preservar esta ordem podemos usar um LinkedHashSet

```java
Set<Manga> mangas = new LinkedHashSet<>();
```

## NavigableSet e TreeSet

O NavigableSet é uma interface, e o TreeSet é uma das classes que implementa essa interface.

O TreeSet possui algumas regras, como, por exemplo, para adicionar um objeto em um, este objeto deve ser comparable, 
e também o TreeSet não utiliza o equals para comparar elementos, mas sim o compareTo

Caso o objeto não seja comparable, podemos criar um comparator e passar este dentro do parâmetro do TreeSet

```java
class SmartphoneMarcaComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

public class NavigableSetTest {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Apple");
        set.add(smartphone);
        System.out.println(set);
    }
}
```

Outra regra do `TreeSet` é que ele sempre faz a organização da coleção automaticamente, baseado no `compareTo`, 
mesmo que tenha sido inserido um novo elemento da coleção

Por se tratar de um `Set`, o `TreeSet` também não aceita duplicatas, mas por não utilizar o equals para comparar elementos,
se o atributo usado no compareTo for diferente entre 2 objetos, mas todos os outros atributos são iguais, então o elemento pode ser adicionado à coleção.


Por conta destes comportamentos, é ideal utilizar o TreeSet quando a classe implementa um `Comparable` ou `Comparator`

Para retornar a lista inversa, podemos iterar sob a coleção usando o método `descendingSet`


Há ainda 4 outros métodos interessantes do TreeSet, são eles: `lower`, `floor`, `higher`  e `ceiling`


Esses são métodos de comparação

`lower` retorna um objeto com valor imediatamente menor em relação ao parâmetro passado.

`floor` retorna todos os objetos com valor menor ou igual ao parâmetro passado.

`higher` retorna um objeto com valor imediatamente maior em relação ao parâmetro passado.

`ceiling` retorna todos os objetos com valor maior ou igual ao parâmetro passado.


Há também o método `pollFirst`, que retorna e remove o primeiro elemento da lista, e o `pollLast` faz o mesmo, 
mas com o último elemento da lista

## Map, HashMap, e LinkedHashMap

---


O Map tecnicamente não é uma Collection, pois não está na linha de herança da interface Collection

O Map utiliza chaves para mapear valores.

Para inicializar o HashMap devemos declarar qual o tipo da variável da chave e o tipo da variável do valor que a chave armazena.

```java
Map<String, String> map = new HashMap<>();
```

Para adicionar elementos em um Map, ao invés do `add`, usamos o método `put`

```java
public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("tc", "teclado");
        map.put("ts", "this");
        map.put("vc", "você");
    }
```

O map não pode ter chaves duplicadas, e caso seja feita a adição de valores diferentes com a mesma chave,
o valor inicial será sobrescrito

Para evitar isso, podemos usar o método `putIfAbsent()`, que adiciona o elemento apenas caso ele não exista na coleção

Para iterar e imprimir os elementos, podemos iterar sob as chaves ou valores, pois podem apresentar resultados diferentes,
visto que não são aceitas chaves duplicadas, mas são aceitos valores duplicados em chaves diferentes.

```java
public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("tc", "teclado");
    map.put("ts", "this");
    map.put("vc", "você");
    
    for (String key : map.keySet()){
        System.out.println(key + " -> " + map.get(key));
    }
}
```

Outra forma de fazer esta iteração é utilizando o entrySet, o Entry é um objeto que possui a chave e o valor

```java
public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("tc", "teclado");
    map.put("ts", "this");
    map.put("vc", "você");

    for (Map.Entry<String, String> entry : map.entrySet()){
        System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
}
```

Uma forma comum de utilizar o Map, é passando objetos como chave e valor, para associá-los, como no exemplo a seguir

```java
public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("William Suane");
        Consumidor consumidor2 = new Consumidor("Devdojo Academy");

        Manga manga1 = new Manga( 4L,"One Piece", 15.99);
        Manga manga2 = new Manga( 2L,"Berserk", 21.50);

        Map<Consumidor, Manga> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, manga1);
        consumidorMangaMap.put(consumidor2, manga2);

        for (Map.Entry<Consumidor, Manga> entry : consumidorMangaMap.entrySet()){
            System.out.println(entry.getKey().getNome() + " -> " + entry.getValue().getNome());
        }
    }
```

No entanto, precisamos fazer uma alteração caso um consumidor possa ter comprar mais de um Mangá. Neste caso, ao invés de passar Mangá
como parâmetro, devemos passar uma Lista de Mangá. Criando uma espécie de Array multidimensional.

Como estamos usando uma Lista, para imprimir os valores devemos usar um forEach e então conseguir imprimr os valores

```java
public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("William Suane");
        Consumidor consumidor2 = new Consumidor("Devdojo Academy");

        Manga manga1 = new Manga( 4L,"One Piece", 15.99);
        Manga manga2 = new Manga( 2L,"Berserk", 21.50);
        Manga manga3 = new Manga( 1L,"Fullmetal Alchemist", 19.90);
        Manga manga4 = new Manga( 5L,"Naruto", 22.0);
        Manga manga5 = new Manga( 3L,"Bleach", 27.90);


        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();

        List<Manga> mangaConsumidor1List = List.of(manga1,manga2,manga3);
        List<Manga> mangaConsumidor2List = List.of(manga1,manga4,manga5);

        consumidorMangaMap.put(consumidor1, mangaConsumidor1List);
        consumidorMangaMap.put(consumidor2, mangaConsumidor2List);



        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()){
            System.out.println(entry.getKey().getNome());
            for (Manga manga : entry.getValue()){
                System.out.println(manga);
            }
        }
    }
```
