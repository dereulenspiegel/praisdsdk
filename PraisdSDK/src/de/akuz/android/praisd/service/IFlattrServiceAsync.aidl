package de.akuz.android.praisd.service;

import de.akuz.android.praisd.sdk.FlattrUserData;
import de.akuz.android.praisd.service.IFlattrResultAsyncCallback;
import de.akuz.android.praisd.service.IFlattrUserDataCallback;
import de.akuz.android.praisd.service.IFlattrGetAccountsCallback;

interface IFlattrServiceAsync {

	void flattrThing(String thingId, IFlattrResultAsyncCallback callback);
	
	void flattrThingWithAccount(String accountName, String thingId, IFlattrResultAsyncCallback callback);
	
	void subscribeToThing(String thingId, IFlattrResultAsyncCallback callback);
	
	void subscribeToThingWithAccount(String accountname, String thingId, IFlattrResultAsyncCallback callback);
	
	void hasUserSubscribedToThing(String thingId, IFlattrResultAsyncCallback callback);
	
	void hasUserSubscribedToThingWithAccount(String accountname, String thingId, IFlattrResultAsyncCallback callback);
	
	void getAvailableFlattrAccounts(IFlattrGetAccountsCallback callback);
	
	void getUserDataForAccount(String accountname, IFlattrUserDataCallback callback);

}