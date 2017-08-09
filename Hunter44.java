package test;

import java.util.Scanner;

public class Hunter44
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=in.nextInt();
		in.close();
		String s=Integer.toBinaryString(num-1);
		s=s.replaceAll("0","3");
		s=s.replaceAll("1","4");
		System.out.println("The "+num+"th of the series is "+s);
	}
}
