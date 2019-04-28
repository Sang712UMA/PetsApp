package bll;

import java.util.ArrayList;
import java.util.List;

public class AdvertismentList extends ArrayList<Advertisment>  {


	List<Advertisment> advertisments = new ArrayList<Advertisment>();
	
	
	public AdvertismentList() {
		
		super();
	}
	
	public String createNewListString(String name) {
		
		return "List<Advertisment>" + name + "= new ArrayList<Advertisment>();";
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
		String List = "";
		
		for(int i = 0; i <= advertisments.size() - 1; i++) {
			
			a = advertisments.get(i);
			List += a.getTitle() + a.getDescription() + a.getStartDate()+ a.getEndDate() + "\n";
		}
		return List;
		
		
		
	}
	

}
