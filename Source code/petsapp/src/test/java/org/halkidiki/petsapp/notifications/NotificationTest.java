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

	User user;
	Notification notification;
	
	@Before
	public void setUp() throws Exception {
		
		user = Mockito.mock(User.class);		
		//Initialised abstract class:
		//Mock the class, with settings, useConstructor() and defaultAnswer(Mockito.CALLS_REAL_METHODS)
		notification = Mockito.mock(Notification.class, Mockito.withSettings()
		        .useConstructor(user)
		        .defaultAnswer(Mockito.CALLS_REAL_METHODS));
	}

	@Test
	public final void testGetUser() {
		User notMyUser=Mockito.mock(User.class);
	
		assertEquals(user,notification.getUser());
		assertNotEquals(notMyUser,notification.getUser());
	}
}
