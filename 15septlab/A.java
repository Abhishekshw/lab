package lab.Sept9lab;
/* Class A serves as a base class for the derived class B, which in turn
serves as a base class for the derived class C. (Which type Of Inheritance
explain with an example)*/
public class A {//parent class  A
	void disp(){
		System.out.println("A");}}
class B extends A{ //child class of A
	void disp(){
		System.out.println("B");
		super.disp();}}
class C extends B{//child class of b
	void disp(){
		System.out.println("B");
		super.disp();}}
class Example{
	public static void main(String []args) {
		C c=new C();
		c.disp();}}
/*thid is example of multilavel inhertence here A is parent of B
,B is parent  C, and A is grend parent c*/