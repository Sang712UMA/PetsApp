package org.halkidiki.petsapp.post;

import static org.junit.jupiter.api.Assertions.*;

import org.halkidiki.petsapp.accounts.AccountManager;
import org.halkidiki.petsapp.accounts.User;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PetsittingTest {

	PostManager postManagerToTest;
	Petsitting petsittingMocked;
	User userMocked;
	AccountManager accountManagerToTest;
	
	@Before
	public void setUp() throws Exception {
		postManagerToTest = PostManager.getActivePostManager();
		petsittingMocked = Mockito.mock(Petsitting.class);
		userMocked = Mockito.mock(User.class);
	}
	
	@Test
	public void createUserTest() {
		accountManagerToTest.addAccount(userMocked);
		assertEquals(false, accountManagerToTest.getUsers().isEmpty());
	}
	
	

	@Test
	public void createPetTest() {}
	
	@Test
	public void createPetsittingPostTest() {}
	
	@Test
	public void showPetsittingPostsTest() {}
	
	@Test
	public void acceptPetsittingPostTest() {}
	
	@Test
	public void giveRewardTest() {}
	
	
	
	
	}


