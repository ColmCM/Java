public class Cat extends Animal
{
	//Instance Cariables
	private boolean worksForSuperVillain;
	
	//Default constructor
	public Cat()
	{
		super(); // call Animal default constructor
		this.worksForSuperVillain = false;
	}
	
	//General constructor
	public Cat(String breed, String colour, String owner, boolean worksForSuperVillain)
	{
		super(breed,colour,owner);
		this.worksForSuperVillain = worksForSuperVillain;
	}
	
	public void setWorksForSuperVillain(boolean worksForSuperVillain)
	{
		this.worksForSuperVillain = worksForSuperVillain;
	}
	public boolean getWorksForSuperVillain()
	{
		return this.worksForSuperVillain;
	}
	public void speak()
	{
		System.out.println("Meow");
	}
	public String toString()
	{
		String res = "*************\nBreed: " + getBreed() +"\nColour: " + getColour() + "\nOwner: " + getOwner();
		res += "\nWorks for Super Villain: " + this.worksForSuperVillain;
		return res;
	}
	
}