package javaprogramforinterview;

public class twosum {
	
	public static int[] index(int[] arr, int target)
	{
		for(int i=0;i<arr.length-1;i++)
		{
	     for(int j=i+1;j<arr.length-1;j++)
	     {
	    	 if ((arr[i]+arr[j])==target)
	    	 { 
	    		 int[] s= {i,j};
	   	    	 return (s);
	          }
	      }
		}
		return arr;
	}
	

	public static void main(String[] args) {
		
int[] num= {1,2,4,5};
int target=3;
System.out.println( index(num,target));
	}

}
