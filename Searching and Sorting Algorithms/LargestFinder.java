
import java.util.Arrays;
/**
 * Contains a short algorithm to find the largest 
 * element in an array.
 * 
 * @author Colm Mooney
 * @version 22/02/2014
 */

public class LargestFinder
{

    public static void main(String [] args)
    {
        double[] data = {12,223,232,666,1433,0,-34,14,43,554};
        
        double largestValue = data[0]; //set the largestValue to the first array element
        
        for (int i = 1; i < data.length; i++){ // start with second array element
            
            //Check to see if the next value in the array is larger then the largestValue variable
            if (data[i] > largestValue) 
            {   // change the value in largestValue to the value of this array element.
                largestValue = data[i]; 
            }  
        } //end loop
        
        System.out.println("The largest value in the array " + Arrays.toString(data));
        System.out.println(" is " + largestValue);  
        System.out.println("This is when we hold the largest value in a variable ");
        
        int indexOfLargest = 0;// set the indexOfLargets to the index of the first element.
        
        for (int i = 1; i < data.length; i++){ // start with second array element
            
            if (data[i] > data[indexOfLargest])//is the value of the current element larger the element indexed by indexOfLargest?
            {   // if so change the value in indexOfLargest to be the index for this element i.
                indexOfLargest = i; 
            }  
        } //end loop
        
        System.out.println("\n The largest value in the array " + Arrays.toString(data));
        System.out.println(" is " + data[indexOfLargest]);
        System.out.println("This is when we hold the index of the array element with the largest value");
       
        
    } //end main
     
} // end class