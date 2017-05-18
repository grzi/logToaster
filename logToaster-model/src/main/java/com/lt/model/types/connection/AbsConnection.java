package com.lt.model.types.connection;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;

/**
 *	 
 * @author jThulliez
 *
 * Represent the connection to the log with all his datas
 * 
 */
@JsonTypeInfo( 
 use = JsonTypeInfo.Id.NAME, 
 property = "type") 
 @JsonSubTypes({ 
 @JsonSubTypes.Type(value = DirectConnection.class, name = "DirectConnection") 
}) 

public abstract class AbsConnection{
	
	protected String id,connectionName;
	protected boolean active;
	protected boolean isDirectory;
	
	public AbsConnection(String ident, String cN, boolean act, boolean isDir) {
		connectionName = cN;
		active = act;
		id = ident;
		isDirectory = isDir;
	}
	
	/**
	 * Connect to the current connection
	 * 
	 * @return status of the connection
	 */
	public abstract boolean connect();
	
	public String getConnectionName() {
		return connectionName;
	}

	public void setConnectionName(String connectionName) {
		this.connectionName = connectionName;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
