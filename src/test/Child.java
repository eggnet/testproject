package test;

import pak.*;

public class Child extends Base implements Face {
	
	public Child() {
		this.x = 0;
		this.y = 0;
	}
	
	public int multiply() {
		x = x*x;
		printBase();
		return x*y;
	}
	
	public Child foo(Base base, Child child, int x, Base base2) {
		return new Child();
	}
	
	public void Draw() {
		System.out.println("Drawing in Child class");
	}

}
