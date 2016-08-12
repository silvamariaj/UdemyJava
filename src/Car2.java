public class Car2 {

	private String model;
	int gear;
	int speed;
	
	//Default No Arguments Constructor
	public Car2() {
		this.speed = 0;
		this.gear = 0;
		
		System.out.println("Executing constructor without arguments...");
	}

	//Arguments Constructor
	public Car2(int speed, int gear) {
		this.speed = speed;
		this.gear = gear;
		
		System.out.println("Executing constructor with arguments...");
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return this.model;
	}
	
}
