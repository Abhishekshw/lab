package com.SpringJDBCStudentCrud;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App      //creating App class
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("Hibernate.cfg.xml");  //configuring and connecting xml file to jdbc.
        
        Dao dao = ac.getBean("DaoImpl",Dao.class); //returning instudentance of DaoImpl class through getBean method.
//        studentudent studentudent = new studentudent();
//        student.setId(01);
//        student.setName("Shekhar");
//        student.setEmail("Sekhar@gmail.com");
//        student.setAge(19);
//        student.setAddress("Naihatti");
          Student student2 = new Student();
//        student2.setId(02);
//        student2.setName("Ritik");
//        student2.setEmail("Ritik@gmail.com");
//        student2.setAge(15);
//        student2.setAddress("Kolkata");
//        dao.update(student2,02); // for update
          dao.delete(student2,02); //for delete
          
    }
}