/*You are given a class AdvancedArithmetic which contains a method signature int
divisor_sum(int n). You need to write another class called MyCalculator which implements the
method.*/
package lab.lab2sept;
import java.util.*;
class AdvancedArithmetic {
	int num;
	void divisorsum() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		 num=sc.nextInt();
		int sum=0;
	for(int i=1; i<=num; i++){//logic for sum -divisor
		if(num%i==0) {
			sum=sum+i;
			}	}
	System.out.println("sum of diviser is "+sum);//outprint
}}
public class MyCalculator {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdvancedArithmetic a=new AdvancedArithmetic();//new object
		a.divisorsum();//method calling
	}}
