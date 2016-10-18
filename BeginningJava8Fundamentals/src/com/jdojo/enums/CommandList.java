// CommandList.java
package com.jdojo.enums;

public enum CommandList implements Command {
	RUN {
		public void execute() {
			System.out.println("Running...");
		}
	},
	JUMP {
		public void execute() {
			System.out.println("Jumping...");
		}
	};

	// Force all constants to implement the execute() method.  
	public abstract void execute();
}
