package javaprogramforinterview;

import java.util.Scanner;

public class stringcomparission 
{
	public static void main(String[] args)
{
String x,y;
	System.out.println("Enter 2 strings");
	Scanner ins=new Scanner(System.in);
	x=ins.nextLine();
	y=ins.nextLine();
	if(x.compareTo(y)>0)
	System.out.println("x is bigger than y"+x+"\n"+y);
	if(x.compareTo(y)<0)
		System.out.println("y is bigger than x"+x+"\n"+y);
}
}
