package com.lt.model.referential;

/**
 * 
 * @author jThulliez
 *
 * List of all the languages handled by the app
 */
public enum LanguageEnum {
	FR("Français"),
	EN("English")
	;
	private String label;
	
	private LanguageEnum(String l) {
		label= l;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	
}
