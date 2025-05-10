public class TestCar
{
	public static void main(String args[])
	{
		//Create a Car instance by calling the default constructor
		Car c1 = new Car();
		
		String s = new String("Hello");
		
		//Create another Car instance by calling our general constructor with 3 parameters
		Car c2 = new Car(5,"red",'E');
		Car c3 = new Car(16);
		
		//Call printCarDetails method on each car
		c1.printCarDetails();
		c2.printCarDetails();
		c3.printCarDetails();
		
		System.out.println("Colours:");
		System.out.println("The colour of Car C1 : " + c1.getColour());
		System.out.println("The colour of Car C2 : " + c2.getColour());
		System.out.println("The colour of Car C3 : " + c3.getColour());
		c1.setColour("Green");
		c3.setDoors(4);
		
		
		
		c1.printCarDetails();
		c3.printCarDetails();
		System.out.println(c1.toString());
		
	}
}