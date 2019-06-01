package org.halkidiki.petsapp.post;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class PostManagerTest {

	PostManager postManagerToTest;
	Hospitality hospitalityMocked;
	LostPets lostPetsMocked;
	LostPets lostPetsMocked2;

	@Before
	public void setUp() throws Exception {
		postManagerToTest = PostManager.getActivePostManager();
		hospitalityMocked = Mockito.mock(Hospitality.class);
		lostPetsMocked = Mockito.mock(LostPets.class);
		lostPetsMocked2 = Mockito.mock(LostPets.class);
	}

	@After
	public void tearDown() throws Exception {
		postManagerToTest = null;
		hospitalityMocked = null;
		lostPetsMocked = null;
		lostPetsMocked2 = null;
	}

	@Test
	public final void testGetActivePostManager() {
		assertEquals(postManagerToTest,PostManager.getActivePostManager());

		postManagerToTest = null;
		assertNotEquals(postManagerToTest,PostManager.getActivePostManager());

	}

	@Test
	public final void testAddPost() {
		postManagerToTest.addPost(hospitalityMocked);
		assertEquals(true,postManagerToTest.getPosts().contains(hospitalityMocked));
		postManagerToTest.addPost(lostPetsMocked);
		assertEquals(true,postManagerToTest.getPosts().contains(lostPetsMocked));
		postManagerToTest.deletePost(hospitalityMocked);
		postManagerToTest.deletePost(lostPetsMocked);
	}

	@Test
	public final void testDeletePost() {
		postManagerToTest.addPost(hospitalityMocked);
		assertEquals(true,postManagerToTest.getPosts().contains(hospitalityMocked));
		postManagerToTest.deletePost(hospitalityMocked);
		assertEquals(false,postManagerToTest.getPosts().contains(hospitalityMocked));
		postManagerToTest.addPost(lostPetsMocked);
		postManagerToTest.postNotLongerRequired(lostPetsMocked);
		postManagerToTest.deletePost(lostPetsMocked);
		assertEquals(false,postManagerToTest.getPosts().contains(lostPetsMocked));
		assertEquals(false,postManagerToTest.getInactivePosts().contains(lostPetsMocked));

	}

	@Test
	public final void testPostNotLongerRequired() {
		postManagerToTest.addPost(hospitalityMocked);
		assertEquals(true,postManagerToTest.getPosts().contains(hospitalityMocked));
		postManagerToTest.postNotLongerRequired(hospitalityMocked);
		assertEquals(false,postManagerToTest.getPosts().contains(hospitalityMocked));
		assertEquals(true,postManagerToTest.getInactivePosts().contains(hospitalityMocked));
		postManagerToTest.deletePost(hospitalityMocked);
	}

	@Test
	public final void testGetPostsOfLostPets() {
		postManagerToTest.addPost(lostPetsMocked);
		postManagerToTest.addPost(lostPetsMocked2);
		postManagerToTest.addPost(hospitalityMocked);

		List<LostPets> expected = new ArrayList<LostPets>();
		expected.add(lostPetsMocked);
		expected.add(lostPetsMocked2);
		List<LostPets> actual = postManagerToTest.getPostsOfLostPets();
		assertEquals(expected,actual);
		postManagerToTest.deletePost(lostPetsMocked);
		postManagerToTest.deletePost(lostPetsMocked2);
		postManagerToTest.deletePost(hospitalityMocked);
	}

}
