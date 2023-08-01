package javaprogramforinterview;

public class logestsubstring {
	public static  void substring(String str)
	{
		
		StringBuilder currentsubstring = new StringBuilder();
		int maxlength=0;
		for(int i=0;i<str.length();i++)
		{
			
			for(int j=i;j<str.length();j++)
			{
				if(currentsubstring.indexOf(String.valueOf(str.charAt(j)))!=-1)
				break;
				
			currentsubstring.append(str.charAt(j));
			maxlength=Math.max(maxlength,currentsubstring.length());
				}
					
		}
	System.out.println(maxlength+" "+currentsubstring);
	}

	public static void main(String[] args) {
		String st="abbabcda";
		substring(st);

}
}
