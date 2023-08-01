package javaprogramforinterview;

public class primenumbercheck {

	public static boolean prime(int num)
	{
		int i=2;
		
	
		if(num<=1)
		return true;
		else
		{
			for(i=2;i<=num;i++)
	          {
				if(num%i==0)
				return true;		
				}
		    }
	    return true;
	   
		}
	
		public static void main(String[] args)
		{
			
			if(prime(7))
			System.out.println("Not a prime number");
			else
				System.out.println("prime number");
		}
		}

	
