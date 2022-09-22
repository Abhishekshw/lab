package lab22sept;
/*Q3.Movie Theatre Management System, where you can create two classes one is main another one is movie, 
movie class can have two methods setMovie, getMovie where you can create movieName, movieStartTime, movieEndTime, MovieTicketPrice as instance variables.
*/
import java.util.*;
class Movie{
	private String Movie_name;
	private String  Movie_Start;
	private String Movie_end;
	private int Movie_price;
	public void setmovie() {
		System.out.println( Movie_name); 
		System.out.println(Movie_Start);
		System.out.println(Movie_end);
		System.out.println(Movie_price);
}
	public void getmovie(String Movie_name,String  Movie_Start,String Movie_end,int Movie_price) {
		this.Movie_name=Movie_name;
		this.Movie_Start=Movie_Start;
		this.Movie_end=Movie_end;
		this.Movie_price=Movie_price;
		System.out.println("your movie name is "+Movie_name);
		System.out.println("your movie Start from "+Movie_Start);
		System.out.println("your movie end at "+Movie_end);
		System.out.println("your movie ticket price "+Movie_price);
		}
	}
public class Main {
public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	System.out.println("movie name ");
	String Name=Sc.nextLine();
	System.out.println("movie Start time ");
	String Stime=Sc.nextLine();
	System.out.println("movie end name");
	String end=Sc.nextLine();
	System.out.println("movie price ");
	int price=Sc.nextInt();
	Movie M=new Movie();
	M.getmovie( Name,Stime,end,price);
	
}
}
