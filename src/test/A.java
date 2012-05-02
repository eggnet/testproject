package test;

public class A {
	
	public int x;
	public int y;
	public float z;

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
		return z;
	}

}
