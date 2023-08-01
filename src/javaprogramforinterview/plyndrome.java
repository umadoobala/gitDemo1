package javaprogramforinterview;

public class plyndrome {

	public static void main(String[] args) {
StringBuffer str2=new StringBuffer();
String str1="madam",str3;
char[] carray=str1.toCharArray();
for(int i=str1.length()-1;i>=0;i--)	
{
	str2.append(carray[i]);
	}
System.out.println(str2);
str3=str2.toString();
if(str1.equals(str3))
System.out.println("polyndrome");
else
System.out.println("Not a Ployndrome");

}
}