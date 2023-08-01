package javaprogramforinterview;

public class Besttimetobuyandsellstocks {
   public static int stocks(int[] arr)	
   {
	   int a=Integer.MAX_VALUE,max=0;
	   for(int i=0;i<arr.length;i++)
	   { 
		   if(arr[i]<a)
		   a=arr[i];
		   for(int j=i;j<arr.length;j++)
		   {
			   if(arr[j]>arr[i])
				   max=j+1;
		   }
	   }
	   return max;
   }

	public static void main(String[] args) {
		int[] arr= {11,1,2,3,5,8,9,10};
		System.out.println(stocks(arr));

	}

}
