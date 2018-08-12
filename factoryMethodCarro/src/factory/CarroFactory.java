package factory;

public class CarroFactory {

	public CarroIF geraCarro(String carro) {

		if (carro == "" || carro == null) {
			return null;
		}

		if (carro.toLowerCase().equals("kadett")) {
			return new Kadett();
		} else if (carro.toLowerCase().equals("etios")) {
			return new Etios();
		} else if (carro.toLowerCase().equals("siena")) {
			return new Siena();
		} else if (carro.toLowerCase().equals("monza")) {
			return new Monza();
		}

		return null;
	}

}
