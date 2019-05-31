package org.halkidiki.petsapp.accounts;

/**
 * 
 * @Author: Adrian
 * 
 */

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class AccountManagerTest {

	AccountManager accountManagerToTest;
	Shelter shelterMocked;
	Administrator administratorMocked;
	User userMocked;

	@Before
	public void setUp() throws Exception {
		accountManagerToTest = AccountManager.getActiveAccountManager();
		shelterMocked = Mockito.mock(Shelter.class);
		administratorMocked = Mockito.mock(Administrator.class);
		userMocked = Mockito.mock(User.class);
	}

	@After
	public void tearDown() throws Exception {
		accountManagerToTest = null;
		shelterMocked = null;
		administratorMocked = null;
		userMocked = null;
	}

	@Test
	public final void testGetActiveAccountManager() {
		assertEquals(accountManagerToTest,AccountManager.getActiveAccountManager());

		accountManagerToTest = null;
		assertNotEquals(accountManagerToTest,AccountManager.getActiveAccountManager());
	}

	@Test
	public final void testAddAccount() {
		accountManagerToTest.addAccount(shelterMocked);
		assertEquals(true,accountManagerToTest.getUsers().isEmpty());
		assertEquals(true,accountManagerToTest.getAdministrators().isEmpty());
		assertEquals(false,accountManagerToTest.getShelters().isEmpty());
		assertEquals(true,accountManagerToTest.getShelters().contains(shelterMocked));
		assertNotEquals(true,accountManagerToTest.getShelters().contains(Mockito.mock(Shelter.class)));
		assertEquals(shelterMocked,accountManagerToTest.getShelters().get(0));

		accountManagerToTest.addAccount(administratorMocked);
		accountManagerToTest.addAccount(userMocked);
		assertEquals(false,accountManagerToTest.getUsers().isEmpty());
		assertEquals(false,accountManagerToTest.getAdministrators().isEmpty());
		assertEquals(false,accountManagerToTest.getShelters().isEmpty());

	}

	//	@Test
	//	public final void testDeleteAccount() {
	//		fail("Not yet implemented"); // TODO
	//	}

}
