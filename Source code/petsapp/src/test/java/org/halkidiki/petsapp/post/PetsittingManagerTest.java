package org.halkidiki.petsapp.post;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.halkidiki.petsapp.accounts.Account;
import org.halkidiki.petsapp.conversation.Message;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PetsittingManagerTest {


	PostManager postManagerTest;
	PetsittingManager petsittingManagerMocked;
	Petsitting petsittingMocked;
	Message messageMocked;

	@Before
	public void setUp() throws Exception {

		postManagerTest = PostManager.getActivePostManager();
		petsittingManagerMocked = Mockito.mock(PetsittingManager.class);
		petsittingMocked = Mockito.mock(Petsitting.class);
		messageMocked = Mockito.mock(Message.class);

	}

	@Test
	public void addPetsittingRequesTest() {
		
	}

	@Test
	public void AcceptPetsittingHelpTest() {
		
	}

	@Test
	public final void GetPostsOfPetsittingTest() {
		
	}

	@Test
	public void getPostsTest() {
	}

	@Test
	public void getInactivePostsTest() {
	}

}
