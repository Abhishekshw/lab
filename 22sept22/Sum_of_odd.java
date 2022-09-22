package lab22sept;
//sum of odd number upto n
import java.util.Scanner;
public class Sum_of_odd {
public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter an number");
	int n=Sc.nextInt();
	int sum=0;
	for(int i=0;i<n;i++) {
		if(i%2==1) {
			sum+=i;
		}
	}
	System.out.println("the sun of odd number upto "+n+" is "+sum);
}

}
