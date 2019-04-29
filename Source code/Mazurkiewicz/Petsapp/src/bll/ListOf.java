package bll;

import java.util.ArrayList;
import java.util.List;

public class ListOf<TAdvertisment, List extends ArrayList>  {
	
	
	private TAdvertisment object1, object2;
	public List objectList;
	boolean founded = false; 
	
	ArrayList<Advertisment> advertisments = new ArrayList<Advertisment>();
	
	
	public void addToList(TAdvertisment object1) {
		
		this.object1 = object1;
		objectList.add(this.object1);
	}
	
	public boolean checkEqual(TAdvertisment object1, TAdvertisment object2) {
		
		
		if(object1.equals(object2)) {
			
			this.founded = true;
		} 
	
		
		
		return founded;
	}
	public String toString(TAdvertisment object1) {
		
		return (String) object1;
	}
	
	
	
	}
	
	
	
	


