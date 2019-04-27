package bll;

import java.util.ArrayList;
import java.util.List;

public class AdvertismentList extends Advertisment  {

	List<Advertisment> advertisments = new ArrayList<Advertisment>();
	
	
	public AdvertismentList(Advertisment advertisment) {
		
		advertisments.add(advertisment); 
	}
	
	public Advertisment getFromList(int condition) {
		
		
		return advertisments.get(condition); 
	}
	
	public void deleteFromList(int condition) {
		//In future do it with Object o
		advertisments.remove(condition);
	}
	
	public int sizeOfList() {
		
		return advertisments.size();
	}
	
	public String toString() {
		
		Advertisment a = null; 
		
		for(int i = 0; i < advertisments.size(); i++) {
			
			a = advertisments.get(i);
		}
		return a.getTitle() + a.getDescription() + a.getStartDate()+ a.getEndDate();
		
		
		
	}
	

}
