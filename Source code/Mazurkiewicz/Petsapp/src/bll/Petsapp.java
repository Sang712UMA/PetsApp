package bll;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Dictionary;

public class Petsapp {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Advertisment a = new Advertisment();
		AdvertismentList al = new AdvertismentList(a);
		@SuppressWarnings("deprecation")
		
		AdvertismentsManager<Advertisment> am = new AdvertismentsManager<Advertisment>( "I am LF BabySitter for Boby",a.getAdvertismentType(), "Very quaiet snake.", null, Date.valueOf(LocalDate.now()),Date.valueOf(LocalDate.of(2019, 05, 13)), true, a.getAnimal());

	
		 
		
			
		
		

}}
