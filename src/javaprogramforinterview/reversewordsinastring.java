package javaprogramforinterview;

public class reversewordsinastring {
	public static void reverse(String str)
	{
		System.out.println(str);
		String rev[]=str.split(" ");
		//System.out.println(rev[2]);
		for(int i=0;i<rev.length;i++)
			System.out.print(rev[i]);	
		System.out.println();
			for(int i=rev.length-1;i>0;i--)
			System.out.print(rev[i]);
	}

	public static void main(String[] args) {
		String str= "my name is umadevi";
		reverse(str);

	}

}
