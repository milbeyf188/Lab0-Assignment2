package SECONDSEMSESTERLABS;

import java.lang.reflect.Array;
import java.util.Scanner;

public class MENU {



    public static void Menu(int[] NumberList)
    {
        int Number = 0;

        System.out.println("Choose an option");
        System.out.println("1-Find the maximum of the Array");
        System.out.println("2-Find the minimum of the Array");
        System.out.println("3-Find the average of the Array and show the differs");
        System.out.println("4-Find the sum of elements with odd and even numbered indexes");
        System.out.println("5-Exit");

        Scanner input = new Scanner(System.in);
        Number = input.nextInt();

        if(Number == 1)
        {
            System.out.println(" Maximum of the Array is " + MaxFinder(NumberList));
        }
        if(Number == 2)
        {
            System.out.println(" Minimum of the Array is " + MinFinder(NumberList));
        }
        if(Number == 3)
        {
            System.out.println("The average of the Array is " + findAverage());
            System.out.println("The differs are " + difference(NumberList));
        }
        if(Number == 4)
        {
            System.out.println("The sum of the elements with odd and even numbered indexes are " + );
            System.out.println("Evens " + Even(NumberList));
            System.out.println("Odds " + Odd(NumberList));

        }
        if(Number == 5)
        {
            System.out.println("Exiting...");
        }
        
    }


    
    
}
