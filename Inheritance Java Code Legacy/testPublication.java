public class testPublication
{
	public static void main(String args[])
	{
		Publication p5[] = new Publication[5]; // Create an array of 5 publication objects
		for(int i = 0; i < p5.length ; i++)
		{
			p5[i] = new Publication();
			System.out.println("Publication Number " + i + " details: \n" + p5[i].toString());
		}
		//Change the author of the 2nd index 
		p5[1].setAuthor("W. B. Yeats");
		p5[1].setYear(2010);
		System.out.println(p5[1].toString());
		
		Newspaper n1 = new Newspaper();
		System.out.println("Email Address of n1: " + n1.getEmailAddress());
		System.out.println("Details of Newspaper n1: \n" + n1.toString());
		Newspaper n2 = new Newspaper("Dan Brown",234,"New York",2010,"Joe Kelly",899787987,"joe@hello.ie");
		n2.setEditor("Greg Kirk");
		System.out.println(n2.getEmailAddress());
	}
}