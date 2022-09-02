package lab.lab2sept;
/*. you will make a class ‘Rectangle’ and declare the variable length and breadth as private. 
One Constructor will be used for initializing the value of variables. When an object is created, 
the constructor will be called and the default value of the instance variables will be assigned. 
Now create another new class ‘RectangleTest’ & create an object of class Rectangle and 
assign values of the parameter used in constructor. Calculate area of the rectangle and print 
it on the console. Let’s update the new value of variable. And then read the updated value.*/
 class Rectangle {
	int lenght,breath;
Rectangle(int l,int b) {
	lenght=l;
	breath=b;
	}
	
void cal() {
	double area=lenght*breath;
	System.out.println(area);
	}}
class RectangleTest{
	public static void main(String []args){
	Rectangle r=new Rectangle( 40,40);
	Rectangle r1= new Rectangle(50,50);
	r.cal();
	r1.cal();
	}
}