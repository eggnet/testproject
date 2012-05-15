package pak;

public class Generic<T>{
	
	private T item;
	
	public Generic() {
		
	}
	
	public void setItem(T t) {
		this.item = t;
	}
	
	public T getItem() {
		return item;
	}

}
