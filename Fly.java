// Create an interface
public interface Fly {
	
	// inspect the Swim.java and inspiration will come 
	void takeOff();
	
	int ascend(int meters);
	
	int descend(int meters);
	
	void land();
	
	default void glide() {
		System.out.println("It glides into the air.");
	}
	
}
