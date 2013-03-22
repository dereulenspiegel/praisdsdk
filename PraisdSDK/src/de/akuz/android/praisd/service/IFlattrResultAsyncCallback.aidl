package de.akuz.android.praisd.service;

import de.akuz.android.praisd.sdk.FlattrUserData;

interface IFlattrResultAsyncCallback {
	void success();
	void error(int errorCode);
}