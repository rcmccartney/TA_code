public class TenSpeedBike implements Bicycle {
	
	private int currentGear;
	private int speed;

	public TenSpeedBike() {
		currentGear = 2;
		speed = 0;	
	}

	public boolean changeGear(int gear) {
		currentGear = gear;
		return true;
	}

	public boolean speedUp(int accel) {
		speed += accel;
		return true;
	}
	
	public boolean slowDown(int decel) {
		speed -= decel;
		return true;
	}
	
	public static void main(String[] args) {
		Bicycle b = new TenSpeedBike();
		b.changeGear(4);
	}
}





