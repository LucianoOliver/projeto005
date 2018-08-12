package principal;

import builder.Phone;
import builder.PhoneBuilder;

public class Shop {

	public static void main(String[] args) {
		
		Phone p = new Phone("a", 2, "QualComm", 5.5, 3100);
		System.out.println(p);
		
		Phone p2 = new PhoneBuilder()
				.setOs("Android")
				.setRam(4)
				.setProcessador("Xeon")
				.setScreenSize(10)
				.setBattery(3500)
				.getPhone();
				
		System.out.println(p2);
		

	}

}
