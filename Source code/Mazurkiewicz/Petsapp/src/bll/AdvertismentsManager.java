package bll;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.Dictionary;
import java.util.List;

public class AdvertismentsManager<TAdvertisment> extends ArrayList<TAdvertisment>  {

	
	
	public AdvertismentsManager(Advertisment advertisment) {
		super();
		
	}

	public AdvertismentsManager() {
		// TODO Auto-generated constructor stub
	}

	Advertisment a = new Advertisment();
	

	List<Advertisment> advertisments = new ArrayList<Advertisment>();

	public static <T> void showListOfAdvertisment(T advertisment) {

		System.out.println(advertisment);
	};

	

	public List<Advertisment> newList(String name){
		
		List<Advertisment> list = new ArrayList<Advertisment>();
		return list;
	}
	public List<Advertisment> setNewAdvertisment(Advertisment a) {

		
		advertisments.add(a);

		return advertisments;
	}

	public List<Advertisment> getAdvertisment() {

	return null;
	}
	
	
	public String getNameList() {
		
		return a.type.get(a);
	}
	
	public List<Advertisment> getSpecyficAdvertisment(Advertisment a){
		
		if (a.equals(this.a)) {

			newList(getNameList()).add(a);

		}
		;

		return advertisments;
	}
	
public Advertisment getFromList(int condition) {
		
		
		return advertisments.get(condition); 
	}

}
