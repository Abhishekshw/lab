package lab.laB_25_aug;
import java.util.*;
public class prime {
	public static void main(String []args) {
		int a,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
int num=sc.nextInt();
for(int i=2;i<num;i++) {
	if(num%i==0){
		count++;
		break;
	}
}
	if(count==0)
		System.out.println("a prime number");
	else 
		System.out.println("not a prime no");
	
}
	}



	


