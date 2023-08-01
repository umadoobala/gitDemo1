package javaprogramforinterview;

import java.util.ArrayList;
import java.util.List;

public class movingallzerostoendofanarray {
	
	
	public static void move(int[] nums)
	{
	
	/*{
		int count=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=0)
				nums[count++]=nums[i];
		}
		while(count<nums.length)
		{
			nums[count++]=0;
		}
		System.out.println(nums);*/
	
	    
	    for(int i=0;i<nums.length;i++) 
	    { 
	    	for(int j=i+1;j<nums.length;j++)
	        {
	    		if(nums[i]==0)
	        {
	        	int temp=nums[i];
	        	nums[i]=nums[j];
	        	nums[j]=temp;
	        }
	        }
	            }
	    for(int i=0;i<nums.length;i++)
	    System.out.print(nums[i] + " ");
   }
	
	

	public static void main(String[] args) {
		int[] nums= {0,12,0,5,6,0,4,0,3};
		move(nums);
		
	}

}
