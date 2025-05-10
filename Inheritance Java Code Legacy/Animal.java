public class Animal   //superclass
{
	//Atrributes
	private String breed;
	private String colour;
	private String owner;
	
	//Default constructor
	public Animal()
	{
		this.breed = "None";
		this.colour = "Black";
		this.owner = "Jane Doe";
	}
	//General Constructor
	public Animal(String breed, String colour, String owner)
	{
		this.breed = breed;
		this.colour = colour;
		this.owner = owner;
	}
	//Getter and SEtter methods
	public String getBreed()
	{
		return this.breed;
	}
	public String getColour()
	{
		return this.colour;
	}
	public String getOwner()
	{
		return this.owner;
	}
	public void setBreed(String breed)
	{
		this.breed = breed;
	}
	public void setColour(String colour)
	{
		this.colour= colour;
	}
	public void setOwner(String owner)
	{
		this.owner = owner;
	}
	//Functionality
	public void speak()
	{
		System.out.println("Grr!");
	}
	public String toString()
	{
		String res = "************* \nBreed: " + this.breed +"\nColour: " + this.colour + "\nOwner: " + this.owner;
		return res;
	}
}
