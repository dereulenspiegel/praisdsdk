package de.akuz.android.praisd.service;

interface IFlattrGetAccountsCallback {
	void success(out String[] availableAccounts);
	void error(int errorCode, String message);
}