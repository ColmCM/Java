/**
 * The Binary search algorithm operates on an array which has already been sorted. 
 * This algorithm searches for a target number in the array by successively breaking
 * the search space in half.  
 *
 * @author Colm Mooney
 * @version 23/03/2020
 */

public class BinarySearch
{

    public static void main(String [] args)
    {
        int array [] ={12,34,44,51,103,210,217,230,291,300,312,1024};

        int target = 1024, high = array.length-1, low = 0, middle=0; boolean found = false;
        while( low<=high && !found ) // loop while both these conditions are true
        {
            middle= (high+low)/2; // the index of the middle of the current search space
            if( target < array[middle] )// search in the lower half space
            {
                high = middle-1;
            }
            else if (target > array[middle])// search the higher half space
            {
                low = middle+1;
            }
            else { // target is equal to the number in array[middle]
                System.out.println(target + " found at position " + middle); found = true;
            }
            
        } // end while loop
        if(!found)
        {
            System.out.println( target + " was not found in the list");
        }

        
    } // End of Main method

     
}