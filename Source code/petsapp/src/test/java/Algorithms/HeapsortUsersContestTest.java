package Algorithms;

import java.util.ArrayList;
import java.util.List;

import org.halkidiki.petsapp.accounts.User;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * @author Sanggil Han
 */

public class HeapsortUsersContestTest {

	User user0;
	User user1;
	User user2;
	User user3;
	List<User> array;
	
	@Before
	public void setUp() throws Exception {
		user0 = Mockito.mock(User.class);
		user1 = Mockito.mock(User.class);
		user2 = Mockito.mock(User.class);
		user3 = Mockito.mock(User.class);
		array = new ArrayList<User>();
	}

	@Test
	public void testHeapSort() {
		int numWinners;
		
		Mockito.when(user0.getContestTimeDevoted()).thenReturn(3);
		Mockito.when(user1.getContestTimeDevoted()).thenReturn(4);
		Mockito.when(user2.getContestTimeDevoted()).thenReturn(3);
		Mockito.when(user3.getContestTimeDevoted()).thenReturn(1);
		
		array.add(user0);
		array.add(user1);
		array.add(user2);
		array.add(user3);
		
		System.out.println(array.get(0).toString() + " " + array.get(0).getContestTimeDevoted());
		System.out.println(array.get(1).toString() + " " + array.get(1).getContestTimeDevoted());
		System.out.println(array.get(2).toString() + " " + array.get(2).getContestTimeDevoted());
		System.out.println(array.get(3).toString() + " " + array.get(3).getContestTimeDevoted());
		
		HeapsortUsersContest.heapSort(array); // Testing
		
		System.out.println(array.get(0).toString() + " " + array.get(0).getContestTimeDevoted());
		System.out.println(array.get(1).toString() + " " + array.get(1).getContestTimeDevoted());
		System.out.println(array.get(2).toString() + " " + array.get(2).getContestTimeDevoted());
		System.out.println(array.get(3).toString() + " " + array.get(3).getContestTimeDevoted());
		System.out.println(" ");
		
		numWinners = 3;
		for(int i=array.size() - 1; i> array.size() - 1 - numWinners; i--) {
			System.out.println(array.get(i).toString() + " " + array.get(i).getContestTimeDevoted());
			
		}
	}

}
