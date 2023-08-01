package javaprogramforinterview;

public class missingnumber {
	public static int missing(int[] num) {
		//int realsum=0,sum=0,highest=0;
		int highest=0,i=0;
		for(i:num)
		{
			if(num[i]>highest)
			highest=num[i];
		}
		return(highest);
		/*for(int i=0;i<=highest;i++)
			realsum=realsum+i;
		for(int j:num)
			sum=sum+j;
		return(realsum-sum);*/
		
	}
	

	public static void main(String[] args) {
	
int[] num= {3,4,6,2,1};
System.out.println(missing(num));
	}

}
