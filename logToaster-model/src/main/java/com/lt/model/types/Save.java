package com.lt.model.types;

import java.util.ArrayList;
import java.util.List;

import com.lt.model.types.connection.AbsConnection;
import com.lt.model.types.preference.UserPreferences;

/**
 * 
 * @author jThulliez
 *
 *	Representing the data saved for an user
 *
 */
public class Save {
	private List<AbsConnection> connectionList; // Represent each connection to the BDD
	private UserPreferences userPreferences; // All the preferences set by the user 
	
	
	public Save() {
		connectionList = new ArrayList<AbsConnection>();
		userPreferences = new UserPreferences();
	}
	
	public List<AbsConnection> getConnectionList() {
		return connectionList;
	}

	public void setConnectionList(List<AbsConnection> connectionList) {
		this.connectionList = connectionList;
	}

	public UserPreferences getUserPreferences() {
		return userPreferences;
	}

	public void setUserPreferences(UserPreferences userPreferences) {
		this.userPreferences = userPreferences;
	}
	
	
	
}
