public class testCar
{
	public static void main(String args[])
	{
		//Create a Car object
		Car c1 = new Car(); //call default constructor
		Car c2 = new Car();
		
		c1.printDetails();
		c2.printDetails();
		
		//Call general constructors that takes in all parameter values
		Car c3 = new Car(5, "green" , 'I');
		System.out.println("Car c3:");
		c3.printDetails();
		//Use Setter MEthods
		c1.setNoDoors(2);
		c1.setColour("Blue");
		System.out.println("Car c1 Updated:");
		c1.printDetails();
		c2.setColour("Yellow");
		int doors =  c1.getNoDoors();
		System.out.println("C1 has: " + doors + " doors");
		System.out.println("C2 has the colour : " + c2.getColour());
		
		int x[] = new int[5];
		String s[] = new String[10];
		
		Car showRoom[] = new Car[10];
		for(int i = 0; i < 10; i++)
		{
			showRoom[i] = new Car();
		}
	}
}