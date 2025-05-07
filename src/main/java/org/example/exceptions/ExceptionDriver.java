package org.example.exceptions;

import java.util.Locale;

public class ExceptionDriver {
    public static void main(String[] args){


        try{
            // business logic
            String name = null;
            System.out.println(name.toLowerCase());

            int i = 10/0; //ArithmeticException
        }

        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        finally { // used to free the resources
            System.out.println("Alwasys gets executed");
        }

        try {
            funB();
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        System.out.println("End of application");

    }

    static void funB(){

        try {
            funC();
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
//        catch (NullPointerException e){
//            e.printStackTrace();
//        }

    }
    static void funC(){
        //int i = 10/0;
        String name=null;
        name.toLowerCase();
    }


}
