package interfaces;

import java.util.List;

import bll.Advertisment;
import bll.Animal;
import bll.User;

public interface IUser{
	
	User<?, ?> createNewUser();
	
	void setLogin(String login); 
	void setPassword(String password); 
	void setName(String name);
	void addAnimal(IAnimal a);
	void addAdvertisment(IAdvertisment a);
	void setIsVolonteer();

	User<Animal, Advertisment> createNewUser(String login, String password, String name, boolean volonteer);
	
	
}
