package org.halkidiki.petsapp.post;

import static org.junit.Assert.*;

import org.halkidiki.petsapp.accounts.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import org.mockito.Mockito.*;

public class PostTest {

	User userMocked;
	User userMocked2;
	User userMocked3;
	
	@Before
	public void setUp() throws Exception {
		userMocked = mock(User.class);
		userMocked2 = mock(User.class);
		userMocked3 = mock(User.class);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void test() {
		when(userMocked3.getEmail()).thenReturn("michal@gmail.com");
	}

	@Test
	public final void test2() {
		System.out.println("Test()");
//		fail("Not yet implemented"); // TODO
	}

}
