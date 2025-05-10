public class Newspaper extends Publication
{
	private String editor;
	private long phoneNumber;
	private String emailAddress;
	
	public Newspaper()
	{
		super();
		this.editor = "No editor";
		this.phoneNumber = 0;
		this.emailAddress = "none@none.ie";
	}
	
	public Newspaper(String author,int noPages,String pubLocation,int year,String editor,long phoneNumber,String emailAddress)
	{
		super(author,noPages,pubLocation,year);
		this.editor = editor;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}
	
	public String getEmailAddress()
	{
		return this.emailAddress;
	}
	
	public void setEditor(String editor)
	{
		this.editor=editor;
	}
	
	public String toString()
	{
		String res = "************\nAuthor: " + getAuthor() + "\nNo Pages: " + getNoPages() + "\nPublication Location: " +
			getPubLocation() + "\nYear: " + getYear();
		res += "\nEditor: " + this.editor + "\nPhone Number: " + this.phoneNumber + "\nEmail address: " + this.emailAddress;
		return res;
	}
}