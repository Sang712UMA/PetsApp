package bll;

import java.util.List;

import interfaces.IAdvertisment;
import interfaces.IAnimal;
import interfaces.IUser;

public class User<TAnimal, TAdvertisment> implements IUser{

	String login;
	List<IAnimal> animals;
	List<IAdvertisment> advertisments;
	Boolean Volonteer = false; 
	
	
	
	@Override
	public void setLogin(String login) {
		this.login = login;
		
	}

	@Override
	public void setPassword(String password) {
		// TODO Auto-generated method stub
		
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

}
