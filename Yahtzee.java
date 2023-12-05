import java.util.Scanner;
import java.util.InputMismatchException;
public class Yahtzee
{
    private Diex die1;
    private Diex die2;
    private Diex die3;
    private Diex die4;
    private Diex die5;
    private Diex die6;
    private Diex[] dieset = {die1, die2, die3, die4, die5, die6};
    public void fullRoll(){
            die1.roll();
            die2.roll();
            die3.roll();
            die4.roll();
            die5.roll();
            die6.roll();
    }
   
     public Yahtzee(){
         die1 = new Diex(6);
         die2 = new Diex(6);
         die3 = new Diex(6);
         die4 = new Diex(6);
         die5 = new Diex(6);
         die6 = new Diex(6);
         this.fullRoll();
    }
    public void oneRoll(int diceNumber){
       dieset[diceNumber].roll();
    }

    public int getValue(){
        return die1.getValue() + die2.getValue();
    }

}

