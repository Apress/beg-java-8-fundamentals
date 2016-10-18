// CharitySinger.java
package com.jdojo.interfaces;

public interface CharitySinger extends Singer {	
	@Override
	default void setRate(double rate) {
		// A no-op
	}
	
	@Override
	default double getRate() {
		return 0.0;
	}
}
