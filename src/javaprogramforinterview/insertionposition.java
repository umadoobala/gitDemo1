package javaprogramforinterview;

public class insertionposition {
	public static int position(int[] arr, int target)
	{
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(arr[mid]==target)
				return mid;
			else if(arr[mid]>target)
				end=mid-1;
			else
				start=mid+1;
		}
		return start;
	}

	public static void main(String[] args) {
		 int[] arr= {1,3,5,6,7,8};
		 System.out.println(position(arr,2));
	}

}
