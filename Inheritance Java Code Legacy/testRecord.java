public class testRecord
{
	public static void main(String args[])
	{
		Record r1 = new Record(); // call default constructor
		Record r2 = new Record("Mary","Kelly","Jenny Kelly","Tom Kelly",7);
		r1.printDetails();
		r2.printDetails();
	}
}