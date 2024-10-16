package academy.devdojo_maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
    abreConexao();
    abreConexao2();
    }

    private static String abreConexao(){
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        }catch (Exception e){
            System.out.println("Fechanddo recuso liberado pelo SO");
            e.printStackTrace();
        }finally {
            // finally é executado independente da circunstância
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }

    private static String abreConexao2(){
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            throw new RuntimeException();
        }finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}
