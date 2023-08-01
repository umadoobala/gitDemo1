package javaprogramforinterview;

import java.util.Scanner;

public class starconsole {

	public static void main(String[] args)
{
		// TODO Auto-generated method stub
int i,j,n;
Scanner s= new Scanner(System.in);
System.out.println("Enter number of rows you want?");
n=s.nextInt();
for(i=1;i<=n;i++)
{
	for(j=1;j<=i;j++)
	{
	System.out.print(j+"  ");
	}
	
	System.out.println();
	}
}
}
