package lab22sept;
//2. Write a java program to illustrate C class with addition, subtraction, multiplication methods that can take any number of parameters to perform the operation, without using method/constructor overloading.

import java.util.*;
public class Calculator {public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter 1st no");
	double a=Sc.nextDouble();
	System.out.println("enter 2nd no");
	double b=Sc.nextDouble();
	data D=new data();
	D.add(a, b);
	D.sub(a,b);
	D.mul(a, b);
	D.div(a, b);
	
}

}
class data{
  void add(Double a,double b) {
System.out.println("addition is "+ (a+b));	
}
  void sub(Double a,double b) {
System.out.println("sub is "+ (a-b));	
}
  void mul(Double a,double b) {
System.out.println("mul is "+ (a*b));	
}
  void div(Double a,double b) {
System.out.println("div is "+ (a/b));	
}
}
