package lab.Sept9lab;
/*Consider a scenario where Bank is a class that provides functionality to get the rate
of interest. However, the rate of interest varies according to banks. For example, SBI,
ICICI and AXIS banks could provide 8%, 7%, and 9% rate of interest.*/

class Bank{//parent class
	void getrateofinterst() {//method 
		System.out.println("");
		}}
class Sbi extends Bank{//child class of bank
	void getrateofinterst() {//method overriding
		float rate=8;
		System.out.println("the rate of sbi is "+rate +" %");
		}}
class Icici extends Bank{//child class of bank
	void getrateofinterst() {//method overriding
		float rate=7;
		System.out.println("the rate of Icici is "+rate +" %");
		}}
class Axis extends Bank{//child class of bank
	void getrateofinterst() {//method overriding
		float rate=9;
		System.out.println("the rate of Axis is "+rate +" %");
		}}
public class Get_rate_of_int {//main class
public static void main(String[] args) {
	Sbi s=new Sbi();//object creation 
	Icici i=new Icici();//object creation 
	Axis a=new Axis();//object creation 
	a.getrateofinterst();//method calling 
	i.getrateofinterst();//method calling 
	s.getrateofinterst();//method calling 
}}
