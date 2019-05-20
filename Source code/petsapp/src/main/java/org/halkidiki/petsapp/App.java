package org.halkidiki.petsapp;

import java.util.List;

public class App 
{
    public static void main( String[] args ){
       
    }
    
    public void temporaryAdopt(int adopterID) {
    	
    }
    
    public void searchForAdoption(int petType) {
    	
    }
    
    public void selectPet(int petID) {
    	
    }
    
	@SuppressWarnings("unused")
	private void showFoundPets(List<Pet> l) {
		for(Pet b : l)
			System.out.printf("%s ", b);
		System.out.println();
    }
}
