package javaprogramforinterview;

public class stringcontainsvowels {
	public static boolean checkingforvowels(String str)
	{
		return str.toLowerCase().matches(".*[aeiou].*");
	}

	public static void main(String[] args) {
		System.out.println( checkingforvowels("animal"));
		System.out.println( checkingforvowels("TV"));

	}

}

