package Process.model;

public class playDohCircle
{
	//Declaration Section
	//Data member Section
	private int size;
	
	public playDohCircle()
	{
		this.size = 5;
	}
	
	public playDohCircle(int size)
	{
		this.size = size;
		
	}
	
	public String toString()
	{
		String description = " I am a circle, My size is " + size;
		return description;
	}
}
