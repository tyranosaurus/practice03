package prob3;

public class Prob3 {
	
	public static void main(String args[]) {
		
		char[] array1 = reverse("Hello World");
		printCharArray(array1);
		
		char[] array2 = reverse("Java Programming!");
		printCharArray(array2);
		
	}
	
	public static char[] reverse(String str){
		/* 구현코드 */
			char[] a = new char[str.length()];
			
			for (int i = 0; i < str.length(); i++)
			{
				a[i] = str.charAt(a.length-1-i);
			}
					
		return a;
	}
	
	public static void printCharArray(char[] array){
		/* 구현코드 */
		char[] b = array;
		for (int i = 0; i < b.length; i++)
		{
			System.out.print(b[i]);
		}
		System.out.println(" ");
	}
}
