package guvi;

import java.util.Scanner;

public class Number {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Number that appear once");
		System.out.println("Enter size of array");
		int n=s.nextInt();
		System.out.println("Enter elements");
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int count=0;
		while(count!=1)
		{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println("The number that appear once is "+a[i]);
				break;
			}
			else
			{
				count=0;
			}
		}

		}
	}

}
