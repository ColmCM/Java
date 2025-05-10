import java.util.Arrays;
/**
 * Contains a short algorithm to find the smallest 
 * element in an array.
 * 
 * @author Colm Mooney
 */

public class SmallestFinder
{

    public static void main(String [] args)
    {
        double[] data = {12,223,232,666,1433,0,-34,14,43,554};
        
        double smallestValue = data[0]; //set the smallestValue to the first array element
        
        for (int i = 1; i < data.length; i++){
            //Check to see if the next value in the array is smaller then the smallestValue variable
            if (data[i] < smallestValue) 
            {   // if so change the value in smallestValue to the value in this array element.
                smallestValue = data[i]; 
            } 
        } //end for loop
        // At the end of the loop the smallestValue will hold the smallest value in the array.
        System.out.println("The smallest value in the array " + Arrays.toString(data));
        System.out.println(" is " + smallestValue);  
        System.out.println("This is for the example when we stored the value of the smallest array element");
        
        int indexOfSmallest = 0; //set the indexOfSmallest to the index of the first array element
        
        for (int i = 1; i < data.length; i++){
            
            //Check to see if the next value in the array is smaller then the element indexed by indexOfSmallest
            if (data[i] < data[indexOfSmallest]) 
            {   // change the value in indexOfSmallest for this index value i.
                indexOfSmallest = i; 
            }
        
        } //end loop
        // At the end of the loop indexOfSmallest will hold the index of the smallest value in the array.
        System.out.println("\n\n The smallest value in the array" + Arrays.toString(data));
        System.out.println("is " + data[indexOfSmallest]); 
        System.out.println("This is for the example when we stored the index of the array elment with the smallest value");
    } //end main
     
} // end class