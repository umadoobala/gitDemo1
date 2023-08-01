package javaprogramforinterview;

public class seconghighest {

	public static void main(String[] args) {
		Integer arr[]= {3,6,8,2,10};
		System.out.println(secondhighest(arr));
	}
 public static int secondhighest(Integer[] arr)
 {
	 int max=0,secmax=0;
    for(int i:arr)
    {
	if(i>max)
	{
	secmax=max;
	max=i;
	}
    }
    return secmax;
 }
}

