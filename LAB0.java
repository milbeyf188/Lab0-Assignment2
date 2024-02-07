package SECONDSEMSESTERLABS;

import java.lang.reflect.Array;
import java.util.Scanner;

public class MENU {



    public static void Menu(int[] NumberList)
    {
        int Number = 0;

        //We are making a loop until user exits
        do{
            //Printing the options
            System.out.println("Choose an option");
            System.out.println("1-Find the maximum of the Array");
            System.out.println("2-Find the minimum of the Array");
            System.out.println("3-Find the average of the Array and show the differs");
            System.out.println("4-Find the sum of elements with odd and even numbered indexes");
            System.out.println("5-Exit");
    
            Scanner input = new Scanner(System.in);
            Number = input.nextInt();

            //Taking action according to user input
            if(Number == 1)
            {
                System.out.println(" Maximum of the Array is " + Maxmin.MaxFinder(NumberList));
            }
            else if(Number == 2)
            {
                System.out.println(" Minimum of the Array is " + Maxmin.MinFinder(NumberList));
            }
            else if(Number == 3)
            {
                System.out.println("The average of the Array is " + Task.findAverage(NumberList));
                System.out.println("The differs are " + Task.difference(NumberList));
            }
            else if(Number == 4)
            {
                System.out.println("The sum of the elements with odd and even numbered indexes are " + );
                System.out.println("Evens " + find.even(NumberList));
                System.out.println("Odds " + find.odd(NumberList));
    
            }
            else if(Number == 5)
            {
                System.out.println("Exiting...");
            }
            //exiting if user chooses to exit
        }while(Number =! 5)
    }


    
    
}
