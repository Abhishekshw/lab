use abhidb;
create table CUSTOMER(Cust_id varchar(5) primary key ,Fname varchar(15) not null,Lname varchar(15),
Area char(2) not null,Phone bigint(10),DOB date,Payment numeric(6,2));
insert into customer values('A01','Ivan','Ross','SA',6125467,'1986-01-15',800.50),
('A02','Vandana','Ray','MU',5560379,'1987-12-20',1000.75),
('A03','Pramda','Jauguste','DA',4560389,'1967-07-25',500.00),
('A04','Basu','Navindi','BA',6215401,'1956-02-29',860.0),
('A05','Ravi','Shridhar','NA',null,'1989-02-15',500.50),
('A06','Rukmini','Aiyer','GH',5125274,'1987-07-23',1500.50);
create table Movie(Mv_no int (3) primary key,cust_id varchar(10) not null,Title varchar(20) not null,Star varchar (20) not null,Price int(3));

insert into movie values(1,'a02','bloody','jc',181),(2,'a04','the firm','tc',200)
,(3,'a01','pretty woman','rg',151),(4,'a06','home alone','mc',150),
(5,'a05','the fugitive','mf',200),(6,'a03','coma','md',100),
(7,'a02','dracula','go',150),(8,'a06','quick change','bm',100),
(9,'a03','gone with the cb','jc',200),(10,'a05','carry on doctor','lp',100);
Alter table movie add foreign key (cust_id) references customer(cust_id);
#2 Prove that entity integrity constraint is ensured by both the tables. (2 conditions to be checked).
update customer set cust_id=null; ## this line does not exicute showing msg Error Code: 1048. Column 'Cust_id' cannot be null this means integrity constraint is ensured.
update movie set Title=null; ## this line does not exicute sowing msg Error Code: 1048. Column 'Title' cannot be null this means integrity constraint is ensured.
#5. Display the movie titles, whose price is greater than 100 but less than 200.
select Title from movie where price >100 And price <200 ;
#6. Display the cust_id who have seen movies having stars as either JC or TC or MC.
select cust_id from movie where Star='JC' or  Star='TC'or Star='MC';
#7. Display the details of those customers who have an A in their area name.
select* from customer where Area like '%A%';
#.8 Display the movie titles, whose price is within 180 and the movie titles are of exactly 6 characters.
select Title from movie where price<180 and   length(title)=6;
#9. Display the movie name, their original prices and the prices after 10% increment.Give alias name to the incremented price column.
select title,price,price*1.1 As "incremented price" from movie;
#11.Add a not null constraint to the Lname field in Customer.
alter table customer modify lname varchar(15) not null;
#12.Display the customer’s name whose phone number is not recorded.
select Fname from customer where phone is null;
#13.Add the phone number according to your own wish for the person mentioned in problem no 12.
update customer set phone =78442125 where phone is null;
#14.Display the unique customer ids from movie table.
select distinct cust_id from movie;
#15 15.Remove the not null constraint from Star column in movie table
alter table movie modify Star varchar(20) not null;
#16.Delete any row from the Customer table. If you cannot delete, then note the error message displayed.
delete from customer where cust_id='A01';  #Error Code: 1451. Cannot delete or update a parent row: a foreign key constraint fails (`abhidb`.`movie`, CONSTRAINT `movie_ibfk_1` FOREIGN KEY (`cust_id`) REFERENCES `customer` (`Cust_id`))
#17.Delete any row from the Movie table. If you cannot delete, then note the error message displayed
delete from movie where Mv_no=1;
#18.Drop the Customer table. If you cannot drop, then note the error messagedisplayed.
drop table customer;#Error Code: 3730. Cannot drop table 'customer' referenced by a foreign key constraint 'movie_ibfk_1' on table 'movie'.
#19.Drop the Movie table. If you cannot drop, then note the error message displayed.
drop table movie;


