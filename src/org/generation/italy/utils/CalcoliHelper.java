package org.generation.italy.utils;

public class CalcoliHelper {

	private CalcoliHelper() {

	}

	public static int sommaInt(int a, int b) {
		return a + b;
	}

	public static double sommaDouble(double a, double b) {
		return a + b;
	}

	public static int diffInt(int a, int b) {
		return a - b;
	}

	public static double diffDouble(double a, double b) {
		return a - b;
	}

	public static int moltInt(int a, int b) {
		return a * b;
	}

	public static double moltDouble (double a, double b) {
		return a * b;
	}
	
	public static int valoreAssInt (int a, int b) {
		if (a == b) {
			return a;
		} else {
			return 0;
		}
	}
	
	public static double valoreAssDouble (double a, double b) {
		if (a == b) {
			return a;
		} else {
			return 0;
		}
	}
	
	public static int minimoInt (int a, int b) {
		if (a < b) {
			return a;
		} else if (a > b) {
			return b;	
		} else {
			return 0;
		}	
	}
	
	public static double minimoDouble (double a, double b) {
		if (a < b) {
			return a;
		} else if (a > b) {
			return b;	
		} else {
			return 0;
		}	
	}
	
	public static int massimoInt (int a, int b) {
		if (a > b) {
			return a;
		} else if (a < b) {
			return b;	
		} else {
			return 0;
		}	
	}
	
	public static double massimoDouble (double a, double b) {
		if (a > b) {
			return a;
		} else if (a < b) {
			return b;	
		} else {
			return 0;
		}	
	}
	
}
