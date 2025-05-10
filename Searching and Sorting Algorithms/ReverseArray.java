import java.util.Arrays;
/**
 *  ReverseArray here.
 * 
 * @author Colm Mooney
 */
public class ReverseArray
{

    public static void main(String [] args)
    {
        
        double[] data = {12,223,232,666,1433,0,-34,14,43,554}; 
        double[] temp = new double[data.length]; // create temp to be as long as data
        
        int j=0; // foward index for temp array.
        //Start at the end of the array and go backwards
        for (int i=data.length-1; i>=0; i--){
        
            temp[j] = data[i]; // memory box temp[j] takes the next element in data.
            j++; // move on to the next element in temp
        
        }
        System.out.println("Here is data " + Arrays.toString(data));
        System.out.println("Here is temp " + Arrays.toString(temp));
        
        data = temp; // data (the array reference) now refers to the same elements
        // pointed to by temp. The previous contents pointed to by data no longer
        // have a link reference pointing to them. 
        // The will be then cleaned up by the Java Garbage Collector.
        // We no longer have access to them, they are lost.
        System.out.println("\n\n Here is data now : ");
        System.out.println("\n\n " + Arrays.toString(data));
        
    }

     
}