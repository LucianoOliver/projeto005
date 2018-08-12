package principal;

import factory.CarroFactory;
import factory.CarroIF;

public class DemoFactoryMethod {

	public static void main(String[] args){
		
		CarroFactory tipoCarro = new CarroFactory();
		
		CarroIF meuCarro = tipoCarro.geraCarro("monza");
		meuCarro.criarCarro();
		
		
		meuCarro = tipoCarro.geraCarro("etios");
		meuCarro.criarCarro();
		
		meuCarro = tipoCarro.geraCarro("kadett");
		meuCarro.criarCarro();
		
		meuCarro = tipoCarro.geraCarro("siena");
		meuCarro.criarCarro();
		
		
	}
}
