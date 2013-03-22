package de.akuz.android.praisd.service;

import de.akuz.android.praisd.service.FlattrUserData;

interface IFlattrService {
	void flattrThing(String thingId);
	
	void flattrThingWithAccount(String accountName, String thingId);
	
	void subscribeToThing(String thingId);
	
	void subscribeToThingWithAccount(String accountname, String thingId);
	
	boolean hasUserSubscribedToThing(String thingId);
	
	boolean hasUserSubscribedToThingWithAccount(String accountname, String thingId);
	
	String[] getAvailableFlattrAccounts();
	
	FlattrUserData getUserDataForAccount(String accountname);
}