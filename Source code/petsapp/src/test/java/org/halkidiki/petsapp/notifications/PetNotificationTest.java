package org.halkidiki.petsapp.notifications;

/**
 * 
 * @Author: Adrian
 * 
 */

import static org.junit.Assert.*;

import org.halkidiki.petsapp.Pet;
import org.halkidiki.petsapp.accounts.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class PetNotificationTest {

	User userMocked;
	Pet petMocked;
	PetNotification notificationToTest;

	@Before
	public void setUp() throws Exception {
		userMocked = Mockito.mock(User.class);
		petMocked = Mockito.mock(Pet.class);
		notificationToTest = new PetNotification(userMocked, 0, 1, 2, 6, 72);
	}

	@After
	public void tearDown() throws Exception {
		userMocked = null;
		petMocked = null;
		notificationToTest = null;
	}

	@Test
	public final void testDoPostMustBeNotified() {
		Mockito.when(petMocked.getPetType()).thenReturn(0);
		Mockito.when(petMocked.getSize()).thenReturn(1);
		Mockito.when(petMocked.getAge()).thenReturn(10);

		Boolean expected = true;
		Boolean actual = notificationToTest.doPostMustBeNotified(petMocked);
		assertEquals(expected,actual);

		Mockito.when(petMocked.getAge()).thenReturn(0);
		expected = false;
		actual = notificationToTest.doPostMustBeNotified(petMocked);

		Mockito.when(petMocked.getSize()).thenReturn(0);
		expected = false;
		actual = notificationToTest.doPostMustBeNotified(petMocked);
		assertEquals(expected,actual);

		Mockito.when(petMocked.getPetType()).thenReturn(0);
		Mockito.when(petMocked.getSize()).thenReturn(2);
		Mockito.when(petMocked.getAge()).thenReturn(72);

		expected = true;
		actual = notificationToTest.doPostMustBeNotified(petMocked);
		assertEquals(expected,actual);

	}

}
