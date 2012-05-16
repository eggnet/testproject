package pak;

import models.*;
import test.*;

public class B implements Face {
	
	public int xx;
	public float yy;
	public Date date;
	
	public B() {
		Generic<A> generic = new Generic();
		Generic<B> b = new Generic<B>();
		
		generic.foobar(b);
	}
	
	public B(int xx, float yy) {
		this.xx = xx;
		this.yy = yy;
	}
	
	public int getXX() {
		return xx;
	}
	
	public void setXX(int xx) {
		int temp = xx;
		temp = temp * temp;
		temp = temp - 10;
		this.xx = temp;
	}
	
	public A getA() {
		A a = new A();
		return a;
	}
	
	public int test(float x) {
		return 0;
	}
	
	public int test(double x) {
		return 0;
	}
	
	public void Draw() {
		System.out.println("Drawing in B.");
	}
}
