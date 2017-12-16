package org.mypersist.exception;

public class ConnectionCreationFailedException extends RuntimeException {

	private static final long serialVersionUID = -2462596577251705187L;

	public ConnectionCreationFailedException(String message, Throwable cause) {
		super(message, cause);
	}

}
