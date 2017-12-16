package org.mypersist.exception;

public class QueryExcecutionFailedException extends RuntimeException {

	private static final long serialVersionUID = -6365224085382932531L;

	public QueryExcecutionFailedException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
