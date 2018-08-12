package builder;

public class Pizza {

	private int tamanho;
	private String nome;
	private boolean queijo;
	private boolean tomate;
	private boolean bacon;

	@Override
	public String toString() {
		return "Pizza [tamanho=" + tamanho + ", nome=" + nome + ", queijo=" + queijo + ", tomate=" + tomate + ", bacon="
				+ bacon + "]";
	}

	


	public static class Builder {

		// requerido
		private final int tamanho;
		private  String nome;
		
		// opcional
		private boolean queijo = false;
		private boolean tomate = false;
		private boolean bacon = false;

		public Builder(int tamanho) {
			this.tamanho = tamanho;
		}

		public Builder queijo() {
			queijo = true;
			return this;
		}

		public Builder tomate() {
			tomate = true;
			return this;
		}

		public Builder bacon() {
			bacon = true;
			return this;
		}
		public Builder nome() {
			nome = "Moda da Casa";
			return this;
		}

		public Pizza build() {
			return new Pizza(this);
		}

	}

	private Pizza(Builder builder) {
		tamanho = builder.tamanho;
		queijo = builder.queijo;
		tomate = builder.tomate;
		bacon = builder.bacon;
		nome = builder.nome;
	}

}