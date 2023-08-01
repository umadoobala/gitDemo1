package javaprogramforinterview;

import java.util.ArrayList;
import java.util.List;

public class removeanumberfromarray {
	public static void removeano(int[] arr,int val)
	{  
		List<Integer> l=new ArrayList<Integer>();
		for(int i:arr)
		{
			if(i!=val)
			l.add(i);
		}
		System.out.println(l);
		}
	

	public static void main(String[] args)
	{
		int arr[]= {6,4,4,2,1};
	removeano(arr,4);	
	}

}
