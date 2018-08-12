package proxy;

public class ProxyAudio implements AudioIF{

	private TipoRealAudio meuAudio;
	private String nomeArquivo;
	
	public ProxyAudio(String nomeArquivo){
		this.nomeArquivo = nomeArquivo;
	}
	
	
	
	public void play() {
	
		if(meuAudio == null){
			System.out.println("Inst�ncia n�o existia....Criando inst�ncia de TipoRealAudio...");
			meuAudio = new TipoRealAudio(nomeArquivo);
			
		} else{
			System.out.println("Recuperando inst�ncia anteriormente criada de TipoRealAudio...");
		}
		
		meuAudio.play();
		
	}

	
	
}
