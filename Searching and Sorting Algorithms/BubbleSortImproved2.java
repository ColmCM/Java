
/**
 * This version of bubble sort will stop sorting the array as soon as the array
 * is sorted. 
 * Try to "walk through" the code using the following arrays to prove that
 * this is a correct statement, using the following input arrays.
 * 
 * {10,20,30,40,50}
 * {10,30,20,40,50}
 * 
 * @author Colm Mooney
 * @version (10/10/20)
 */
public class BubbleSortImproved2
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
        bubbleSort2(data); // Calling the BubbleSort method
        printArray(data);
        System.out.println("The sorted array ");
    }

    public static void bubbleSort2(int[] a) {
    	for (int i = 1; i < a.length; i++) {
    		boolean isSorted = true; // isSorted = true if a[] is sorted
    		
    		for (int j = 0; j < a.length-i; j++) { 
    		    
    			if (a[j] > a[j+1]) { // the larger item bubbles up 
    				int temp = a[j]; // and isSorted is set to false,
    				a[j] = a[j+1];   // i.e. the data was not sorted
    				a[j+1] = temp;
    				isSorted = false; 
    			}
    		}
    		
    		if (isSorted) return;   // Why?
        } 
    }// end bubbleSort 

    public static void printArray(int [] list){
    
        System.out.println("\n\n\n"); // extra padding lines.
        
        for (int i=0;i<list.length;i++){
        
            System.out.println(list[i] + " ");
        }
    
    } // end of printArray
     
}