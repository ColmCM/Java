public class testAnimal
{
	public static void main(String args[])
	{
		//Create an Animal object
		Animal a1 = new Animal();
		System.out.println(a1.toString());
		a1.setColour("Red");
		a1.setOwner("Tom Kelly");
		System.out.println(a1.toString());
		a1.speak();
		
		Dog d1 = new Dog();
		System.out.println(d1.getChasesSquirrels());
		d1.speak();
		
		Cat c1 = new Cat();
		Cat c2 = new Cat("TOby","black","Mary Jones",true);
		
		c2.setWorksForSuperVillain(false);
		c2.speak();
	}
}