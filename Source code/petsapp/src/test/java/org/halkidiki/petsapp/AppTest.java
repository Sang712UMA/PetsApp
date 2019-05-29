package org.halkidiki.petsapp;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AppTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMain() {
		fail("Not yet implemented");
	}

	@Test
	public void testTemporaryAdopt() {
		fail("Not yet implemented");
	}

	
	/*@Rule
	public ExpectedException e = ExpectedException.none(); 
	@Test public void ifNoPetExistsWhenSearchingForAdoptionAnExceptionIsThrown() { //Konstantina
		List<Pet> l = mock(App.foundlist); //den anagnorizi to mock
		int i =0;
		int petType = 2;
    	for(Pet b : l) {
    		if(b.getPetType() == petType) {
    			i++;
    		}
    	}
    	if(i==0) {
    		e.expect(IndexOutOfBoundsException.class);
    		e.expectMessage("Index: 0, Size: 0");
    	}
    	
	} */
	@Test
	public void ifPetsExistWhenSearchingForAdoptionTheyAreReturnedInTheList() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectPet() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFoundPetData() {
		fail("Not yet implemented");
	}

	@Test
	public void testReportFoundPet() {
		fail("Not yet implemented");
	}

	@Test
	public void testReportLostPet() {
		fail("Not yet implemented");
	}

	@Test
	public void testRecordAdopter() {
		fail("Not yet implemented");
	}

}
