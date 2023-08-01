package javaprogramforinterview;

import java.util.HashSet;
import java.util.Set;

public class consectutivenumbersinanarray {
	public static Set<Integer> consecutive(int[] arr ) 
	{
		Set<Integer> s= new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if((arr[i]-arr[j])==1||(arr[j]-arr[i])==1)
					{
					s.add(arr[i]);
					s.add(arr[j]);
					}
				}
		}
		 return s;
	}

	public static void main(String[] args) {
		int[] arr = {2,200,3,250,4,5,300,6};
		System.out.println(consecutive(arr));
		
	}

}
