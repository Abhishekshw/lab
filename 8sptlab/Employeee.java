package lab8sept;
class Employeee1{
	String ename;
	int id;
	Employeee1(String ename,int id){//cons creation
		this.ename=ename;
		this.id=id;
	}
	void show() {
		System.out.println(ename+" "+id);
	}
}
public class Employeee {
	public static void main(String []args) {
		Employeee1 e =new Employeee1("Abhi",2);
		Employeee1 e1 =new Employeee1("Ram",1);
		Employeee1 e2 =new Employeee1("Dev",3);
		Employeee1 e3 =new Employeee1("Shyam",4);
		e1.show();
		e.show();
		e2.show();
		e3.show();
	}
}
