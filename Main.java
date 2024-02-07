import java.util.Random;
import java. util. Scanner;

public class Main 
{
        
    public static void main(String[] args) 
    {
        
        Scanner ArraySize = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int i = ArraySize.nextInt();
        int[] array = new int[i];

        for(int n=0; i > n ; n++)
        {
            Random rand = new Random();
            int randomInt = rand.nextInt(100);
            array[n] = randomInt;
            System.out.print(randomInt+", ");
        }

        

        Menu(array);
    
    }
    
}
    
    