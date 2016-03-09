package prob7;

public class Sparrow extends Bird 
{
	public void fly()
	{
		System.out.println("참새(" + super.name + ")가 날아다닙다." );
	}
	public void sing()
	{
		System.out.println("참새(" + super.name + ")소리내어 웁니다." );
	}
	
	public String toString()
	{
		
		String a = "참새의 이름은 " + super.name + " 입니다";
		
		return a;
	}
	
}
