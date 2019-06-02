package org.halkidiki.petsapp;

import static org.junit.Assert.*;

import java.util.Date;

import org.halkidiki.petsapp.accounts.AccountManager;
import org.halkidiki.petsapp.accounts.User;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.never;

/**
 * @author Sanggil Han
 */

public class ContestTest {

	User user0;
	User user1;
	User user2;
	User user3;
	AccountManager AM;
	Date date;
	Reward reward;

	@Before
	public void setUp() throws Exception {
		AM = AccountManager.getActiveAccountManager();
		user0 = Mockito.mock(User.class);
		user1 = Mockito.mock(User.class);
		user2 = Mockito.mock(User.class);
		user3 = Mockito.mock(User.class);
		date = new Date();
		reward = Mockito.mock(Reward.class);
		AM.addAccount(user0);
		AM.addAccount(user1);
		AM.addAccount(user2);
		AM.addAccount(user3);
		Mockito.when(user0.getContestTimeDevoted()).thenReturn(3);
		Mockito.when(user1.getContestTimeDevoted()).thenReturn(4);
		Mockito.when(user2.getContestTimeDevoted()).thenReturn(7);
		Mockito.when(user3.getContestTimeDevoted()).thenReturn(1);
		Mockito.when(user0.toString()).thenReturn("user0");
		Mockito.when(user1.toString()).thenReturn("user1");
		Mockito.when(user2.toString()).thenReturn("user2");
		Mockito.when(user3.toString()).thenReturn("user3");
	}

	@Test
	public void testContestEnd() {
		Contest contest = new Contest("ContestForTest", "This is for contest.", true, date, date, reward, 3);
		
		//"contestEnd"
		assertEquals(true, contest.getContestStarted());
		contest.contestEnd();
		assertEquals(false, contest.getContestStarted());
		
		//Checking if users earn reward. "giveReward"
		Mockito.verify(user2).earnReward(reward);
		Mockito.verify(user1).earnReward(reward);
		Mockito.verify(user0).earnReward(reward);
		Mockito.verify(user3,never()).earnReward(reward);
	}
	

}