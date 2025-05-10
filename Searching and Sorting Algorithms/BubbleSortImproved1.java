public class BubbleSortImproved1
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
        bubbleSort(data); // Calling the BubbleSort method
        printArray(data);
    }

     /**
     * This method takes an int array reference and sorts the associated
     * array values using the Bubble Sorting algorithm.
     * This BubbleSort algorithm improves on the previous one by not checking 
     * the already postioned largest element at the end of the array. 
     * <p>usage: bubbleSort(arrayname) </p>
     * @param int [] an array refernce
     * @return void
     */
   
    public static void bubbleSort(int[ ] a)  {
        int pass = 1;
    	for (int i = 1; i < a.length; i++) {
    		for (int j = 0; j < a.length -pass; j++) {
    			if (a[j] > a[j+1]) {   // (swap)
    				int temp = a[j]; 
    				a[j] = a[j+1]; 
    				a[j+1] = temp; 
    			}
     		}
     		pass++; // increment the pass
    	}
    }
    
    public static void printArray(int [] list){
    
        System.out.println("\n\n\n"); // extra padding lines.
        
        for (int i=0;i<list.length;i++){
        
            System.out.println(list[i] + " ");
        }
    
    } // end of printArray

} // end of program