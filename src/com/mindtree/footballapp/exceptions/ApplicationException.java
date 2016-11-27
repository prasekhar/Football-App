/**
 * 
 */
package com.mindtree.footballapp.exceptions;

/**
 * @author Banu Prakash 
 * 
 * Base exception class
 *
 */
public class ApplicationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9050818478550181989L;

	/**
	 * 
	 */
	public ApplicationException() {
		super();
	}


	/**
	 * @param arg0
	 * @param arg1
	 */
	public ApplicationException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	/**
	 * @param arg0
	 */
	public ApplicationException(String arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 */
	public ApplicationException(Throwable arg0) {
		super(arg0);
	}
	
}
