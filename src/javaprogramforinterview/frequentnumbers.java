package javaprogramforinterview;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class frequentnumbers {
	
	public static Set<Integer> frequent(int[] arr)
	{ 
		
		 //List<Integer> l=new LinkedList<Integer>();
		Set<Integer> s=new  HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				s.add(arr[i]);
				
			}
		}
		System.out.println(s);
	return s;
	}
	

	public static void main(String[] args) {
		int[] arr= {2,4,3,1,1,2,3,3};
		System.out.println(frequent(arr));
	}

}
