
public class Variables {

	//Variable Global
	int myGlobalInt = 100;
	
	public static void main(String[] args) {
		
		/* Byte
		 * Min: -128
		 * Max: 127
		 * Default: 0
		 */
		byte myByte = 100;
		System.out.println("Byte Value: " + myByte);

		/* Short
		 * Min: -32768
		 * Max: 32767
		 * Default: 0
		 */
		short myShort = 10000;
		System.out.println("Short Value: " + myShort);
		
		/* int
		 * Min: -2147483648
		 * Max: 2147483647
		 * Default: 0
		 */
		int myInt = 10000000;
		System.out.println("Int Value: " + myInt);
		
		/* long
		 * Min: -2^63
		 * Max: 2^63 - 1
		 * Default: 0
		 */
		long myLong = 1000000000;
		System.out.println("Long Value: " + myLong);
		
		/* float
		 * Default: 0.0f
		 */
		float myFloat = 20.0f;
		System.out.println("Float Value: " + myFloat);
		
		/* float
		 * Default: 0.0f
		 */
		double myDouble = 21.0;
		System.out.println("Double Value: " + myDouble);
		
		/* boolean
		 * true and false
		 * Default: false
		 */
		boolean myBoolean = true;
		System.out.println("Boolean Value: " + myBoolean);
		
		/* char
		 * Min: 0
		 * Max: 65535
		 */
		char myChar = 'm';
		System.out.println("Char Value: " + myChar);
				
	}
	
	public void test() {
		myGlobalInt = 1000;
	}

}
