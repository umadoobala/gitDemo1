package javaprogramforinterview;

 class  rev
{
    public void reverse(String str)
  {
	StringBuilder out =new StringBuilder();
	char[] c= str.toCharArray();
	for(int i=c.length-1;i>=0;i--)
	{
		out.append(c[i]);
	}
	System.out.println("reversed string   "+out);
	}
}
public class reverseastring
{
  public static void main(String[] args) 
  {
	rev rs=new rev();
	rs.reverse("milikins");
	//System.out.println(rs.reverse("Milkiness");
  }
}


