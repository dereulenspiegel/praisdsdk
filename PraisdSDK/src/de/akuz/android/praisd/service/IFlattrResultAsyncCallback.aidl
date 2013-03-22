package de.akuz.android.praisd.service;

import de.akuz.android.praisd.service.FlattrUserData;

interface IFlattrResultAsyncCallback {
	void success();
	void error(int errorCode);
}