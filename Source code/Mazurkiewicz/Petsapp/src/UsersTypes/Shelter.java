package UsersTypes;

import bll.Advertisment;
import bll.Animal;
import interfaces.IUser;

public class Shelter extends User<Animal, Advertisment>{

	
	boolean shelter;
	
	public Shelter(boolean shelter) {
	
	super();
	this.shelter = true;
	
	
	}

	
	
}
