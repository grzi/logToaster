package com.lt.model.types.preference;

import com.lt.model.referential.LanguageEnum;

/**
 * 
 * @author jThulliez
 *
 * List of all the preferences of the user into the app
 */
public class UserPreferences {
	private LanguageEnum language;
	
	// Default constructor (should be called when no userPref are found)
	public UserPreferences() {
		language = LanguageEnum.FR;
	}

	public LanguageEnum getLanguage() {
		return language;
	}

	public void setLanguage(LanguageEnum language) {
		this.language = language;
	}
}
