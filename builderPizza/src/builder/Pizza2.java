package builder;

public class Pizza2 {
	
	private int tamanho;
	private boolean queijo;
	private boolean tomate;
	private boolean bacon;

	Pizza2(int tamanho) {
		this.tamanho = tamanho;
	}

	Pizza2(int tamanho, boolean queijo) { 
		this(tamanho);
		this.queijo = queijo;
	}

	Pizza2(int tamanho, boolean queijo, boolean tomate) {
		this(tamanho, queijo);
		this.tomate = tomate;
		
	}

	public Pizza2(int tamanho, boolean queijo, boolean tomate, boolean bacon) {
		this(tamanho, queijo, tomate);
		this.bacon = bacon;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public boolean isQueijo() {
		return queijo;
	}

	public void setQueijo(boolean queijo) {
		this.queijo = queijo;
	}

	public boolean isTomate() {
		return tomate;
	}

	public void setTomate(boolean tomate) {
		this.tomate = tomate;
	}

	public boolean isBacon() {
		return bacon;
	}

	public void setBacon(boolean bacon) {
		this.bacon = bacon;
	}

	@Override
	public String toString() {
		return "Pizza2 [tamanho=" + tamanho + ", queijo=" + queijo + ", tomate=" + tomate + ", bacon=" + bacon + "]";
	}
	
	
	

}
