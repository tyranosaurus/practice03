package prob7;

public class Duck extends Bird 
{
	public void fly()
	{
		System.out.println("오리(" + super.name + ")는 날지 않습니다." );
	}
	public void sing()
	{
		System.out.println("오리(" + super.name + ")가 소리내어 웁니다." );
	}
	
	public String toString()
	{
		
		String a = "오리의 이름은 " + super.name + " 입니다";
		
		return a;
	}
	
}
