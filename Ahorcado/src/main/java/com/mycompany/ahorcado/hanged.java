
package com.mycompany.ahorcado;

public class hanged{
    String word;
    int attemps;

    public hanged(String word, int attemps) {
        this.word = word;
        this.attemps = attemps;
    }
    
    public void setAttemps(){
        this.attemps += 1;
    }
    public void registerLetter(char letter)throws Exception{
        char letters[] = new char[6];
        int i = 1;
        boolean xd = true;
        for(char let : word.toCharArray()){
            if(let == letter){
                System.out.println("La letra " + let + " se encuentra en la Posicion: " +i);
                letters[i] = let;
                xd = false;
            }
            i++;
        }
        if(xd){
                setAttemps();
                System.out.println("Ouch!"); 
                if(this.attemps == 6){
                    throw new Exception("Has Muerto!");
                }
        }
            
    }
}    