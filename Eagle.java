public class Eagle extends Bird implements Fly {
// Not forget to implements the interface 
	
    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    // the @override keyword is used for a method that implements an interface
    // Just inspired by Penguin.java
    
    @Override
    public String sing() {
        return "Kaiooooooookeen!";
    }

	@Override
	public void takeOff() {
		if(!this.flying && this.altitude == 0) {
			this.flying = true;
			 System.out.printf("%s takes off in the sky.%n", this.getName());
		}
	}

	@Override
	public int ascend(int meters) {
		if(this.flying) {
			this.altitude = Math.min(this.altitude + meters, 325);
	        System.out.printf("%s flies upward, altitude : %d%n", this.getName(), this.altitude);
		}
		return this.altitude;
	}

	@Override
	public int descend(int meters) {
		if(this.flying) {
			this.altitude = Math.max(this.altitude - meters, 0);
			System.out.printf("%s flies downward, altitude : %d%n", this.getName(), this.altitude);
		}
		return this.altitude;
	}

	@Override
	public void land() {
		if(this.flying && this.altitude == 0) {
			System.out.printf("%s lands of the ground.%n" , this.getName());
		} else {
			System.out.printf("%s is too high, i can't land.%n" ,this.getName());
		}	
	}
}
