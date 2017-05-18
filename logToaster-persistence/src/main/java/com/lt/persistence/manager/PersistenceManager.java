package com.lt.persistence.manager;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

import com.lt.model.types.Save;
import com.lt.persistence.exception.PersistenceException;
import com.lt.persistence.util.PersistenceInformations;

/**
 * 
 * @author jThulliez
 *
 * The persistenceManager is in charge of all the physical saved data
 * 
 */
public class PersistenceManager {
	private static final String 
			persistence_directory_name = "Logtoaster",
			persistence_save_name = "userSettings.logtoaster"
			;
	private String persistence_directory;
	
	public PersistenceManager() {
		String osName = PersistenceInformations.getInstance().getOsname(); 
			this.persistence_directory = osName != null && osName.startsWith("Windows") ? System.getenv("APPDATA") 
						: System.getProperty("user.home"); 
	}
	
	/*
	 * this method will save the object LogTasterData into a json File
	 */
	public void writeSave(Save s) throws PersistenceException {
		initFolder();
		File savedFile = new File(persistence_directory + File.separator + persistence_directory_name + File.separator
				+ persistence_save_name);
		if (savedFile.exists()) {
			savedFile.delete();
		}

		// create or re-create the save file
		try {
			savedFile.createNewFile();
		} catch (IOException e) {
			throw new PersistenceException("Error while creating save File");
		}

		ObjectMapper mapper = new ObjectMapper();

		try {
			mapper.writeValue(savedFile, s);
		} catch (IOException e) {
			throw new PersistenceException("Error while mapping/saving File");
		}
	}
	
	/**
	 * Get the save file in the persistence directory
	 * 
	 * @return the File corresponding to the save
	 * @throws PersistenceException
	 */
	public Save readSave() throws PersistenceException {
		initFolder();
		File savedFile = new File(persistence_directory 
				+ File.separator + persistence_directory_name 
				+ File.separator
				+ persistence_save_name);
		
		Save s = new Save();
		if (savedFile.exists()) {
			ObjectMapper mapper = new ObjectMapper();
			try {
				s = mapper.readValue(savedFile, Save.class);
			} catch (IOException e) {
				
			}
		}
		return s;		
	}

	
	/**
	 * This method is going to see if the persistence folder exist. If it
	 * doesn't, this method will create it.
	 */
	private void initFolder() {
		if (!this.checkPersistenceFolder()) {
			boolean createDirectory = new File(persistence_directory + File.separator + persistence_directory_name)
					.mkdir();
			if (!createDirectory) {
			}
		}
	}
	
	/**
	 * Check if the persistence folder exist
	 * 
	 * @return
	 */
	private boolean checkPersistenceFolder() {
		File persistenceFolder = new File(persistence_directory + File.separator + persistence_directory_name);
		if (persistenceFolder.exists() && persistenceFolder.isDirectory()) {
			return true;
		}
		return false;
	}
}
