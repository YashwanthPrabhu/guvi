package codekata;

import java.util.Scanner;

public class Hunter111
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String");
		in.close();
		String str=in.next();
		System.out.println(str+checkString(str.toLowerCase()));
	}
	public static String checkString(String str)
	{
		String s1=new String("abcdefghijklm");
		String s2=new String("nopqrstuvwxyz");
		int len=str.length();
		int count1=0;
		int count2=0;
		for(int i=0;i<len;i++)
		{
			String temp="";
			temp=temp+str.charAt(i);
			if(s1.contains(temp))
			{
				count1++;
				count2=0;
			}
			else if(s2.contains(temp))
			{
				count2++;
				count1=0;
			}
			if(count1>1||count2>1)
			{
				return (String) (" is not balanced");
			}
		}
		return (String) " is balanceed";
	}
}
