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
	
	
	public Save() {
		connectionList = new ArrayList<AbsConnection>();
		
	}
	
	public List<AbsConnection> getConnectionList() {
		return connectionList;
	}

	public void setConnectionList(List<AbsConnection> connectionList) {
		this.connectionList = connectionList;
	}
}
