package test;

import pak.*;

public class A {
	
	// THIS IS A COMMENT

	public int x;
	public int y;
	public float z;
	
	public C c = new C('s', 'p');

	public A() {
		
	}
	
	public A(int x, int y, float z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public int getXTimes2() {
		int temp = x * 2;
		return temp;
	}
	
	public float getZ() {
		/* Added a comment to getZ in class A */
		return z;
	}

	public B getB() {
		B b = new B();
		return b;
	}
	
	public static B getStaticB() {
		return new B();
	}

}
