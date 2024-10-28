package academy.devdojo_maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        }catch (ArithmeticException e){
            System.out.println("Dentro do ArithmeticException ");
        }catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }

//        try {
//            talvezLanceException();
//        }catch (SQLException e){
//
//        }catch (FileNotFoundException e){
//
//        }

        try {
            talvezLanceException();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }

}
