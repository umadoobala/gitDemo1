package javaprogramforinterview;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class findastringinafile {

	public static void main(String[] args) {
		String filepath ="Hide your sadness no one cares";
		//File file=new File(filepath);
		String str="your";
	System.out.println(findastring(filepath,str));
	}
	public static boolean findastring(String file2,String str) 
	{
		File file = new File(file2);
		//Scanner sc=new Scanner(file);
		try {
			Scanner sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(sc.hasNextLine())
		{String line=sc.nextLine();
		if(line.contains(str))
			sc.close();
			return true;
		}
		sc.close();
		return false;
	}

}
