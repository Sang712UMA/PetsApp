package org.halkidiki.petsapp.notifications;

/**
 * 
 * @Author: Adrian
 * 
 */

import static org.junit.Assert.*;

import org.halkidiki.petsapp.accounts.User;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class NotificationTest {

	User userMocked;
	Notification notificationToTest;

	@Before
	public void setUp() throws Exception {

		userMocked = Mockito.mock(User.class);		
		//Initialised abstract class:
		//Mock the class, with settings, useConstructor() and defaultAnswer(Mockito.CALLS_REAL_METHODS)
		notificationToTest = Mockito.mock(Notification.class, Mockito.withSettings()
				.useConstructor(userMocked)
				.defaultAnswer(Mockito.CALLS_REAL_METHODS));
	}

	@Test
	public final void testGetUser() {
		User notMyUser=Mockito.mock(User.class);

		assertEquals(userMocked,notificationToTest.getUser());
		assertNotEquals(notMyUser,notificationToTest.getUser());
	}
}
