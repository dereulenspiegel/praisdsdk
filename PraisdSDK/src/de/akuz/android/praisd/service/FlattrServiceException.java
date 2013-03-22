package de.akuz.android.praisd.service;

import android.os.RemoteException;

public class FlattrServiceException extends RemoteException {

	String message;

	/**
	 * 
	 */
	private static final long serialVersionUID = 8825514199448246489L;

	public FlattrServiceException(String message) {
		super();
		this.message = message;
	}

	public FlattrServiceException(String message, Throwable cause) {
		this(message);
		setStackTrace(cause.getStackTrace());
	}

	public String getMessage() {
		return message;
	}

}
