package javaprogramforinterview;

import java.util.LinkedList;
import java.util.List;

public class insertanelementinList {

	public static void main(String[] args) {
		List<Integer> l=new LinkedList<Integer>();
		l.add(1);
		l.add(3);
		l.add(5);
		System.out.println(l);
		l.add(0,4);
		System.out.println(l);

	}

}
