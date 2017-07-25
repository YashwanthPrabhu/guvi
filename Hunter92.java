package codekata;

import java.util.Scanner;

public class Hunter92
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		System.out.print(s.replaceAll("\\s{2,}"," ").trim());
		in.close();
	}
}
