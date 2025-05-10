public class Publication
{
	private String author;
	private int noPages;
	private String pubLocation;
	private int year;
	
	//default constructor
	public Publication()
	{
		this.author = "None";
		this.noPages = 0;
		this.pubLocation = "No where";
		this.year = 0;
	}
	public Publication(String author,int noPages, String pubLocation, int year)
	{
		this.author = author;
		this.noPages = noPages;
		this.pubLocation = pubLocation;
		this.year = year;
	}
	public void setAuthor(String author)
	{
		this.author = author;
	}
	public String getAuthor()
	{
		return this.author;
	}
	public String getPubLocation()
	{
		return this.pubLocation;
	}
	public int getYear()
	{
		return this.year;
	}
	public void setYear(int year)
	{
		this.year = year;
	}
	public int getNoPages()
	{
		return this.noPages;
	}
	public String toString()
	{
		String res = "************\nAuthor: " + this.author + "\nNo Pages: " + this.noPages + "\nPublication Location: " +
			this.pubLocation + "\nYear: " + this.year;
		return res;
	}
}