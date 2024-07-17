// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
import java.util.Random;

public class Main {
    public static int computer(){
        Random rand =new Random();
       int  computer =rand.nextInt(100);
        return computer;
    }
    public static int userinput(){
        Scanner sc=new Scanner (System.in);
        int userinput =sc.nextInt();
        return userinput;
    }
    public static int  feedback(int n,int m,int attempt){
        if(n==m){
            System.out.println("CONGRATULATION");
            System.out.println("Your Guess Is Right");
            System.out.println("You Guess The Number in "+attempt+" Attempt");
            if(attempt==1){
                System.out.println("Your Score is 100");
            }else if(attempt==2){
                System.out.println("Your Score is 75");
            }else if(attempt==3){
                System.out.println("Your Score is 50");
            }else if(attempt==4){
                System.out.println("Your Score is 25");
            }else{
                System.out.println("Your Score is 10");
            }
            return 1;
        }else if(n<m){
            System.out.println("Your number is small");
        }else{
            System.out.println("Your number is larger");
        }
        return 0;
    }
    public static void  game() {
        int m = computer();
        for(int attempt=1;attempt<=6;attempt++){
            if(attempt<=5){
                System.out.println("Enter your guess number between 1 to 100:");
                int n = userinput();
                if(n>100){
                    System.out.println("please enter the number between 0 and 100");
                }
                int j=feedback(n, m,attempt);
                if(j==1){
                    break;
                }else{
                    continue;
                }

            }
            else{
                System.out.println("OOPS!!Your Attempts Are Over");
            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("-----------LET'S START THE GAME----------");
         game();
         while(true){
         System.out.println("You Want To Play Again?");
            System.out.println("Type 1 if yes otherwise any number");
            int playagain=sc.nextInt();
             if(playagain==1)
             {
                 game();

             }
             else{
                System.out.println("Okay!!!Now You Can Exit ");
                System.out.println("THANK YOU");
                 break;
            }
         }
    }
}