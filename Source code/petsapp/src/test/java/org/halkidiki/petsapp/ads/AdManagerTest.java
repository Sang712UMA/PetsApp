package org.halkidiki.petsapp.ads;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.halkidiki.petsapp.accounts.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/**
 *
 * @author George
 */
public class AdManagerTest {

	AdManager adManagerToTest;
	User userMocked;
	Ad adMocked1;
	Ad adMocked2;
	Tag tagMocked1;
	Tag tagMocked2;
	Tag tagMocked3;
	
	@Before
	public void setUp() throws Exception {
		
		adManagerToTest = AdManager.getActiveAdManager();
		userMocked = Mockito.mock(User.class);
		adMocked1 = Mockito.mock(Ad.class);
		adMocked2 = Mockito.mock(Ad.class);
		tagMocked1 = Mockito.mock(Tag.class);
		tagMocked2 = Mockito.mock(Tag.class);
		tagMocked3 = Mockito.mock(Tag.class);
	}

	@After
	public void tearDown() throws Exception {

		adManagerToTest = null;
	}

	@Test
	public final void testGetActiveAdManager() {
		
		assertEquals(adManagerToTest,AdManager.getActiveAdManager());
		adManagerToTest = null;
		assertNotEquals(adManagerToTest,AdManager.getActiveAdManager());
	}

	@Test
	public final void testAddAd() {
		
		adManagerToTest.addAd(adMocked1);
		assertEquals(true,adManagerToTest.getAds().contains(adMocked1));
		adManagerToTest.deleteAd(adMocked1);
	}

	@Test
	public final void testDeleteAd() {
		
		adManagerToTest.addAd(adMocked1);
		assertEquals(true,adManagerToTest.getAds().contains(adMocked1));
		adManagerToTest.deleteAd(adMocked1);
		assertEquals(false,adManagerToTest.getAds().contains(adMocked1));
	}

	@Test
	public final void testGetAdsForAUser() {
		
		List<Ad> expectedAdList = new ArrayList<Ad>();
		expectedAdList.add(adMocked1);
		expectedAdList.add(adMocked2);

		adManagerToTest.addAd(adMocked1);
		adManagerToTest.addAd(adMocked2);
		List<Ad> actualAdList = adManagerToTest.getAdsForAUser(userMocked);
		
		assertEquals(expectedAdList, actualAdList);
		
		adManagerToTest.deleteAd(adMocked1);
		adManagerToTest.deleteAd(adMocked2);		
	}
}
