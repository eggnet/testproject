package pak;

public class Base {
	
	public int x;
	public int y;
	
	public Base() {
		
	}
	
	public Base(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int multiply() {
		return x*y;
	}
	
	public void printBase() {
		System.out.println("This is the base class.");
	}
	
	public void bar(Base base) {
		
	}

}
