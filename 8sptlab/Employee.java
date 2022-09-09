/* Q.2... java program to create employee object without using new keyword
take 5 input as id & name */

package sep8;
class Employee1{
	static void show(String name,int id) {//ststic method
		System.out.println("Employee id is  "+eid+"    Employee name is "+ name);
	}
}

public class Employee {
	public static void main(String[] args) {
		Employee1.show("Ram",1);//method calling
		Employee1.show("Laxman",2);
		Employee1.show("Shyam",3);
		Employee1.show("Sita",4);
		Employee1.show("Gita",5);
	}
}
