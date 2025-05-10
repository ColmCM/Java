
/**
 * 
 * This program contains a Bubble Sorting method, which takes a 
 * int [] type and sorts the numbers in the array in ascending order.
 * 
 * The Bubble sorting algorithms is just one of the many different 
 * data sorting algorithms, which have been discovered and studied 
 * by computer scientists. For further infomration, 
 * check out https://en.wikipedia.org/wiki/Sorting_algorithm
 * @author Colm Mooney
 */
public class BubbleSortBasic 
{

    public static void main(String [] args)
    {
        int [] values = {7,10,0,4,6};
        int [] data= {12,223,232,666,1433,0,-34,14,43,554}; 
        // The  values array contains an unordered sequence of numbers
        // We are going to sort these values so that the are 
        // For example, using the Bubble sorting algorithm, the sequence 
        // {7,10,0,4,6} will be transformed to {0,4,6,7,10}
        // This algorithm swaps values around, step by step, until a number 
        // of passes through the array have been carried out, leaving the array 
        // values sorted in ascending order.
        
        printArray(data);
        System.out.println("The original array ");
        BubbleSort(data); // Calling the BubbleSort method
        printArray(data);
        System.out.println("The sorted array (using Bubble Sort)");
    }

     /**
     * This method takes an int array reference and sorts the associated
     * array values using the Bubble Sorting algorithm.
     * <p>usage: BubbleSort(arrayname) </p>
     * @param int [] an array refernce
     * @return void
     */
    public static void BubbleSort(int [] values)
    {
        int limit = values.length;
        int temp = 0;
        // The outer loop determines the number of passes 
        // through the array that will take place. 
        //(i.e. the number of times the whole inner loop is executed)
        // After the first pass the largest number will be in the last 
        // array element position.
        for (int i = 0; i < values.length; i++)
        {
            limit --; // reduce the limit by 1 (starting with the last element)
            for (int j = 0; j< limit; j++)
            {
                // When the current number in the array
                // is greater than the next number, then
                // swap these numbers around
                if(values[j] > values[j+1]){
                
                    temp = values[j+1];
                    values[j+1] = values[j];
                    values[j] = temp;
                }
            
            }
        
        }
         
    }
    
    public static void printArray(int [] list){
    
        System.out.println("\n\n\n"); // extra padding lines.
        
        for (int i=0;i<list.length;i++){
        
            System.out.println(list[i] + " ");
        }
    
    } // end of printArray

} // end of program