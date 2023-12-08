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
        if(diceNumber <= 6){
             dieset[diceNumber -1].roll();
        }
    }
    public String summarize(){
        int[] sideArray = {1, 2, 3, 4, 5, 6};
        int[] countArray = {0, 0, 0, 0, 0, 0};
        String organizer = "";
        for(int dicei = 0; dicei < 5; dicei++){ 
            for(int y = 0; y < 5; y++){
              if(dieset[dicei].getValue() == sideArray[y]){
                  countArray[y] = countArray[y] + 1;
              }
            }
        }
        for(int i = 1; i < 6; i++){
            organizer = organizer + i.toString() + "-" + countArray[y - 1].toString + ";" ;
        }
        return organizer;
    }
    public String toString(){
        String str = "Dice values;";
        for(int i = 0; i < 5; i++){
            str = str + " " + dieset[i].toString(); 
        }
        return str;
    }
    
    public int getValue(){
        return die1.getValue() + die2.getValue() + die3.getValue() + die4.getValue() + die5.getValue() + die6.getValue();
    }

}

