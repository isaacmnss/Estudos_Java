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

Isso ocorre pois s1 e s2 são variáveis de referência, que fazem referência a objetos *distintos* em memória, como ilustrado abaixo:

![ilustraçãoequals1.png](C:\Users\ispit\Documents\Foco total\ddj1\Images\ilustracaoequals.png)
