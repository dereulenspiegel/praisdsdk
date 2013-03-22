package de.akuz.android.praisd.service;

import de.akuz.android.praisd.sdk.FlattrUserData;

interface IFlattrUserDataCallback {
	void success(inout FlattrUserData data);
	void error(int errorCode, String message);
}