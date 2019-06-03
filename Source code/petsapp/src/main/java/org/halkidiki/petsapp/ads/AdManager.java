package org.halkidiki.petsapp.ads;

import java.util.ArrayList;
import java.util.List;

import org.halkidiki.petsapp.accounts.User;

/**
 *
 * @author George
 */
public class AdManager {
	
	private static AdManager activeAdManager = null;
	private List<Ad> activeAds;
	
	private AdManager() {
		activeAds = new ArrayList<Ad>();
	}

	public static AdManager getActiveAdManager() {
		if (activeAdManager == null) {
			activeAdManager = new AdManager();
		}
		return activeAdManager;
	}

	public List<Ad> getAds() {
		return activeAds;
	}
	
	public void addAd(Ad ad) {
		activeAds.add(ad);
	}
	
	public void deleteAd(Ad ad) {
		activeAds.remove(ad);
	}
	
	public List<Ad> getAdsForAUser(User user) {
		
		List<Ad> adsToSend = new ArrayList<Ad>();
		for (Tag tag : user.getAdTags()) {
			for (Ad ad : activeAds) {
				if (ad.getTags().contains(tag)) {
					user.addAd(ad);
				}
			}
		}
		return adsToSend;
	}
}
