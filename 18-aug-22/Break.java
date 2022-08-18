//Write a Java program to break an integer into a sequence of individual digits.
package lab;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=123456;//value
		int a=(number)/100000%10;//logic
		int b=number/10000%10;
		int c=number/1000%10;
		int d=number/100%10;
		int e=number/10%10;
		int f=number%10;
		System.out.println(+a+" " +b +" "+ c+ " " +d + " "+e +" "+f);//output
		
	}

}
