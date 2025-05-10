/*
	So what is happening in this situation.
	We declared an array in the main method so it will remain in 
	existence for as long as the main method is running. 
	Remember, myNumbers contains a link to the actual array or 
	it has the address of the memory block of the array.
	The first thing that happens when any method is called is
	that a stack frame is created for that method call.
	Memory is set aside on the stack frame for the formal parameters, 
	which in this case is a single array reference variable.
	Also the return location "address" is stored in the stack frame
	so that the computer knows where to return to after the method 
	is finished running.
	Then..... the information in the actual parameter list is copied
	into the formal parameter list, in this case the array reference
	myNumbers is copied into the array reference variable myList.
	Now we have two variables "pointing" to the same memory boxes 
	associated with the array. One in the main method which is still
	alive and one in the changeContents method.
	As you can see the myList array reference variable is used
	to access the array and change its contents using a for loop.
	Any time you hear "Arrays" think of "Loops".
	When the method code is finished, flow of control returns to 
	the point from which the method changeContents was called and 
	continues to run. 
	In the main method you can see that we have a loop that uses 
	the array reference variable myNumbers to access the contents 
	of the array and print them to the screen, hence verifying that 
	the contents of the array have changed.
	
	I recommend that you do this written exercise for at least
	ten of ten of the methods you have written our encountered
	so far.
	
*/
public class ProcessMyArray {

	public static void main(String [] args){
	
		int[] myNumbers = {51,62,3,7,9,15,27,29,2,0,10};
	
	    changeContents(myNumbers); // call to the method changeContents
	     
		for(int i= 0;i< myNumbers.length; i++)
        {
            System.out.println("Array element: [" + i +"] contains : " + myNumbers[i]); 
        }  
	
	}// end main

    public static void changeContents(int [] myList){
	
	    // set each and every array element to 99.
        for (int i=0;i<myList.length;i++)
        {
            myList[i] = 99;
        }
	
	} // end of changeContents

	


} // end of program