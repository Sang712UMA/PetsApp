package org.halkidiki.petsapp.notifications;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.halkidiki.petsapp.Pet;
import org.halkidiki.petsapp.post.Adoption;
import org.halkidiki.petsapp.post.FoundPets;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class NotificationManagerTest {

	NotificationManager notificationManagerToTest;
	PetNotification petNotificationMocked;
	MessageNotification messageNotificationMocked;
	TaskNotification taskNotificationMocked;
	FoundPets foundPetMocked;
	Adoption adoptionMocked;
	Pet petMocked;
	Pet petMockedNotToNotify;
	
	@Before
	public void setUp() throws Exception {
		notificationManagerToTest = NotificationManager.getActiveNotificationManager();
		petNotificationMocked = Mockito.mock(PetNotification.class);
		messageNotificationMocked = Mockito.mock(MessageNotification.class);
		taskNotificationMocked = Mockito.mock(TaskNotification.class);
		foundPetMocked = Mockito.mock(FoundPets.class);
		adoptionMocked = Mockito.mock(Adoption.class);
		petMocked = Mockito.mock(Pet.class);
		petMockedNotToNotify = Mockito.mock(Pet.class);
	}

	@After
	public void tearDown() throws Exception {
		notificationManagerToTest = null;
		petNotificationMocked = null;
		messageNotificationMocked = null;
		taskNotificationMocked = null;
		foundPetMocked = null;
		adoptionMocked = null;
		petMocked = null;
		petMockedNotToNotify = null;
	}

	@Test
	public final void testGetActiveNotificationManager() {
		assertEquals(notificationManagerToTest,NotificationManager.getActiveNotificationManager());
		assertNotEquals(null,notificationManagerToTest.getNotifications());
		
		notificationManagerToTest = null;
		assertNotEquals(notificationManagerToTest,NotificationManager.getActiveNotificationManager());
	}

	@Test
	public final void testAddNotification() {
		notificationManagerToTest.addNotification(petNotificationMocked);
		notificationManagerToTest.addNotification(taskNotificationMocked);
		assertEquals(true,notificationManagerToTest.getNotifications().contains(petNotificationMocked));
		assertEquals(true,notificationManagerToTest.getNotifications().contains(taskNotificationMocked));
	}

	
	@Test
	public final void testGetNotificationsAPost() {
		//Create a post with a pet that would prompt an alert
		Mockito.when(foundPetMocked.getPet()).thenReturn(petMocked);
		Mockito.when(petNotificationMocked.doPostMustBeNotified(petMocked)).thenReturn(true);
		notificationManagerToTest.addNotification(petNotificationMocked);
		
		List<Notification> expected = new ArrayList<Notification>();
		expected.add(petNotificationMocked);
		List<Notification> actual = notificationManagerToTest.getNotificationsForAPost(foundPetMocked);
		assertEquals(expected, actual);
		
		//Create a post with a pet that would NOT prompt an alert
		Mockito.when(adoptionMocked.getPet()).thenReturn(petMockedNotToNotify);
		Mockito.when(petNotificationMocked.doPostMustBeNotified(petMockedNotToNotify)).thenReturn(false);
		
		expected = new ArrayList<Notification>();
		actual = notificationManagerToTest.getNotificationsForAPost(adoptionMocked);
		assertEquals(expected,actual);	
	}

	@Test
	public final void testDeleteNotification() {
		notificationManagerToTest.addNotification(petNotificationMocked);
		assertEquals(true,notificationManagerToTest.getNotifications().contains(petNotificationMocked));
		
		notificationManagerToTest.deleteNotification(petNotificationMocked);
		assertEquals(false,notificationManagerToTest.getNotifications().contains(petNotificationMocked));
		
	}

}
