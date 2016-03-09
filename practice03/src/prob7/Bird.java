package prob7;

public abstract class Bird 
{
	protected String name;
	protected String legs;
	protected String length;
	
	public abstract void fly();
	public abstract void sing();
	public void setName(String name) 
	{
		this.name = name;
	}
	public abstract String toString();
}
