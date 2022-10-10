package com.marcinator.prettyprint.V2;

public enum CMDAttributes implements CMDAttribute {
	/**
	 * Resets all Attributes
	 */
	RESET("0"),
	/**
	 * Makes the console text bold
	 */
	BOLD("1"),
	/**
	 * Decreases intensity
	 */
	FAINT("2"),
	/**
	 * Makes the console italic
	 * 
	 * <dt><b>This feature is not widely supported</b></dt>
	 */
	ITALIC("3"),
	/**
	 * Underlines the console
	 */
	UNDERLINE("4"),
	/**
	 * Makes to console blink at 150 times per minute
	 */
	BLINK("5"),
	/**
	 * Makes to console stop blinking
	 */
	STOPBLINK("25");

	private final String code;

	private CMDAttributes(String code) {
		this.code = code;
	}

	@Override
	public String getAttribute() {
		return code;
	}

}