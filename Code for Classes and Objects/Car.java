public class Car
{
	//Attributes 
	private int numberOfDoors;
	private String colour;
	private char motorType;  //I = ICE, E = Electric F = fuelcell
	private int carReg;
	private static int lastCarReg = 1000;
	
	//Constructors
	
	//Default Constructor
	public Car()
	{
		numberOfDoors = 4;
		colour = "Black";
		motorType = 'I';
		lastCarReg++;   //increase the value 
		carReg = lastCarReg; // assign that value to the reg of this Car instance
	}
	
	public Car(int numberOfDoors, String colour, char motorType)
	{
		this.numberOfDoors = numberOfDoors;
		this.colour = colour;
		this.motorType = motorType;
		lastCarReg++;
		carReg = lastCarReg;
	}
	
	public Car(int doors)
	{
		numberOfDoors = doors;
		colour = "Black";
		motorType = 'I';
	}
	
	//Getter methods
		//get the colour
	public String getColour()
	{
		return colour;
	}
	public int getDoors()
	{
		return numberOfDoors;
	}
	public char getMotorType()
	{
		return motorType;
	}
	public int getReg()
	{
		return carReg;
	}
	
	//Setter Methods
	public void setDoors(int num)
	{
		numberOfDoors = num;
	}
	public void setColour(String col)
	{
		if(col.equals("Red") || col.equals("Green")){
			colour = col;	
		}
		
	}
	
	//Functionality
	public void printCarDetails()
	{
		String details = "Number of doors: " + numberOfDoors;
		details += "\nColour: " + colour;
		details += "\nMotor Type: " + motorType;
		details += "Car Reg: " + carReg;
		System.out.println(details);
		
	}
	
	public String toString()
	{
		String details = "Number of doors: " + numberOfDoors;
		details += "\nColour: " + colour;
		details += "\nMotor Type: " + motorType;
		details += "Car Reg: " + carReg;
		
		return details;
	}
	
	
	/*
	public Car(int numberOfDoors, String colour,char motorType)
	{
		this.numberOfDoors = numberOfDoors;
		this.colour = colour;
		this.motorType = motorType;
	}
	
	public void setColour(String colour)
	{
		this.colour = colour;
	}
	*/
	
}	
	
	