package com.lt.model.types.connection;

public class DirectConnection extends AbsConnection {

	public DirectConnection(String ident, String cN, boolean act, boolean isDir) {
		super(ident, cN,act, isDir);
	}
	
	@Override
	public boolean connect() {
		// Todo : Connect to the file
		return false;
	}
}
