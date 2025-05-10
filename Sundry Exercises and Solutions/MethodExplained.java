/*
 What happens when the method is called.
 A stack frame is created for the method.
 memory is set aside on the stack frame for the formal parameters a and b.
 memory is set aside for local variables.
 the address to return is stored on the stack frame.
 The actual parameters in the method call are copied into the matching
 formal parameters. The contents of num1 is copied into a, and num2
 is copied into b.
 local variable result receives the result of the calculation a*b.
 The the variable result or it's contents are returned to the point 
 from which the method was initially called. 
 The stack frame is destroyed, this means that all formal parameters 
 and local variables no longer exist and are no longer available to 
 be used in your program. They are said to be out of scope and it 
 is an error to try and access them.
 Flow of control of execution returns to the point from which the 
 method was called. 
 
 Note: A stack frame is created for each and every call to the method 
 it exists while the method is running and ceases to exist when the 
 method is finished its code or the return statement is reached.

*/
public class MethodExplained {


	public static void main (String [] args){
	
	 int num1 = 7;
	 int num2 = 8;
	 
	 System.out.println("About to call my method");
	 
	 int x = mulTwoNumbers(num1,num2); // method call or invocation
	 
	 System.out.println("Result is " + x);
	 
	 System.out.println("On to the next code lines....");
	
	
	} // end of main
	
	public static int mulTwoNumbers( int a, int b) {
	
		int result = a*b;
		
		return result;
	
	}

} // end of program