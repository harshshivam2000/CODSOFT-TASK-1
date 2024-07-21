//import java.util.Scanner;
//mport java.util.Random;
import java.util.*;
public class NumberSystem {
  public static void main(String[] args) {
    
    boolean number=false;
    Random random_number=new Random();
    int random=random_number.nextInt(100);
    int count=0;
    
@SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);
   while(!number)
   {
    count=count+1;
    System.out.println("Enter any number=");
        

    int guess_number=sc.nextInt();
    if ((random>0  &&  random<=100))
    {
        if(guess_number > random)
        {
            //System.out.print("The random number is="+random);
            System.out.println("\nsorry,your guess is greater  than expected ");
            number=false;
        }


        else if(guess_number < random)
        {
           // System.out.print("The random number is="+random);
            System.out.println("\nsorry,your guess is less than expected ");
            number=false;
        }
        else 
        {
            System.out.print("The random number is="+random);
            System.out.println("\ncongratulate ,your guess is right");
            System.out.println("Number of attempts= "+count);
            System.out.println("\nDo you wish to continue the game? Yes/No");
               
            String answer=sc.next();
            if(answer=="yes")
            {
                 System.out.println("Please enter a number between 1 to 100.");
                 number=false;
                

            }
            else
            {
                System.out.println("Thank you");
                break;
            }
        }
    }
        
    }
    
   }
}


