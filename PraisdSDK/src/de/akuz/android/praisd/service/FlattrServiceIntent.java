package de.akuz.android.praisd.service;

import android.content.Intent;

public class FlattrServiceIntent extends Intent {

	public final static String ACTION_BIND_FLATTR_SERVICE = "de.akuz.android.praisd.service.FlattrService.BIND";

	public FlattrServiceIntent() {
		super(ACTION_BIND_FLATTR_SERVICE);
	}

}
