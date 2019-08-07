
public interface Calculator {

	public int squre(int num);
	
	default void defaultMethod(){
		System.out.println("Default method");
		
	}
	
	static void staticMetho(){
		System.out.println("Static method ");
		
	}
}
