package org.mypersist.exception;

public class XMLParsingFailedException extends RuntimeException {

	private static final long serialVersionUID = -41040682675499232L;

	public XMLParsingFailedException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
