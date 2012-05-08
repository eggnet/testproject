package test;

import pak.*;

public class Child extends Base {
	
	public Child() {
		this.x = 0;
		this.y = 0;
	}
	
	public int multiply() {
		x = x*x;
		printBase();
		return x*y;
	}

}
