package com.MavenTask.TaskHome;

import java.util.*;
class Sweet
{
	void chocolates(String a[],int b[])
	{
		
		int l=a.length,sum=0;
		System.out.println("\nOutput of the Program:\n");
		System.out.println("The Chocolates Present are:");
		for(int i=0;i<l;i++)
		{
			System.out.println("\t\t\t    "+a[i]);
		}
		for(int i=0;i<l;i++)
		{
			sum=sum+b[i];
		}
		System.out.println("\nThe Total Weight of the Chocolates is:"+sum);
		System.out.println("\nAfter Sorting The Chocolates are:");
		for(int i=0;i<l;i++)
		{
			
			for(int j=0;j<l-1;j++)
			{
				if((a[j].compareTo(a[j+1]))>0)
				{
					String temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<l;i++)
		{
			System.out.println("\t\t\t\t  "+a[i]);
		}
	}
}
class EpamHomeTask
{
	public static void main(String arg[])
	{
		
		Sweet obj=new Sweet();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of chocolates:");
		int n=s.nextInt();
		String a[]=new String[n];
		int w[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Chocolate Name:"+(i+1));
			a[i]=s.next();
			System.out.println("Enter Chocolate Weight:"+(i+1));
			w[i]=s.nextInt();
		}
		obj.chocolates(a,w);
		s.close();
	}
}
