package org.halkidiki.petsapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NotificationManagerTest {

	public NotificationManager nm;
	@Test
	final void test() {
		int x = 5;
		nm = new NotificationManager();
		
		nm.addInteger(x);
		
		if(nm.test[0] != x) {
			fail("ERROR");
		}
	}

}
