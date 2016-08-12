class Car {
	
	int year = 2000;
	private String model;
	int speed;
	int gear;
	
	public Car () {
		
		//this line calls the constructor defined with arguments, it should be the first line in the constructor without arguments 
		this(10,10); 
		
		gear = 2;
		speed = 0;
	  
		System.out.println("Executing constructor without arguments...");
	}
	
	public Car (int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
		  
		System.out.println("Executing constructor with arguments...");
	}
	
	int getYear() {
		return year;
	}
	
	void setModel(String model) {
		this.model = model;
	}
	
	String getModel() {
		return model;
	}
	
}

public class ClassDemo {

	//Variables can be declare at this level
	String str2 = "Hello There !!!";
	
	//Actions can not be execute in this level, example: printing
	
	public static void main(String[] args) {
		String str1 = "Hello Java";
		
		System.out.println(str1);
		
		//If I want to print str2 inside this method I will have to declare as static
		
		//Managing arguments from the command line
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		System.out.println("*********************************************************");

		Car c1 = new Car();
		//Car c1 = new Car(1,0);
		
		c1.year = 2015;
		//c1.model = "BMW";
		
		String m = "BMW";
		c1.setModel(m);
		
		int carYear = c1.getYear();
		String carModel = c1.getModel();
		
		System.out.println("The model of car is: " + carModel + ", and the year is: " + carYear);
		
	}

}
