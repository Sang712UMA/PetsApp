package org.halkidiki.petsapp.post;

/**
 * 
 * @author Adrian
 * 
 * This is a manual test for a "function" that I was unable to implement 
 * in Unit Test due to Singleton nature. This is a very specific test
 * We are testing if we can send Notifications through console.
 * THIS IS NOT A UNIT TEST, there is not Mock not Assert
 * 
 */

import java.util.Date;

import org.halkidiki.petsapp.Pet;
import org.halkidiki.petsapp.accounts.User;
import org.halkidiki.petsapp.notifications.NotificationManager;
import org.halkidiki.petsapp.notifications.PetNotification;


public class PostManagerManualTest {

	public static void main(String[] args) {
		
		int petType = 0;
		String sex = "Male";
		boolean neutralization = true;
		String chip = "MLG32040";
		int age = 24;
		String name = "Unknown";
		String details = "Japanese Akita dog. Golden light brown.";
		
		PostManager postManager = PostManager.getActivePostManager();
		NotificationManager notiManager = NotificationManager.getActiveNotificationManager();
		
		FoundPets foundPet = new FoundPets(new Date(),"Malaga, Plaza Mayor");
		foundPet.setPet(new Pet(petType,sex,neutralization,chip,age,name,details));

		User hachikoOwner = new User();
		hachikoOwner.setNickName("hachikoOwner");
		
		PetNotification hachikoHasBeenLost = new PetNotification(hachikoOwner, petType, 0, 2, 12, 60);
		notiManager.addNotification(hachikoHasBeenLost);
		
		postManager.addPost(foundPet); //Someone has find a pet that probably is hachiko, It should notify user
	}

}
