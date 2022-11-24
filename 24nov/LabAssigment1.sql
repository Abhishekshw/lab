use abhidb;
create table CUSTOMER(Cust_id varchar(5),Fname varchar(15),Lname varchar(15),
Area char(2),Phone bigint(10),DOB date,Payment numeric(6,2));
insert into customer values('A01','Ivan','Ross','SA',6125467,'1986-01-15',800.50),
('A02','Vandana','Ray','MU',5560379,'1987-12-20',1000.75),
('A03','Pramda','Jauguste','DA',4560389,'1967-07-25',500.00),
('A04','Basu','Navindi','BA',6215401,'1956-02-29',860.0),
('A05','Ravi','Shridhar','NA',null,'1989-02-15',500.50),
('A06','Rukmini','Aiyer','GH',5125274,'1987-07-23',1500.50);
#2 Display Structure of table
Describe customer;
#3display data of created table
Select * from customer;
#4 insert a row which accept System date 
alter table customer add System_date date after payment;
update customer set System_date= current_date;
#5 display data in the table
Select * from customer;
#6 update phone number of customer A02 and A04
update customer set Phone='700384175' where Cust_id='A01';
update customer set Phone='760384575' where Cust_id='A04';
# 7. Update the date of birth of customer A03 and A05.
update customer set DOB='2000-05-24' where Cust_id='A03';
update customer set DOB='2001-05-14' where Cust_id='A05';
#8. Display the updated table.
Select * from customer;
#9. Delete 2 rows from the table for customers A01 and A05.
delete from  customer where Cust_id='A05';
delete from  customer where Cust_id='A01';
#10. Delete all the rows from the table.
truncate customer; 
#11. Insert 5 records according to your own wish.
insert into customer values('1','Abhishek','Shaw','Na',7003541,'2000-01-15',800.50,'2000-01-15'),
('2','Vandana','Singh','ko',9903903915,'1999-12-20',1075,'2000-01-15'),
('3','Pusha','raj','TA',99099099,'1969-09-25',1500.00,'1999-12-20'),
('4','Basu','Nandi','LK',56982347,'2008-02-29',1860.0,'1999-12-20'),
('5','venugopal','Aiyer','Gj',568474,'1907-07-23',1570.50,'1999-12-20');
#12. Update one record based on any criteria according to your own wish.
update customer set Payment='2500' where Cust_id='1';
#13. Delete any 1 record from the table based on particular criteria.
Delete from customer where Cust_id ='2';

