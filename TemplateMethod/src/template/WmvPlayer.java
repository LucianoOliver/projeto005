package template;

public class WmvPlayer extends Player{

	@Override
	public void play() {
		System.out.println("Executando um v�deo WMV...");
		
	}

	@Override
	public void stop() {
		System.out.println("Parando um v�deo WMV...");
		
	}

	@Override
	public void avancar() {
		System.out.println("Avan�ando um v�deo WMV...");
		
	}

}
