package lab.Sept9lab;
/*1… Write the following code:
1. A class named Arithmetic with a method named add that takes integers as parameters and
returns an integer denoting their sum.
2. A class named Adder that inherits from a superclass named Arithmetic.
Input Format
test your submission by calling the add method on an Adder object and passing it integer parameters.*/
class Arithmetic{//parent class
	void add(int a,int b){//method for add
		System.out.println("the Summ is "+(a+b));//integer output
	}
}
public class Adder extends Arithmetic {//sub class
	public static void main(String []args) {//main method
		Adder A=new Adder();//object of adder
		A.add(5,6);//method calling by passing paramerter
	}
}
