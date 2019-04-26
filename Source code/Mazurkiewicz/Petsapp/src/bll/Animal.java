package bll;

import java.sql.Date;

import interfaces.IAnimal;

public class Animal implements IAnimal {

	String name;
	String race;
	int age;
	Date beginDate;
	Date finalDate;
	
	
	public static void Animal(String name) {
		
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}

	@Override
	public void setRace(String race) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDate(Date beginDate, Date finalDate) {
		// TODO Auto-generated method stub
		
	}
}
