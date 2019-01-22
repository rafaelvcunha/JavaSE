package testeEnum;

public enum marcasEnum {
		AMAZON("Amazon"), 
		DELL("Dell"),
		HP("Hp"),
		TOSHIBA("Toshiba"),
		LG("Lg"),
		SAMSUNG("Samsung");
	
		private String nome;
		
		private marcasEnum(String nome) {
			this.nome = nome;
		}
		
		public String getNome() {
			return nome;
		}
	
}
