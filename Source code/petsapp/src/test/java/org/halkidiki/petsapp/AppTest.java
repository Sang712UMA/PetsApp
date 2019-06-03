package org.halkidiki.petsapp;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.halkidiki.petsapp.accounts.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

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
//		fail("Not yet implemented");
	}
	
	@Test public void ifNoUserExistsWhenSearchingForUserAnExceptionIsThrown() { //Konstantina
		User myUser = Mockito.mock(User.class); // Fixed error Adri
		Mockito.when(myUser.getId()).thenReturn(123456); // Fixed error Adri
		App.userList.add(myUser);
		List<User> Results;
		Results = myApp.getUser(123456);
    	
	} 
	
	@Test
	public void ifUserExistWhenSearchingForUserTheyAreReturnedInTheList() {
		User myUser = Mockito.mock(User.class); // Fixed error Adri
		Mockito.when(myUser.getId()).thenReturn(123456); // Fixed error Adri
		App.userList.add(myUser);
		List<User> Results;
		Results = myApp.getUser(128965);
		for(User b : Results)
			System.out.printf("%s ", b);
		System.out.println();
	}
	

	@Test
	public void testTemporaryAdopt() {
		User myUser = Mockito.mock(User.class); // Fixed error Adri
		Mockito.when(myUser.getId()).thenReturn(123456); // Fixed error Adri
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
	public void ifPetsExistWhenSearchingForAdoptionTheyAreReturnedInTheList() { //Konstantina
		Pet myPet = new Pet(1, 518951, "M", false, "DF485445", 5, "Bob", null);
		App.foundlist.add(myPet);
		List<Pet> Results;
		Results = myApp.searchForAdoption(1);
		myApp.showFoundPets(Results);
	}

	@Test public void ifNoPetExistsWhenSearchingForPetToSelect() { //Konstantina
		Pet myPet = new Pet(1, 519695,"M", false, "DF485445", 5, "Bob", null);
		List<Pet> Results = new ArrayList<Pet>(); // Error fixed Adri
		Results.add(myPet);
		myApp.selectPet(519695,Results);
    	
	} 

	@Test
	public void ifPetsExistWhenSearchingForPetToSelect() {  //Konstantina
		Pet myPet = new Pet(1, 519695,"M", false, "DF485445", 5, "Bob", null);
		List<Pet> Results = new ArrayList<Pet>(); // Error fixed Adri
		Results.add(myPet);
		myApp.selectPet(519695,Results); // Error fixed Adri
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
		List<Pet> Results = new ArrayList<Pet>(); // Error fixed Adri
		Results.add(myPet);
		myApp.getFoundPetData(myPet,Results);
	}

	
	@Test
	public void testReportFoundPet() { //Konstantina
		myApp.reportFoundPet();
	    myApp.showFoundPets(App.foundlist);
	}

	@Test
	public void testReportLostPet() { //Konstantina
		myApp.reportLostPet();
		 myApp.showFoundPets(App.lostlist);
	}

	@Test
	public void testRecordAdopter() {
		Image image = Mockito.mock(Image.class); // Error fix Adri
		myApp.recordAdopter(new Date(), image, 896584);
		for(User b : App.adopterList)
			System.out.printf("%s ", b);
		System.out.println();
	}

}
