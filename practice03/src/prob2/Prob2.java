package prob2;

import java.util.Scanner;

public class Prob2 
{
	public static void main(String[] args) 
	{
		/* 구현코드 */
		Scanner sc = new Scanner(System.in);
		System.out.print("금액 : ");
		
		int total = sc.nextInt();  //67879

		System.out.println("5만 : "+ (int)total/50000);
		System.out.println("1만 : "+ (int)(total%50000)/10000);
		System.out.println("5천 : "+ (int)(total%10000)/5000);
		System.out.println("1천 : "+ (int)(total%5000)/1000);
		System.out.println("500 : "+ (int)(total%1000)/500);
		System.out.println("100: "+ (int)(total%500)/100);
		System.out.println("50 : "+ (int)(total%100)/50);
		System.out.println("10 : "+ (int)(total%50)/10);
		System.out.println("1 : "+ (int)(total%10)/1);
		
	}
}

