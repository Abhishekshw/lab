package lab.laB_25_aug;
import java.util.*;
public class Factorial {
	public static void main(String []args) {
		int d=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int num=sc.nextInt();
for(int i=1;i<=num;i++ ) {
d=d*i;
}
System.out.println("factorial of "+num+ " is " + d);
	}
}
