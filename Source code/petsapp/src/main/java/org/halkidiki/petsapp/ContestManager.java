package org.halkidiki.petsapp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Sanggil Han
 */

public class ContestManager {

	private List<Contest> allContests;
	private static ContestManager activeContestManager=null;
	
	private ContestManager() {
		allContests = new ArrayList<Contest>();
	}
	
	public static ContestManager getActiveContestManager() {
		if(activeContestManager == null) {
			activeContestManager = new ContestManager();
		}
		
		return activeContestManager;
	}
	
	public void addContest(Contest contest) {
		allContests.add(contest);
	}
	
	public void deleteContest(Contest contest) {
		allContests.remove(contest);
	}
	
	public void update() {
		for(Contest contest : allContests) {
			if (contest.getContestEndDate().after(new Date())) {
				contest.contestEnd();
			}
		}
	}
	
	/*GETTERS */
	
	public List<Contest> getAllContests() {
		return allContests;
	}
	
}
