
public class ConstructorDemo {

	public static void main(String[] args) {
		
		Car2 c1 = new Car2();
		
		c1.setModel("BMW");
		System.out.println(c1.getModel());
		
		System.out.println(c1.speed);
		System.out.println(c1.gear);
		
		System.out.println("**************************");
		
		Car2 c2 = new Car2(10, 1);
		System.out.println(c2.speed);
		System.out.println(c2.gear);

	}

}
