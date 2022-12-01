use Abhidb;
create table Department(Department_ID INT(3) PRIMARY KEY,Department_NAME VARCHAR(10) UNIQUE NOT NULL,
Department_HEAD VARCHAR(10) UNIQUE NOT NULL,Department_DESC VARCHAR(18) UNIQUE NOT NULL);
create table Employee (Employee_id int(3) primary key, Employee_name varchar(15) unique not null, Employee_address varchar(20),
 Employee_salary int(8) not null check(Employee_salary between 1000 and 30000), 
Employee_contact bigint(12) unique,Department_ID int(3),foreign key(Department_ID)references Department(Department_id));
