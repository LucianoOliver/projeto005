package factory;

public class FlorFactory {

	public FlorIF gerarFlor(String flor) {

		if (flor == "" || flor == null) {
			return null;
		}

		if (flor.toUpperCase().equals("ROSA")) {
			return new Rosa();
		} else if (flor.toUpperCase().equals("MARGARIDA")) {
			return new Margarida();
		} else if (flor.toUpperCase().equals("ORQUIDEA")) {
			return new Orquidea();
		} else if (flor.toUpperCase().equals("MANACA")) {
			return new Manaca();
		}

		return null;
	}

}
