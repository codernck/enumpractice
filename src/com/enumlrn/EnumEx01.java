package com.enumlrn;

public class EnumEx01 {

	public static void main(String[] args) {
		Level level = Level.HIGH;
		
		enumIfEval(level);
		
		switch(level) {
			case HIGH: { System.out.println(Level.HIGH.toString()); break; }
			case MEDIUM: { System.out.println("MEDIUM"); break; }
			case LOW: { System.out.println("LOW"); break; }
		}
		
	}

	private static void enumIfEval(Level level) {
		if (level == Level.HIGH) {
			System.out.println("Level "+Level.HIGH);
		} else if (level == Level.MEDIUM) {
			System.out.println("Level "+Level.MEDIUM);
		} else {
			System.out.println("Level "+Level.LOW);
		}
	}

}
