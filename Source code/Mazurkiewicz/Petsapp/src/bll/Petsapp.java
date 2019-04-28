package bll;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Dictionary;

public class Petsapp {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Advertisment a = new Advertisment("I am LF BabySitter for Boby ", 2 , "Very quiet snake. ", null, Date.valueOf(LocalDate.now()), Date.valueOf(LocalDate.of(2019, 05, 13)), true);
		Advertisment a2 = new Advertisment("I am LF BabySitter for Boby ", 3 , "Very quiet dragon. ", null, Date.valueOf(LocalDate.now()), Date.valueOf(LocalDate.of(2019, 05, 13)), true);
		
		AdvertismentList al = new AdvertismentList();
		AdvertismentsManager<Advertisment> am = new AdvertismentsManager<Advertisment>();

	
	al.advertisments.add(a);
	al.advertisments.add(a2);
	
	
	System.out.println(al.toString());
		 
		
			
		
		

}}
