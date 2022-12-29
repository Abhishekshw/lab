package com.SpringJDBCStudentCrud;

import org.springframework.jdbc.core.JdbcTemplate;
// creating DaoImpl Class and implementing Dao interface
public class DaoImpl implements Dao{					
	  // Creating instance of inbuilt jdbcTemplete class
	private JdbcTemplate jdbcTemplate;	
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate= jdbcTemplate;
	}
	@Override
	public int insert(Student student) {                   // insertion logic
        System.out.println("Insertion done!!");
		String query = "insert into Student values(' "+student.getId()+" ',' "+student.getName()+" ' , ' "+student.getEmail()+" ' ,' "+student.getAddress()+" ' ,' "+student.getAge()+" ')";
		return jdbcTemplate.update(query);				
	}
	@Override
	public int update(Student student,int id) {				//updation logic
		System.out.println("Updation done!!!");
		return jdbcTemplate.update("UPDATE Student SET name = 'Subodh', email =' subodh@gmail.com', address = 'Barrackpore',age=28 WHERE id ="+id);
		}
	@Override
	public int delete(Student student ,int id) {			//delete logic
		System.out.println("Deletion Successfull!!!");
		return jdbcTemplate.update("delete from Student WHERE id ="+id);
	}
	}

