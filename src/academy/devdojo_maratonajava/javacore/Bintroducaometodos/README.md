# Métodos 

Um método é parecido com um atributo, mas exerce uma funcionalidade diferente. Usamos um modificador de acesso para 
declarar um método, o modificador de retorno, e o nome do método

```java
 public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }
}
```

Para executar um método usamos o nome do objeto e o nome do método

```java
public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
    }
}
```

## Parâmetros

Parâmetros são variáveis locais que existirão dentro do contexto do método. Utilizamos os parâmetros para passar as 
variáveis que serão utilizadas no método. Retornado ao método anterior, o conceito é aplicado da seguinte forma:

```java
 public class Calculadora {
    public void somaDoisNumeros(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}
```


### Parâmetos tipo referência

## Retorno

Em alguns casos, podemos querer que o método retorne algo após a execução. Neste caso, não usamos o `void`. O não uso do
`void` implica que o método deve obrigatoriamente implementar um `return`. 

Por exemplo, caso desejemos um método que retorne um valor do tipo `double`, fazemos a seguinte forma

```java
 public class Calculadora {
    public double divideDoisNumeros(int num1, int num2) {
        return num1 / num2;
    }
}
```

No entanto, ao executar este método, o valor do return não é exibido, pois não estamos usando um comando para imprimir 
esse valor, e a maneira correta de usar o método seria atribuindo a execução do método como valor de uma variável 
que representa o resultado, ou imprimindo a excuçãção do método

```java
public static void main(String[] args) {
    Calculadora calculadora = new Calculadora();
    double result = calculadora.divideDoisNumeros(20, 2);
    System.out.println(result);
    System.out.println(calculadora.divideDoisNumeros(20, 2));
}
```

Ou