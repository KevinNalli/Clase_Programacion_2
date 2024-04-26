
package com.mycompany.ahorcado;
import java.util.*;
public class Ahorcado {

    public static void main(String[] args) throws Exception{
        Scanner cap = new Scanner(System.in);
        System.out.println("Bienvenido a Ahorcado");
        hanged ahorcado = new hanged("muerte", 0);
        do{
            System.out.println("Ingrese Una Letra");
            char letter = cap.nextLine().charAt(0);
            try{
                ahorcado.registerLetter(letter);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            
        }while(ahorcado.attemps <= 6);
    }
    
}
