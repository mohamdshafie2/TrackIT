package de.fivecoffee.trackit.model.common.assertion;

public class Assert {
	public static void assertNotNull(String name, Object argument) {
		if(argument == null) {
			throw new IllegalArgumentException("'" + name + "' must not be null!");
		}
	}
}
