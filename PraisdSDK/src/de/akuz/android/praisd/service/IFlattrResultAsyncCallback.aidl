package de.akuz.android.praisd.service;

interface IFlattrResultAsyncCallback {
	void success(boolean result);
	void error(int errorCode, String message);
}