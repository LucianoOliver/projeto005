package template;

public class Mp3Player extends Player{

	@Override
	public void play() {
		System.out.println("Executando uma m�sica MP3...");
		
	}

	@Override
	public void stop() {
		System.out.println("Parando m�sica MP3...");
		
	}

	@Override
	public void avancar() {
		System.out.println("Avan�ando m�sica MP3...");
		
	}

	
}
