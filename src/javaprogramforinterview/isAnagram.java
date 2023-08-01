package javaprogramforinterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class isAnagram {
	public static boolean checkforAnagram(String string1,String string2) {
		char[] c1=string1.toCharArray();
		char[] c2=string2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1,c2);
		
	}

	public static void main(String[] args) {
		String s1="listen";
		String s2="silent";
		if(checkforAnagram(s1,s2))
		System.out.println("valid anagram");
		else
			System.out.println("Not a valid anagram");
		

	}

}
;
