package com.enumlrn;


/**
 * 
 * @author kiran
 *
 */

// enums cannot extend class as enum implicitly extends java.lang.enum
public enum Level {
	HIGH(1) {

		@Override
		public String normalize() {
			return HIGH.toString().toLowerCase();
		} },
	MEDIUM(2) {

		@Override
		public String normalize() {
			return MEDIUM.toString().toLowerCase();
		}
			
		},
	LOW(3) {

		@Override
		public String normalize() {
			return LOW.toString().toLowerCase();
		}
			
		};
	
	private int intVal;

	private Level(int intVal) {
		this.intVal = intVal;
	}
	
	public int getLevel() {
		return this.intVal;
	}
	
	public abstract String normalize();

}
