package codekata;

import java.util.Scanner;

public class Hunter101
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=in.nextInt();
		in.close();
		for(int i=1;i<=num;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(count==0)
				{
					for(int s=num-i;s>0;s--)
					{
						System.out.print(" ");
					}
					count++;
				}
				System.out.print(j);
			}
			for(int j=i-1;j>0;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
