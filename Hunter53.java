package codekata;

import java.util.Scanner;

public class Hunter53
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter string");
		String s=in.next();
		in.close();
		for(int i=1;i<s.length();i++)
		{
			System.out.println(s.charAt(0)+""+s.charAt(i));
		}
	}
}
