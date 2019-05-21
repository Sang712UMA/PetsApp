package org.halkidiki.petsapp;

import java.util.LinkedList;
import java.util.List;

public class App 
{
	static List<Pet> foundlist = new LinkedList<Pet>();
	static List<Pet> lostlist = new LinkedList<Pet>();
	static List<Pet> temporaryAdoptedList = new LinkedList<Pet>();
	static List<IUser> userList = new LinkedList<IUser>();
	
    public static void main( String[] args ){
       
    }
    
   /* private IUser getUser(List<IUser> users, int userID) {
    	IUser current = null;
    	
    	
    
    }
    
    public void temporaryAdopt(int adopterID, Pet pet1) {
    	IUser adopter;
    	
    	adopter = getUser(userList, adopterID);
    	pet1.adopt(adopter);
    }*/
    
    public void searchForAdoption(int petType) {
    	
    }
        
    public void selectPet(int petID) {
  
    }
    
    public void getFoundPetData(Pet Pet1) {
		
		/*Pet1.getPetType();
		Pet1.isSex();
		Pet1.isNeutralization();
		Pet1.getChip();
		Pet1.getAge();
		Pet1.getName();
		Pet1.getDetails();*/
	};
    
	@SuppressWarnings("unused")
	private void showFoundPets(List<Pet> l) {
		for(Pet b : l)
			System.out.printf("%s ", b);
		System.out.println();
    }
	
	public void reportFoundPet() {
		
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
	public void reportLostPet() {
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
	
	
}

