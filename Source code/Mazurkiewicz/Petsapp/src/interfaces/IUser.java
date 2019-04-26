package interfaces;

import java.util.List;

import bll.Animal;

public interface IUser{
	
	void setLogin(String login); 
	void setPassword(String password); 
	void setName(String name);
	void addAnimal(IAnimal a);
	void addAdvertisment(IAdvertisment a);
	void setIsVolonteer();
	
	
}
