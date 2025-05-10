public class TestPoint
{
	public static void main(String args[])
	{
		//Create a Point object
		//Default constructor
		Point p1 = new Point();
		p1.printPoints();
		
		Point p2 = new Point(12,-5);
		p2.printPoints();
		
		//p2.x=21;
		p2.setX(21);
		p1.setY(6);
		p2.printPoints();
		
		System.out.println(p1.getY());
	}
}
