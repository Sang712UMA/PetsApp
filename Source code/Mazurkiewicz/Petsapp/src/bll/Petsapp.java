package bll;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Dictionary;

import UsersTypes.User;

public class Petsapp {

	public static void main(String[] args) {
		
		
		User<AnimalList, AdvertismentList> user = new User<AnimalList, AdvertismentList>();
		ListOf<Advertisment, AdvertismentList > lo = new ListOf<Advertisment, AdvertismentList>();
		ListOf<String, AdvertismentList > lo1 = new ListOf<String, AdvertismentList>();
		Animal animal = new Animal();
		String string = new String();
		Advertisment a = new Advertisment("I am LF BabySitter for Boby ", 2 , "Very quiet snake. ", null,null, Date.valueOf(LocalDate.of(2019, 06, 13)), true);
		Advertisment a0 = new Advertisment("I am LF BabySitter for Boby ", 2 , "Very quiet snake. ", null,null, Date.valueOf(LocalDate.of(2019, 07, 13)), true);
		Advertisment a1 = new Advertisment("I am LF BabySitter for Boby ", 2 , "Very quiet snake. ", null, Date.valueOf(LocalDate.of(2019, 06, 13)), Date.valueOf(LocalDate.of(2019, 05, 13)), true);
		Advertisment a2 = new Advertisment("I am LF BabySitter for Boby ", 3 , "Very quiet snake. ", null , null, Date.valueOf(LocalDate.of(2019, 05, 13)), true);
		Advertisment a3 = new Advertisment("I am LF BabySitter for Boby ", 1 , "Very quiet dragon. ", null, null, Date.valueOf(LocalDate.of(2019, 05, 13)), true);
		
		
	
		AdvertismentList al = new AdvertismentList();
		AdvertismentsManager<Advertisment> am = new AdvertismentsManager<Advertisment>();

	
	lo1.advertisments.add(a);
	lo1.advertisments.add(a0);
	lo1.advertisments.add(a2);
	lo1.advertisments.add(a3);
	al.advertisments.add(a);
	al.advertisments.add(a1);
	
	
	
	//System.out.println(al.toString());
	
	
	//System.out.println(lo.founded);
	
	//System.out.println(lo1.checkEqual(String.valueOf(a.endDate), String.valueOf(a0.endDate)));
	
	
	//System.out.println(al.advertisments);
	
	
    	boolean isThere;
    	 {
        	
        	
        		lo1.advertisments.forEach((n) -> System.out.println(n.type.getOrDefault(5, n.toString())));
        	
	
}}
}
