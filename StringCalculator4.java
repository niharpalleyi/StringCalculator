package stringcalculator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator4 {
	static String s1="";
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input to string calculator: ");
		String s=sc.nextLine();
		int n=0;
		try {
		n=add(s);
		if(n==-1)
			throw new Exception("negatives not allowed "+s1);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			System.exit(0);
		}
		System.out.println("sum = "+n);

	}
	public static int add(String numbers)
	{
		int sum=0;
		if(!numbers.isEmpty())
		{
			s1="";
			Matcher token = Pattern.compile("-\\d+|\\d+").matcher(numbers);
			while (token.find( )) {
				String s = token.group(0);
				int n = Integer.parseInt(s);
				if(n<0)
				{
					s1=s1+" "+n;
				}
				else
					sum=sum+n;
			}
			if(!s1.isEmpty())
			{
				return -1;
			}
		} 
		return sum;
	}
}
