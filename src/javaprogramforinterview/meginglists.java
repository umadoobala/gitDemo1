package javaprogramforinterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class meginglists {
	public static List<Integer>merge(List<Integer>l1,List<Integer> l2)
	
	{ int i=0,j=0;
	List<Integer> mergedlist=new ArrayList<Integer>();
	while((i<l1.size()&&j<l2.size()))
			{ if(l1.get(i)<l2.get(j))
				{
				mergedlist.add(l1.get(i));
				i++;
				}
			else
				{
				mergedlist.add(l2.get(j));
				
				j++;}
			
			}
	
	while (i < l1.size()) {
        mergedlist.add(l1.get(i));
        i++;
    }

    // Add remaining elements from list2, if any
    while (j < l2.size()) {
        mergedlist.add(l2.get(j));
        j++;
    }
	     Collections.sort(mergedlist);
		return mergedlist;
	}

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(5);
		l1.add(2);
		l1.add(1);
		List<Integer> l2=new ArrayList<Integer>();
		l2.add(3);
		l2.add(1);
		l2.add(4);
		List <Integer> mergedlist =merge(l1,l2);
		System.out.println(mergedlist);
		
		
	}

}
