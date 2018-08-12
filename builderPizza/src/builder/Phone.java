package builder;

public class Phone {
	private String os;
	private int ram;
	private String Processador;
	private double screenSize;
	private int battery;
	
	
	public Phone(String os, int ram, String processador, double screenSize, int battery) {
		super();
		this.os = os;
		this.ram = ram;
		Processador = processador;
		this.screenSize = screenSize;
		this.battery = battery;
	}


	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", Processador=" + Processador + ", screenSize=" + screenSize
				+ ", battery=" + battery + "]";
	}
	
	
	
	

}
