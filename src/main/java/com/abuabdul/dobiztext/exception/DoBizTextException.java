package com.abuabdul.dobiztext.exception;

/**
 * @author abuabdul
 *
 */
public class DoBizTextException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5678L;

	public DoBizTextException() {
	}

	public DoBizTextException(String message, Throwable cause) {
		super(message, cause);
	}

	public DoBizTextException(String message) {
		super(message);
	}

	public DoBizTextException(Throwable cause) {
		super(cause);
	}
}
