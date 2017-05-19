package com.lt.ui.window;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WindowController {
	Logger Log = LoggerFactory.getLogger(this.getClass());
	public void printOutput(){
		Log.debug("Test");
	}
	public void newConnection(){
		Log.debug("Nouvelle");
	}
}
