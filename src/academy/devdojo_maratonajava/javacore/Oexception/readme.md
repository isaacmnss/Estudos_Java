# Exceptions
___
Neste bloco trataremos sobre as exceptios Java e os erros e como fazer o seu tratamento.



## O que são?
___
São condições anormais dentro do programa, como fluxos inesperados, estando dentro ou fora do controle do desenvolvedor.

No Java, os erros e exceções são também objetos, que são derivados da classe Throwable.

![Diagrama de exceções Java](https://www.javamex.com/tutorials/exceptions/ExceptionHierarchy.png)

## Diferença entre Error e Exception
___

Errors são situações que não podem ser resolvidos em tempo de execução, o programa precisa ser
interrompido para que o problema seja resolvido, diferente da exception, que pode ser tratada durante a execução do programa

### **Exemplos de Error**
#### *Falta de memória*
Ocorre quando a JVM esgota a memória disponível e finaliza a aplicação
#### *Stack overflow*
Ocorre quando um método recursivo cria requisições infinitamente e passa o limite da stack

## **Tipos de exceção**
___

### Checked
As exceções podem ser checked ou unchecked (checadas ou não checadas)

Exceções checadas são exceções que herdam diretamente a classe Exception, quando o código apresenta uma exceção checada
o código não chega a ser compilado

### Unchecked
As exceções unchecked são filhas diretas da classe RuntimeException. Neste caso, o código é compilado
e a exceção pode ocorrer durante a execução do programa. Geralmente ocorre por erro de desenvolvimento

## Lidando com uma exceção checked
___

Utilizando o método try catch, podemos tratar uma exceção para que a JVM tente executar um bloco de código e caso haja
uma exceção, executar outro bloco

    try {
          boolean isCriado =  file.createNewFile();
            System.out.println("Arquivo criado"+ isCriado);
        }catch (IOException e){
            e.printStackTrace();
        }

**É IMPORTANTE NUNCA DEIXAR O BLOCO CATCH EM BRANCO**

*NÃO COLOCAR REGAS DE NEGÓCIO DENTRO DO CATCH*

o printStackTrace apenas imprime o que ocorreu para verificar o que causou a exceção

## Lidando com uma exceção unchecked

Também pode ser usado throw para lançar uma exceção quando prevista no código como no exemplo abaixo:

```java
    public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
       int resultado = divisao();
        System.out.println(resultado);
     }

    private static int divisao (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor a");
        int a =  sc.nextInt();
        System.out.println("Digite o valor b");
        int b = sc.nextInt();
        sc.close();
        if (b == 0){
            throw new IllegalArgumentException("Não é possível dividir por 0");
         }
        return a/b;
     }
    }
```

Neste caso, o método tem uma exceção lançada caso seja dado o input de um divisor = 0