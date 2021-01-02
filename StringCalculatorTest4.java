package stringcalculator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculatorTest4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input to string calculator: ");
		String s=sc.nextLine();
		int n=add(s);
		System.out.println("sum = "+n);

	}
	public static int add(String numbers)
	{
		int sum=0;
		if(!numbers.isEmpty())
		{
			Matcher token = Pattern.compile("\\d+").matcher(numbers);
			while (token.find( )) {
				String s = token.group(0);
				int n = Integer.parseInt(s);
				sum=sum+n;
			}
		}
		return sum;
	}
}
