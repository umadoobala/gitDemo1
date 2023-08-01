package javaprogramforinterview;

public class firstoccuranceofastring {
	public static void firstoccur(String str,String word)
	{
		if(str.contains(word))
			System.out.println(str.indexOf(word));
	}

	public static void main(String[] args) {
		
		firstoccur("count apex count by","count");

	}

}
