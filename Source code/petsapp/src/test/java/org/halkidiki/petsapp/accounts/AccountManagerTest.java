package org.halkidiki.petsapp.accounts;

/**
 * 
 * @Author: Adrian
 * 
 */

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
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
		assertNotEquals(null,AccountManager.getActiveAccountManager().getShelters());
		assertNotEquals(null,AccountManager.getActiveAccountManager().getUsers());
		assertNotEquals(null,AccountManager.getActiveAccountManager().getAdministrators());

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
		assertEquals(false,accountManagerToTest.getShelters().contains(Mockito.mock(Shelter.class)));
		assertEquals(shelterMocked,accountManagerToTest.getShelters().get(0));

		accountManagerToTest.addAccount(administratorMocked);
		accountManagerToTest.addAccount(userMocked);
		assertEquals(false,accountManagerToTest.getUsers().isEmpty());
		assertEquals(false,accountManagerToTest.getAdministrators().isEmpty());
		assertEquals(false,accountManagerToTest.getShelters().isEmpty());
		assertEquals(true,accountManagerToTest.getShelters().contains(shelterMocked));
		assertEquals(true,accountManagerToTest.getUsers().contains(userMocked));
		assertEquals(true,accountManagerToTest.getAdministrators().contains(administratorMocked));


	}

	@Test
	public final void testDeleteAccount() {
		accountManagerToTest.addAccount(shelterMocked);
		accountManagerToTest.addAccount(administratorMocked);
		accountManagerToTest.addAccount(userMocked);
		User userMockedDoNotDelete = Mockito.mock(User.class);
		accountManagerToTest.addAccount(userMockedDoNotDelete);


		assertEquals(true,accountManagerToTest.getShelters().contains(shelterMocked));
		assertEquals(true,accountManagerToTest.getUsers().contains(userMocked));
		assertEquals(true,accountManagerToTest.getAdministrators().contains(administratorMocked));

		accountManagerToTest.deleteAccount(shelterMocked);
		accountManagerToTest.deleteAccount(administratorMocked);
		accountManagerToTest.deleteAccount(userMocked);


		assertEquals(false,accountManagerToTest.getShelters().contains(shelterMocked));
		assertEquals(false,accountManagerToTest.getUsers().contains(userMocked));
		assertEquals(true,accountManagerToTest.getUsers().contains(userMockedDoNotDelete));
		assertEquals(false,accountManagerToTest.getAdministrators().contains(administratorMocked));
	}
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	@Test
	public final void testLogin() throws Exception {
		accountManagerToTest.addAccount(userMocked);
		String userNickname = "peter1990";
		String password = "1234";
		Mockito.when(userMocked.getNickName()).thenReturn(userNickname);
		Mockito.when(userMocked.checkPassword(password)).thenReturn(true);

		assertEquals(userMocked,accountManagerToTest.login(userNickname, password));
		accountManagerToTest.deleteAccount(userMocked);
		
		if (true){
			thrown.expect(Exception.class);
			thrown.expectMessage("User not found!");
			accountManagerToTest.login(userNickname, password);
		}
		
		accountManagerToTest.addAccount(administratorMocked);
		String adminNickname = "admin1990";
		Mockito.when(administratorMocked.getNickName()).thenReturn(adminNickname);
		Mockito.when(administratorMocked.checkPassword(password)).thenReturn(true);
		assertEquals(administratorMocked,accountManagerToTest.login(adminNickname, password));
		accountManagerToTest.deleteAccount(administratorMocked);

		if (true){
			thrown.expect(Exception.class);
			thrown.expectMessage("User not found!");
			accountManagerToTest.login(adminNickname, password);
		}
		
		String shelterNickname = "shelter1990";
		Mockito.when(shelterMocked.getNickName()).thenReturn(shelterNickname);
		Mockito.when(shelterMocked.checkPassword(password)).thenReturn(false);
		
		if (true){
			thrown.expect(Exception.class);
			thrown.expectMessage("Incorrect Password");
			accountManagerToTest.login(shelterNickname, password);
		}
		accountManagerToTest.deleteAccount(shelterMocked);
	}

}
