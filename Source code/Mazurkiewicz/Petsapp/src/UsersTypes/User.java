package UsersTypes;

import java.util.List;

import bll.Advertisment;
import bll.Animal;
import interfaces.IAdvertisment;
import interfaces.IAnimal;
import interfaces.IUser;

public class User<TAnimal, TAdvertisment > implements IUser<TAnimal, TAdvertisment>{

	String login;
	String password;
	String name;
	List<IAnimal> animals;
	List<IAdvertisment> advertisments;
	Boolean Volonteer = false; 
	
	
	
	public User() {
		
	}
public User(String login, String password, String name, boolean volonteer) {
		
		this.login = login;
		this.setPassword(password);
		
	}
	
	
	@Override
	public void setLogin(String login) {
		this.login = login;
		
	}

	@Override
	public void setPassword(String password) {
		this.password = password;
		
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addAnimal(IAnimal a) {
		animals.add(a);
		
	}

	@Override
	public void addAdvertisment(IAdvertisment a) {
		
		advertisments.add(a);
	}

	@Override
	public void setIsVolonteer() {
		Volonteer = true;
		
	}
	@Override
	public String getLogin() {
		// TODO Auto-generated method stub
		return login;
	}
	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public Animal getAnimal(IAnimal a) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Advertisment getAdvertisment(IAdvertisment a) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean getIsVolonteer() {
		// TODO Auto-generated method stub
		return false;
	}


}
