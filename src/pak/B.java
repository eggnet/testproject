package pak;

import models.*;
import test.*;

public class B implements Face {
	
	public int xx;
	public float yy;
	public Date date;
	
	public B() {
		this.date = new Date();
		date.getTime(getXX());
		date.getTime(0);
		date.getTime(xx);
		A a = new A();
		a.c.getA();
		int x = a.getB().getA().getXTimes2();
		getA().getB().Draw();
		System.out.println("X: " + x);
		float abc = (float)test((double)0);
		
		
		/// Tests for inheriance
		Base base = new Base();
		Child child = new Child();
		Child child2 = new Child();
		
		child.foo(null, child2, 2, child2);
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
