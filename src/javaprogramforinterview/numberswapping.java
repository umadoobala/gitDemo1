
package javaprogramforinterview;
import java.util.Scanner;
public class numberswapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x,y;
System.out.println("Enter 2 numbers");
Scanner ins=new Scanner(System.in);
x=ins.nextInt();
y=ins.nextInt();
System.out.println("Before swapping"+x+"\n"+y);
y=x+y-(x=y);
System.out.println("Swapped numbers"+x+"\n"+y);
	}

}
