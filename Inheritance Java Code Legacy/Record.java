public class Record
{
	//Instance Variables
	private String fname;
	private String lname;
	private String moName;
	private String faName;
	private int hospital;
	
	
	private int PPS;
	
	private static int lastPPS = 10000000;
	
	//Constructors
	public Record()
	{
		fname = "John";
		lname = "Doe";
		moName = "Jane Doe";
		faName = "John Doe";
		hospital = 0;
		lastPPS++;
		PPS = lastPPS;
	}
	
	public Record(String firstName,String lastName, String motherName,String fatherName, int hos)
	{
		fname = firstName;
		lname = lastName;
		moName = motherName;
		faName = fatherName;
		hospital = hos;
		lastPPS++;
		PPS = lastPPS;
	}
	public int getPPS()
	{
		return PPS;
	}
	public void setHospital(int hos)
	{
		hospital = hos;
	}
	public void printDetails()
	{
		String res = "Name: " + fname + " " + lname;
		res += "\nMother Name: " + moName;
		res+= "\nFathers Name: " + faName;
		res+= "\nHospital: " + hospital;
		res+= "\nPPS: " + PPS;
		System.out.println(res);
	}
	
	
	
	//Getter and Setter Methods
	
	//Print Details Method
	
	
}