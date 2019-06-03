package org.halkidiki.petsapp.post;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class PetsittingTests {

	PostManager postManagerToTest;
	Petsitting petsittingMocked;
	Hospitality hospitalityMocked;
	Petsitting petsitting = new Petsitting();

	@Before
	public void setUp() throws Exception {
		postManagerToTest = PostManager.getActivePostManager();
		petsittingMocked = Mockito.mock(Petsitting.class);
		hospitalityMocked = Mockito.mock(Hospitality.class);

	}

	@Test
	public final void GetActivePostManager() {
		assertEquals(postManagerToTest, PostManager.getActivePostManager());

		postManagerToTest = null;
		assertNotEquals(postManagerToTest, PostManager.getActivePostManager());

	}

	@Test
	public void createPetsittingPostTest() {
		postManagerToTest.addPost(petsittingMocked);
		assertEquals(true, postManagerToTest.getPosts().contains(petsittingMocked));
		postManagerToTest.addPost(petsittingMocked);
		assertEquals(true, postManagerToTest.getPostsOfPetsittingPets().contains(petsittingMocked));

	}

	@Test
	public void deletePetsittingPostTest() {
		postManagerToTest.addPost(petsittingMocked);
		assertEquals(true, postManagerToTest.getPostsOfPetsittingPets().contains(petsittingMocked));
		postManagerToTest.deletePost(petsittingMocked);
		assertEquals(false, postManagerToTest.getPostsOfPetsittingPets().contains(petsittingMocked));
	}

	@Test
	public final void GetPostsOfPetsittingTest() {
		postManagerToTest.addPost(petsittingMocked);
		postManagerToTest.addPost(hospitalityMocked);

		List<Petsitting> expected = new ArrayList<Petsitting>();
		expected.add(petsittingMocked);
		List<Petsitting> actual = postManagerToTest.getPostsOfPetsittingPets();

		assertEquals(expected, actual);
	}

	@Test
	public void acceptPetsittingPostTest() {

		postManagerToTest.addPost(petsittingMocked);
		assertEquals(true, postManagerToTest.getPosts().contains(petsittingMocked));
		assertEquals(true, postManagerToTest.getPostsOfPetsittingPets().contains(petsittingMocked));
		postManagerToTest.postNotLongerRequired(petsittingMocked);
		assertEquals(false, postManagerToTest.getPosts().contains(petsittingMocked));
		assertEquals(true, postManagerToTest.getInactivePosts().contains(petsittingMocked));

	}
	
	@Test
	public void rewardPointsTest() {
		petsitting.setRewardPoints(100);
		assertEquals(100, petsitting.getRewardPoints());
	}

	@Test
	public void giveRewardTest() {
		postManagerToTest.addPost(petsittingMocked);
		

	}
	
	

}
