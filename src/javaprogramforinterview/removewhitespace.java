package javaprogramforinterview;

public class removewhitespace {

	public static void main(String[] args) {
		StringBuilder str2=new StringBuilder();
		String str1="apex  consultancy";
		char[] carray=str1.toCharArray();
		for(char c:carray)
		{
			if(!Character.isWhitespace(c))
				str2.append(c);
		}
		System.out.println(str2);	
		
		
	}

}
