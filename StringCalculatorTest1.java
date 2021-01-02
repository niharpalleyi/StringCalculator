package stringcalculator;
import java.util.*;

public class StringCalculatorTest1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input to string calculator: ");
		String s=sc.nextLine();
		int n=add(s);
		System.out.println("sum = "+n);
	}
	public static int add(String numbers)
	{
		String s[]=numbers.split(",");
		int sum=0;
		if(s.length<3)
		{
			if(!numbers.isEmpty())
			{
				for(int i=0;i<s.length;i++)
				{
					int n=Integer.parseInt(s[i]);
					sum=sum+n;
				}
			}
		}
		return sum;
	}
}
