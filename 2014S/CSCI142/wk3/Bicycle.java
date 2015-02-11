public interface Bicycle {

	public void changeGear(int gear);

}

public class TenSpeedBike implements Bicycle {
	
	private int currentGear;

	public TenSpeedBike() {
		currentGear = 2;
	}

	public void changeGear(int gear) {
		currentGear = gear;
	}

	public static void main(String[] args) {
		
		Bicycle b = new TenSpeedBike();
		b.changeGear(4);
	}
}





