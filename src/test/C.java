package test;

import pak.Generic;

public class C extends Generic<String> {
	
	char a;
	char b;
	
	public C() {
	    // Here is me changing some stuff
	    String test = "epic";
            String t2 = test + "lolz";	
	}
	
	public C(char a) {
		this.a = a;
	}
	
	public C(char a, char b) {
		this.a = a;
		this.b = b;
	}
	
	public char getA() {
		a = b;
		return a;
	}

}
