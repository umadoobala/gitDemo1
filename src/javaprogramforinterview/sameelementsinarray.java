package javaprogramforinterview;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class sameelementsinarray {

	public static void main(String[] args) {
	Integer[] arr1 = {1,4,3,2};
	Integer[] arr2= {1,2,3,4,5};
	System.out.println(sameElement(arr1,arr2));

	}
public static boolean sameElement(Object[] arr1,Object[] arr2)
{ 
Set<Object> t1=new TreeSet<>(Arrays.asList(arr1));
 Set<Object> t2=new TreeSet<>(Arrays.asList(arr2));
  return(t1.equals(t2));

	}
}
