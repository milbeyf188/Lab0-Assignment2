/**by Deniz Can Yoldaş
 * this class helps users to make operations with averages of arrays
 */
public class Task
{
    /**Finds the average of the elements in an array
     * @param array 
     * @return average of the numbers in the array
     */
    public static double findAverage(int[] array)
    {
        double sum = 0;// initialized sum to 0
        int noOfElements = array.length();

        for( int i = 0; i < noOfElements; i++)
        {
            sum += array[i];
        }

        double average = sum / noOfElements;
        return average;
    }
    /**Returns the array of the differences of numbers from the average
     * @param arrayToDiff
     * @return array of the differences
     */
    public static double[] difference(int[] arrayToDiff)
    {
        double avg = findAverage(arrayToDiff);

        double[] differenceArray = new double[arrayToDiff.length()];

        for(int i = 0; i < differenceArray.length(); i++)
        {
            differenceArray[i] = arrayToDiff[i] - avg;
        }

        return differenceArray;
    }  

}
