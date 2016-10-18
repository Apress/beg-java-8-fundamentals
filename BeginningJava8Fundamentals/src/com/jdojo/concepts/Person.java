package com.jdojo.concepts;

public class Person {
	private String name;
	private String gender;

	public Person(String initialName, String initialGender) {
		name = initialName;
		gender = initialGender;
	}

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	public String getGender() {
		return gender;
	}
}

/* Another version of the Person class (LIsting 1-4.
package com.jdojo.concepts;

public class Person {	
	private String[] data = new String[2];

	public Person(String initialName, String initialGender) {
		data[0] = initialName;
		data[1] = initialGender;
	}

	public String getName() {
		return data[0];
	}

	public void setName(String newName) {
		data[0] = newName;
	}

	public String getGender() {
		return data[1];
	}	
}

*/