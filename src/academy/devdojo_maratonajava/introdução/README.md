# Introdução ao Java

---

Neste capítulo são abordados conceitos introdutórios do java, como o primeiro hello world, como são feitos os comentários, estruturas lógicas, condicionais e de repetição.

## Hello World (Aula 1)

---

Primeiramente, para que o código seja executado o java precisa identificar qual o pacote do códio e inicializar a classe main. 

Feito isto, esse é um exemplo de Hello World exibido no terminal em Java:


```java
package academy.devdojo_maratonajava.introdução;

public class A01_HelloWorld {
    public static void main(String[] args) {
        System.out.println("olá.");
    }
}
```

## Comentários (Aula 1)

---

Os comentários são trechos do arquivo que são ignorados pelos compiladores. No java os comentários podem ser feitos de duas formas:

De linha única, usando //: 
```java
// Esse é um comentário de uma linha em Java
```

Comentário de múltiplas linhas, usando /*:
```java
/*
 Esse é um comentário
  de múltiplas linhas 
  em Java
 */
```
## Tipos primitivos (Aulas 2 e 3)

---

No java, existem 8 tipos primitivos, são eles:

| nome do tipo | O que representa                          |
|--------------|-------------------------------------------|
| int          | Números inteiros                          |
| double       | valores com casas decimais mais precisas  |
| float        | valores com casas decimais menos precisas |
| long         | valores grandes, com muitas casas         |
| boolean      | armazenamento de verdadeiro ou falso      |
| short        | valores menores                           |
| byte         | armazena valores de 1 byte                |
| char         | armazena apenas um caractere              |


Para inicializar uma variável em java, devemos primeiramente declarar o tipo da variável, o nome dela, e atribuir um valor
O valor da variável pode ser exibido ou utilizado usando o nome da variável

A variável pode ser concatenada com texto ou outras variáveis, usando

```java
public static void main(String[] args) {
    int idade = 22;
    System.out.println("Eu tenho " + idade + " anos");
}
```

### Strings

As strings não são um tipo primitivo no Java, mas sim uma classe, que deve ser inicalizada da mesma forma que as outras variáveis, e também pode ser concatenada

```java
public static void main(String[] args) {
    String nome = "Isaac";
    System.out.println("Oi, meu nome é " + nome);
}
```


## Operadores

--- 