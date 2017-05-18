package com.lt.persistence.util;

/**
 * 
 * @author jThulliez
 *
 *  General informations is a singleton that contains all the information
 *  that we need in the application like os name, system parameter...
 * 
 */
public class PersistenceInformations {
	/*
	 * SINGLETON HANDLING HERE
	 */
	private static volatile PersistenceInformations instance;

	public PersistenceInformations() {
		if (instance != null) {
			throw new IllegalStateException("GeneralInformations already initialized ");
		}
	}

	public static PersistenceInformations getInstance() {
		PersistenceInformations result = instance;
		if (result == null) {
			synchronized (PersistenceInformations.class) {
				result = instance;
				if (result == null) {
					instance = result = new PersistenceInformations();
				}
			}
		}
		return result;
	}

	/*
	 * MAIN CONTENT OF THE CLASS
	 */

	// Name of the os
	private static final String osName = System.getProperty("os.name");

	public String getOsname() {
		return osName;
	}
}
