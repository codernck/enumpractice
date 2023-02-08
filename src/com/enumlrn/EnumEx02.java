package com.enumlrn;

public class EnumEx02 {

	public static void main(String[] args) {
		Level levle = Level.MEDIUM;
		Level[] values = Level.values();
		
		for (Level value : values) {
			System.out.println(value);
		}
		
		Level highLvl = Level.valueOf("HIGH");
		System.out.println(highLvl+"---"+highLvl.getLevel());
		System.out.println(highLvl+"---"+highLvl.normalize());
		
	}

}
