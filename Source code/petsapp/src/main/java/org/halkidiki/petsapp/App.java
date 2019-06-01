package org.halkidiki.petsapp;

import java.awt.Image;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.halkidiki.petsapp.accounts.User;

public class App 
{
	static List<Pet> foundlist = new LinkedList<Pet>();
	static List<Pet> lostlist = new LinkedList<Pet>();
	static List<Pet> temporaryAdoptedList = new LinkedList<Pet>();
	static List<User> userList = new LinkedList<User>();
	static List<User> adopterList = new LinkedList<User>();
	
    public static void main( String[] args ){
       
    }
    
    private List<User> getUser(int userID) { //Konstantina 
    	List<User> Results = null;
    	for(User b : userList) {
    		if(b.getId() == userID) {
    			Results.add(b);  
    		}
    	}
    	if(!Results.isEmpty()) {
    		return Results;
    	}
    	else {
            throw new RuntimeException();
        }
	}
    
   public void temporaryAdopt(int adopterID, Pet pet1) { //Konstantina 
    	User adopter;
    	
    	adopter = (User) getUser(adopterID);
    	pet1.adopt(adopter);
    }
  
   public List<Pet> searchForAdoption(int petType) {
    	List<Pet> Results = null;
    	for(Pet b : foundlist) {
    		if(b.getPetType() == petType) {
    			Results.add(b);    			
    		}
    	}
    	if(!Results.isEmpty()) {
    		return Results;
    	}
    	else {
            throw new RuntimeException();
        }
    } 

   
    
    public void selectPet(int petID, List<Pet> l) { //Konstantina 
    	List<Pet> Results = null;
    	for(Pet b : l) {
    		if(b.getPetID() == petID) {
    			Results.add(b); 
    		}
    	}
    	if(!Results.isEmpty()) {
    		System.out.println(Results);
    	}
    	else {
            throw new RuntimeException();
        }
    	
    }
    
    public List<Pet> getFoundPetData(Pet Pet1, List<Pet> l) { //Konstantina 
    	List<Pet> Results = null;
    	for(Pet b : l) {
    		if(b == Pet1) {
    			Results.add(b);
    		}
    	}
    	if(!Results.isEmpty()) {
    		return Results;
    	}
    	else {
            throw new RuntimeException();
        }
	};
    
	private void showFoundPets(List<Pet> l) { //Konstantina 
		for(Pet b : l)
			System.out.printf("%s ", b);
		System.out.println();
    }
	
	public void reportFoundPet() { //Konstantina 
		
		Pet FoundPet1;
		System.out.println("PetType: ");
		int petType = UserInput.getInteger();

		System.out.println("Sex: ");
		String sex = UserInput.getString();
	
		System.out.println("Neutralization: ");
		boolean neutralization = UserInput.getBoolean();
		
		System.out.println("Chip: ");
		String chip = UserInput.getString();
		
		System.out.println("Age: ");
		int age = UserInput.getInteger();
		
		System.out.println("Name: ");
		String name = UserInput.getString();
		
		System.out.println("Details: ");
		String details = UserInput.getString();
		
		FoundPet1 = new Pet(petType, sex, neutralization, chip, age, name, details);

		foundlist.add(FoundPet1);
		
	}
	public void reportLostPet() { //Konstantina 
		Pet LostPet1;
		System.out.println("PetType: ");
		int petType = UserInput.getInteger();

		System.out.println("Sex: ");
		String sex = UserInput.getString();
	
		System.out.println("Neutralization: ");
		boolean neutralization = UserInput.getBoolean();
		
		System.out.println("Chip: ");
		String chip = UserInput.getString();
		
		System.out.println("Age: ");
		int age = UserInput.getInteger();
		
		System.out.println("Name: ");
		String name = UserInput.getString();
		
		System.out.println("Details: ");
		String details = UserInput.getString();
		
		LostPet1 = new Pet(petType, sex, neutralization, chip, age, name, details);

		lostlist.add(LostPet1);
	}
	
	public void recordAdopter(Date creationDate,Image profilePicture, int adopterID) { //Konstantina 
		User Adopter;
		System.out.println("Phone Number: ");
		int phone = UserInput.getInteger();
		
		System.out.println("Street: ");
		String street = UserInput.getString();
		
		System.out.println("City: ");
		String city = UserInput.getString();
		
		System.out.println("Email: ");
		String email = UserInput.getString();
		
		System.out.println("Password: ");
		String password = UserInput.getString();
		
		System.out.println("Nickname: ");
		String nickname = UserInput.getString();
		
		Adopter = new User(creationDate,profilePicture, adopterID, phone, street, city, email, password, nickname);

		adopterList.add(Adopter);
	}
	
	
}

