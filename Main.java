import java.util.Random;
import java. util. Scanner;

public class Main 
{
        
    public static void main(String[] args) 
    {
        //Taking integer array size from the user
        Scanner ArraySize = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int i = ArraySize.nextInt();
        int[] array = new int[i];

        //Adding radom integers to array until the size is reached
        for(int n=0; i > n ; n++)
        {
            Random rand = new Random();
            int randomInt = rand.nextInt(100);
            array[n] = randomInt;
            System.out.print(randomInt+", ");
        }

        
        //Opens Menu Method
        LAB0.Menu(array);
    
    }
    
}
    
    
