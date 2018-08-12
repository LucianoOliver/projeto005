package factory;

public class Monza implements CarroIF {

	@Override
	public void criarCarro() {
		System.out.println("Um Monza foi criada...");
	}

}
