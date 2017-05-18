package com.lt.model.referential;

/**
 * 
 * @author jThulliez
 * list all the connexion type 
 *
 */
public enum ConnectionType {
	Direct("Direct connection (On this machine)"), // Connect on a file on the PC where the app is launched
	Ssh("Distant connection (Via ssh)") // Connect throught a ssh connection 
	;  
	
	private String typeText;
	
	private ConnectionType(String tT) {
		typeText = tT;
	}

	public String getTypeText() {
		return typeText;
	}

	public void setTypeText(String typeText) {
		this.typeText = typeText;
	}
}
