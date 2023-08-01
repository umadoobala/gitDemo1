package javaprogramforinterview;

import java.util.ArrayList;
import java.util.List;

public class adding2lists {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<>();
		List<String> l2=new ArrayList<>();
		l1.add("First");
		l2.add("third");
		l2.add("Fourth");
		//List<String> mergedlist=new ArrayList(l1);
		//mergedlist.addAll(l2);
		//System.out.println(mergedlist);
		l1.addAll(l2);
		System.out.println(l1);
	}
}
