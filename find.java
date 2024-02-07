/**by Alperen Kalyoncu
 * this class makes operations for integer arrays
 */
public class find 
{

    /** @author Alperen Kalyoncu
     * finds the sum of the numbers at the even numbered indexes
     * @param array the integers for the method to find the sum of
     * @return the sum of the numbers
     */
    static int even(int[] array)
    {
        int output = 0;

        for(int i = 0; i < array.length; i += 2)
        {
            output += array[i];
        }

        return output;
    }

    /** @author Alperen Kalyoncu
     * finds the sum of the numbers at the odd numbered indexes
     * @param array the integers for the method to find the sum of
     * @return the sum of the numbers
     */
    static int odd(int[] array)
    {
        int output = 0;

        for(int i = 1; i < array.length; i += 2)
        {
            output += array[i];
        }

        return output;
    }
}
