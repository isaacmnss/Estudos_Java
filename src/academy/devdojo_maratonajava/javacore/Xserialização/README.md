# Serialização

---
A serialização permite fazer a persistência de um objeto armazenado em memória. 

Para ser possível serializar um objeto, primeiramente precisamos fazer a implementação da interface Serializable no objeto, do contrário, será lançada uma exceção



```java
public class Aluno implements Serializable{
    
}
```

Podemos serializar um objeto em um arquivo da seguinte maneira: 

```java
public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Isaac Meneses", "12344321");
        serializar(aluno);
    }
    private static void serializar(Aluno aluno){
        Path path = Paths.get("aluno.ser");
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(path))){
            objectOutputStream.writeObject(aluno);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
```

Uma vez serializado, podemos reverter o processo desta forma: 

```java
private static void deserializar(){
        Path path = Paths.get("aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
```

Um problema com estes métodos, é que o campo password do objeto está sendo armazenado de forma insegura, o que é uma má-prática.

Para evitar isso, podemos adicionar o modificador transient ao declarar a variável

```java
public class Aluno implements Serializable {
    private long id;
    private String nome;
    private transient String password;
}
```

Isso gerará um arquivo serializado com o campo password null, que continuará null ao ser deserializado


> [!NOTE]
> Não é possível serializar um objeto associado a outro objeto que não seja serializável