package com.enumlrn;

import java.util.EnumMap;
import java.util.EnumSet;

public class EnumEx03 {

	public static void main(String[] args) {
		EnumSet enumSet = EnumSet.of(Level.HIGH, Level.LOW);
		System.out.println(enumSet);
		
		EnumMap<Level, String> enumMap = new EnumMap<>(Level.class);
		enumMap.put(Level.HIGH, "High Value");
		enumMap.put(Level.LOW, "Low Value");
	}

}
