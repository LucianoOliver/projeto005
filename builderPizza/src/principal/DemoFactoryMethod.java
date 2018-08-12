package principal;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

import builder.Pizza;
import builder.Pizza2;


public class DemoFactoryMethod {
	//private static final Logger LOGGER = LoggerFactory.getLogger(Aplicacao.class);

	public static void main(String[] args){
		
		Pizza2 pizza2 = new Pizza2(1, true, true, true);
		System.out.println(pizza2.toString());
		
		
		Pizza pizza = new Pizza.Builder(10)
				.queijo()
				.tomate()
				.bacon()
				.nome()
				.build();
				
		
		
		System.out.println(pizza.toString());
		
		
		
		
	}
}
