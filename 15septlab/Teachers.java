package lab.Sept9lab;
/*/In this example, you have a base class Teacher and a sub class ITTeacher. Since
class ITTeacher extends the designation and college properties and work () method from
base class, we need not to declare these properties and method in sub class.
Here we have college Name, designation and work () method which are common to all the
teachers so we have declared them in the base class, this way the child classes like Math
Teacher, Music Teacher and PhysicsTeacher do not need to write this code and can be used
directly from base class.
*/
class Teacher{//BASE CLASS
	void designation(){//METHODS
		System.out.println("Professer"); }
	void collageproperties(){//METHODS 
		System.out.println("Collage name is Fit");
	}
	void work(){//METHODS 
		System.out.println("Work is taching");}
}
class Ittaecher extends Teacher{}//SUB CLASS OF BASE CLASS
class Math extends Teacher{}//SUB CLASS OF BASE CLASS}
class Music extends Teacher{}//SUB CLASS OF BASE CLASS
class Physics extends Teacher{}//SUB CLASS OF BASE CLASS
public class Teachers {//MAIN CLASS
public static void main(String[] args) {//MAIN METHOD
		Ittaecher i=new Ittaecher();//OBJECT OF Ittaecher
		i.designation();//METTHOD CALLING
		i.collageproperties();
		i.work();
		}
}
