package codekata;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Pro47
{
	@SuppressWarnings("rawtypes")
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		System.out.println("Enter the number of entries");
		int tot=in.nextInt();
		String[] s1=new String[]{"ABC","DEF","GHI","JKL","MNO","PRS","TUV","WXY"};
		String[] str=new String[tot];
		for(int i=0;i<tot;i++)
		{
			str[i]=in.next().toUpperCase();
		}
		for(int i=0;i<tot;i++)
		{
			String out="";
			for(int j=0;j<str[i].length();j++)
			{
				if(Character.isDigit(str[i].charAt(j)))
				{
					if(out.length()==3)
					{
						out=out+"-";
					}
					out=out+String.valueOf(str[i].charAt(j));
				}
				else
				{
					String temp="";
					temp=temp+str[i].charAt(j);
					for(int k=0;k<8;k++)
					{
						if(out.length()==3)
						{
							out=out+"-";
						}
						if(s1[k].contains(temp))
						{
							out=out+String.valueOf(k+2);
						}
					}
				}
			}
			if(out.length()==8)
			{
				if(hm.containsKey(out))
				{
					int val=hm.get(out);
					val=val+1;
					hm.put(out,val);
				}
				else
				{
					hm.put(out,1);
				}
			}
		}
		Set set=hm.entrySet();
		Iterator itr=set.iterator();
		TreeSet<String> ts=new TreeSet<String>();
		while(itr.hasNext())
		{
			Map.Entry mp=(Entry) itr.next();
			if((int) mp.getValue()>1)
			{
				String temp="";
				temp=temp+(String) mp.getKey()+" "+String.valueOf((int) mp.getValue());
				ts.add(temp);
			}
		}
		Iterator itr1=ts.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		in.close();
	}
}
