/**
 * The Binary search algorithm operates on an array which has already been sorted. 
 * This algorithm searches for a target number in the array by successively breaking
 * the search space in half.  
 * This version of Binary Search is used for the bricks demo of the algorithm
 * @author Colm Mooney
 * @version 23/03/2020
 */

public class BinarySearchDemoData
{
    public static void main(String [] args)
    {   // a sorted array that we will search.
        int array [] ={-20,-10,10,20,30,40,50,60,70,80,90};
        int target = -10, high = array.length-1, low = 0;
		int middle=0; boolean found = false;
        while( low<=high && !found ) // loop while both these conditions are true
        {
            middle= (high+low)/2; // set the index of the middle of the current search space
           
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
} // End of BinarySearchDemoData