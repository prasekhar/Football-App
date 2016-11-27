/**
 * 
 */
package com.mindtree.footballapp.exceptions;

/**
 * @author BanuPrakash
 * Exception class for CRUD dao operations
 */
public class DaoException extends ApplicationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9191619433394036578L;

	/**
	 * 
	 */
	public DaoException() {
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public DaoException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	/**
	 * @param arg0
	 */
	public DaoException(String arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 */
	public DaoException(Throwable arg0) {
		super(arg0);
	}

}
