package pak;

public class B implements Face {
	
	public double xx;
	public float yy;
	
	public B() {
		
	}
	
	public B(double xx, float yy) {
		this.xx = xx;
		this.yy = yy;
	}
	
	public double getXX() {
		return xx;
	}
	
	public void setXX(double xx) {
		double temp = xx;
		temp = temp * temp;
		temp = temp - 10;
		this.xx = temp;
	}
	
	public void Draw() {
		System.out.println("Drawing in B.");
	}

}
