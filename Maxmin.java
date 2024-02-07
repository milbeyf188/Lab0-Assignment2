/**
 * Maxmin
 */
public class Maxmin {

    public static int MaxFinder(int[] array)
    {
        int max = array[0];
        for(int i = 0;i<array.length;i++)
        {
            if(array[i]>max)
            {
                max = array[i];
            }
        }
    return max;
    }
    public static int MinFinder(int[] array)
    {
        int min = array[0];
        for(int i = 0;i<array.length;i++)
        {
            if(array[i]<min)
            {
                min = array[i];
            }
        }
    return min;
    }
    public static void main(String[] args) {
        int[] array1 = {1,3,5,0,21};
        int[] array2 = {-1,3,4,7};
        System.out.println(MaxFinder(array1));
        System.out.println(MinFinder(array2));
    }

}