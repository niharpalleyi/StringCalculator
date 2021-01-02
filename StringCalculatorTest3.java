package stringcalculator;

import java.util.Scanner;

public class StringCalculatorTest3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input to string calculator: ");
		String s=sc.nextLine();
		//System.out.println(s);
		int n=add(s);
		System.out.println("sum = "+n);

	}
	public static int add(String numbers)
	{
		int sum=0;
		if(!numbers.isEmpty())
		{
			String s[]=numbers.split("[,\\\\n]+");
			for(int i=0;i<s.length;i++)
			{
				int n=Integer.parseInt(s[i]);
				sum=sum+n;
			}
		}
		return sum;
	}

}
