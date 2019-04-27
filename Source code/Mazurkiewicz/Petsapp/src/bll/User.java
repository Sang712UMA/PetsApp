package bll;

import java.util.List;

import interfaces.IAdvertisment;
import interfaces.IAnimal;
import interfaces.IUser;

public class User<TAnimal, TAdvertisment> implements IUser{

	String login;
	String password;
	String name;
	List<IAnimal> animals;
	List<IAdvertisment> advertisments;
	Boolean Volonteer = false; 
	
	
	
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


	
	public User(String login, String password, String name, boolean volonteer) {
		
		this.login = login;
		this.setPassword(password);;
		
	}

	@Override
	public User<?, ?> createNewUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User<Animal, Advertisment> createNewUser(String login, String password, String name, boolean volonteer) {
		// TODO Auto-generated method stub
		return null;
	}}
