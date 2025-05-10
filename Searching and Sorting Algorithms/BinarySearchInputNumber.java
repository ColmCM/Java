/**
 * The Binary search algorithm operates on an array which has already been sorted. 
 * This algorithm searches for a target number in the array by successively breaking
 * the search space in half.  
 *
 * @author Colm Mooney
 * @version 23/03/2020
 */
import java.util.Scanner;
import java.util.Arrays;

public class BinarySearchInputNumber
{

    public static void main(String [] args)
    {
        int array [] ={12,34,44,51,103,210,217,230,291,300,312,1024};
        int target = 0; boolean found;
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Here is the array you will search through " + Arrays.toString(array));
        
        do {
            found = false; // reset the found flag
            System.out.println("Enter a number to search for (or -1 to quit): ");
            target = myObj.nextInt(); // read a number from the keyboard
            int high = array.length-1, low = 0, middle=0; // reset high, low and middle
            
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
            
        } while (target!= -1);

        System.out.println("*** End of the program ****");
    } // End of Main method

     
}