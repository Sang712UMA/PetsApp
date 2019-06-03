package org.halkidiki.petsapp.post;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.halkidiki.petsapp.accounts.Account;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PetsittingManagerTest {

	PetsittingManager petsittingManagerMocked;
	Petsitting petsittingMocked;

	@Before
	public void setUp() throws Exception {

		petsittingManagerMocked = Mockito.mock(PetsittingManager.class);
		petsittingMocked = Mockito.mock(Petsitting.class);

	}

	@Test
	public void AcceptPetsittingRequesTest() {
		

	}

	@Test
	public void AcceptPetsittingHelpTest() {
	}

	@Test
	public void getPostsOfPetsittingPetsTest() {
	}

	@Test
	public void getPostsTest() {
	}

	@Test
	public void getInactivePostsTest() {
	}

}
