package javaprogramforinterview;

public class isPalindrome {
	public static boolean  checkpolindrome(int x)
	{
		int num=x,reverse=0;
		while(num>0)
		{
			reverse=reverse*10+num%10;
		num=num/10;
		}
		if(reverse==x)
			return true;
		else 
			return false;
					
	}

	public static void main(String[] args) {
		
		System.out.println(checkpolindrome(343));
		
	}

}
