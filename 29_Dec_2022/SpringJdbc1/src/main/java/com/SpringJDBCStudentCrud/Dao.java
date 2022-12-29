package com.SpringJDBCStudentCrud;

public interface Dao {
	
	//Abstarct method (Crud Operations
	public int insert(Student student);
	public int update(Student student,int id);
	public int delete(Student student,int id);

	
}
