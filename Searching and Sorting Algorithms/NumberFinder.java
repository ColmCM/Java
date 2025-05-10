import java.util.Arrays;
/**
 * This program finds out if a number is in an array.
 * 
 * @author Colm Mooney
 */
public class NumberFinder
{

    public static void main(String [] args)
    {
       double[] data = {12,223,232,666,1433,0,-34,14,43,554}; 
       double number = 12; // The number to find, you could get this from the user using the Scanner class.
      //foundFlag will indicate whether or not the number is in the array
       boolean foundFlag = false; // if the number is not in the array foundFlag will remain false (default value) 
      
       for (int i=0;i< data.length;i++){ // Go through all the array elements
        
         if (data[i] == number) { // check to see if the current element is equal to the number we are searching for.
             // you could also at this point take note of the number's position index in the array.
             foundFlag = true; // if the number is found then indicate the number has been found by setting flag to true.
         } 
       } 
       // At this point foundFlag will be either true or false.
       System.out.println("It is "+ foundFlag + " that the number " + number + " is in the array below \n");
       System.out.println(Arrays.toString(data));
       
    } // end main

     
}