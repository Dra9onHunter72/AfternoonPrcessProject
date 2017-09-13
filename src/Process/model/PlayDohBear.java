package Process.model;

public class PlayDohBear
{
	private int size;
	
	public PlayDohBear()
	{
		this.size = 20;
	}

	public PlayDohBear(int size)
	{
		this.size = size;
	}
	public void setSize(int newSize)
	{
		this.size = newSize;
	}
	
	
	
	
	public String toString()
	{
		String description = "This is a bear, his size is " + size;
        return description;
	}
}
