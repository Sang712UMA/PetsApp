package org.halkidiki.petsapp;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.halkidiki.petsapp.accounts.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AppTest {
	App myApp;
	private List<Pet> results; 

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		myApp = new App(); 

		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMain() {
		fail("Not yet implemented");
	}
	
	@Test public void ifNoUserExistsWhenSearchingForUserAnExceptionIsThrown() { //Konstantina
		User myUser = new User(null,null, 128965, 685496352, "calle Larios 2", "Malaga", "alice@gmail.com", "fre54", "Alice");
		App.userList.add(myUser);
		List<User> Results;
		Results = myApp.getUser(123456);
    	
	} 
	
	@Test
	public void ifUserExistWhenSearchingForUserTheyAreReturnedInTheList() {
		User myUser = new User(null,null, 128965, 685496352, "calle Larios 2", "Malaga", "alice@gmail.com", "fre54", "Alice");
		App.userList.add(myUser);
		List<User> Results;
		Results = myApp.getUser(128965);
		for(User b : Results)
			System.out.printf("%s ", b);
		System.out.println();
	}
	

	@Test
	public void testTemporaryAdopt() {
		User myUser = new User(null,null, 128965, 685496352, "calle Larios 2", "Malaga", "alice@gmail.com", "fre54", "Alice");
		App.adopterList.add(myUser);
		Pet myPet = new Pet(1, 654986,"M", false, "DF485445", 5, "Bob", null);
		myApp.temporaryAdopt(128965, myPet);
	}

	
	
	@Test public void ifNoPetExistsWhenSearchingForAdoptionAnExceptionIsThrown() { //Konstantina
		Pet myPet = new Pet(1, 654986,"M", false, "DF485445", 5, "Bob", null);
		App.foundlist.add(myPet);
		List<Pet> Results;
		Results = myApp.searchForAdoption(0);
    	
	} 

	@Test
	public void ifPetsExistWhenSearchingForAdoptionTheyAreReturnedInTheList() {
		Pet myPet = new Pet(1, 518951, "M", false, "DF485445", 5, "Bob", null);
		App.foundlist.add(myPet);
		List<Pet> Results;
		Results = myApp.searchForAdoption(1);
		myApp.showFoundPets(Results);
	}

	@Test public void ifNoPetExistsWhenSearchingForPetToSelect() { //Konstantina
		Pet myPet = new Pet(1, 519695,"M", false, "DF485445", 5, "Bob", null);
		List<Pet> Results = null;
		Results.add(myPet);
		myApp.selectPet(969956,Results);
    	
	} 

	@Test
	public void ifPetsExistWhenSearchingForPetToSelect() {  //Konstantina
		Pet myPet = new Pet(1, 519695,"M", false, "DF485445", 5, "Bob", null);
		List<Pet> Results = null;
		Results.add(myPet);
		myApp.selectPet(519695,results);
	}

	@Test public void ifNoPetExistsWhenSearchingForPetData() { //Konstantina
		Pet myPet = new Pet(1, 519695,"M", false, "DF485445", 5, "Bob", null);
		Pet myPet2 = new Pet(1, 519697,"F", false, "DF465445", 1, "Alice", null);
		List<Pet> Results = null;
		Results.add(myPet2);
		myApp.getFoundPetData(myPet,Results);
    	
	} 
	
	@Test
	public void ifPetsExistWhenSearchingForPetData() {
		Pet myPet = new Pet(1, 519695,"M", false, "DF485445", 5, "Bob", null);
		List<Pet> Results = null;
		Results.add(myPet);
		myApp.getFoundPetData(myPet,Results);
	}

	
	@Test
	public void testReportFoundPet() {
		myApp.reportFoundPet();
	    myApp.showFoundPets(App.foundlist);
	}

	@Test
	public void testReportLostPet() {
		myApp.reportLostPet();
		 myApp.showFoundPets(App.lostlist);
	}

	@Test
	public void testRecordAdopter() {
		myApp.recordAdopter(null, null, 896584);
		for(User b : App.adopterList)
			System.out.printf("%s ", b);
		System.out.println();
	}

}
