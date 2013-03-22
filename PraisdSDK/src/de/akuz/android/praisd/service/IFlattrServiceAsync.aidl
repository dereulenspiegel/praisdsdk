package de.akuz.android.praisd.service;

import de.akuz.android.praisd.service.FlattrUserData;
import de.akuz.android.praisd.service.IFlattrResultAsyncCallback;

interface IFlattrServiceAsync {

	void flattrThing(String thingId, IFlattrResultAsyncCallback callback);
	
	void flattrThingWithAccount(String accountName, String thingId, IFlattrResultAsyncCallback callback);
	
	void subscribeToThing(String thingId, IFlattrResultAsyncCallback callback);
	
	void subscribeToThingWithAccount(String accountname, String thingId, IFlattrResultAsyncCallback callback);
	
	boolean hasUserSubscribedToThing(String thingId, IFlattrResultAsyncCallback callback);
	
	boolean hasUserSubscribedToThingWithAccount(String accountname, String thingId, IFlattrResultAsyncCallback callback);
	
	String[] getAvailableFlattrAccounts();
	
	FlattrUserData getUserDataForAccount(String accountname);

}