package javaprogramforinterview;

public class numberofvowelspresent {
	public static void vowels(String str) 
	{
		char[] c= str.toCharArray();
		int count=0;
		for( char v:c)
		{
			if(v=='a'||v=='e'||v=='i'||v=='o'||v=='u')
				count++;
		}
		System.out.println(count);	
	}
	public static void main(String[] args)
	{
	vowels("batiee");

	}

}
