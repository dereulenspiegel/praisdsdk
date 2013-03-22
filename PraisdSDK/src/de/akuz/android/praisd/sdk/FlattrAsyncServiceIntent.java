package de.akuz.android.praisd.sdk;

import android.content.Intent;

public class FlattrAsyncServiceIntent extends Intent {

	public final static String ACTION_BIND_FLATTR_SERVICE = "de.akuz.android.praisd.service.FlattrAsyncService.BIND";

	public FlattrAsyncServiceIntent() {
		super(ACTION_BIND_FLATTR_SERVICE);
	}

}
