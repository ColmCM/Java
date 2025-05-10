public class Dog extends Animal
{
	//Attributes relating to just Dog
	private boolean chasesSquirrels;
	
	//default constructor
	public Dog()
	{
		super(); // call superclass (ANIMAL) default constructor
		this.chasesSquirrels = false;
	}
	
	public Dog(String breed, String colour, String owner, boolean chasesSquirrels)
	{
		super(breed,colour,owner); //Call general constructor in Animal classs
		this.chasesSquirrels = chasesSquirrels;
	}
	
	public boolean getChasesSquirrels()
	{
		return this.chasesSquirrels;
	}
	public void setChasesSquirrels(boolean chasesSquirrels)
	{
		this.chasesSquirrels = chasesSquirrels;
	}
	public void speak()
	{
		System.out.println("Woof woof!");
	} 
	
}