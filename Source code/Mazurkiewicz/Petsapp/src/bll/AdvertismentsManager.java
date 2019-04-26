package bll;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.Dictionary;
import java.util.List;

public class AdvertismentsManager<TAdvertisment> extends Advertisment {

	public AdvertismentsManager(String title, Dictionary<Integer, String> type, String description, Object picture, Date startDate,
			Date endDate, boolean show, Animal animal) {
		super(title, type, description, picture, startDate, endDate, show, animal);
		
	}

	public AdvertismentsManager() {
		// TODO Auto-generated constructor stub
	}

	Advertisment a = new Advertisment();

	List<Advertisment> advertisments = new ArrayList<Advertisment>();

	public static <T> void showListOfAdvertisment(T advertisment) {

		System.out.println(advertisment);
	};

	
	public List<Advertisment> newList(String listName){
		
		List<Advertisment> name = new ArrayList<Advertisment>();
		return name;
	}
	public List<Advertisment> setNewAdvertisment(String title, int type, String description, Object picture,
			Date startDate, Date endDate, boolean show, Animal animal) {

		advertisments.add(a);

		return advertisments;
	}

	public List<Advertisment> getAdvertisment() {

	return null;
	}
	
	
	
	
	public List<Advertisment> getSpecyficAdvertisment(Advertisment a){
		
		if (a.equals(this.a)) {

			newList(a.type.get(a)).add(a);

		}
		;

		return advertisments;
	}

}
