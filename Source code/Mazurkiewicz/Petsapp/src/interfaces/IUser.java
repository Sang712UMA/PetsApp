package interfaces;

import java.util.List;

import UsersTypes.User;
import bll.Advertisment;
import bll.Animal;

public interface IUser{
	

	
	void setLogin(String login); 
	void setPassword(String password); 
	void setName(String name);
	void addAnimal(IAnimal a);
	void addAdvertisment(IAdvertisment a);
	void setIsVolonteer();
	
	String getLogin(); 
	String getPassword(); 
	String getName();
	Animal getAnimal(IAnimal a);
	Advertisment getAdvertisment(IAdvertisment a);
	boolean getIsVolonteer();
	

	
	
}
