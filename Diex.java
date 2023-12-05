import java.util.Scanner;
import java.util.InputMismatchException;
public class Diex
{
     private int value = 1;  
     private int max = 6;
    public void roll(){
        value = (int)(Math.random()*max) + 1;
    }
   
     public Diex(int sides){
         this.max = sides;
         this.roll();
    }

    public int getValue(){
        return value;
    }

}

