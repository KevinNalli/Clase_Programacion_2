
package com.mycompany.crear_exceptions;
import java.util.*;
public class Crear_Exceptions {

    public static void main(String[] args) throws Exception {
        Scanner cap = new Scanner(System.in);
        System.out.println("Escriba un numero");
        int number = cap.nextInt();
        Even even = new Even();
        try{
            even.isEven(number);
        }catch(Exception e){
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
        
    }
}
