package testeEnum;

public class testaEnum {
	
	public static void escolheOpcao( OpcoesMenu opcao) {
		if(opcao == OpcoesMenu.SALVAR) {
			System.out.println("Salvando o arquivo!");
		} else if(opcao == OpcoesMenu.ABRIR) {
			System.out.println("Abrir o arquivo!");
		}
	}
	
	public static marcasEnum hp = marcasEnum.HP;
	public static marcasEnum dell = marcasEnum.DELL;

	public static void main(String[] args) {
		
		escolheOpcao(OpcoesMenu.ABRIR);
		
		System.out.println("Nome da marca: " + hp.name());
		System.out.println("Nome da marca: " + dell.toString());
		System.out.println("valor ordinario: " + dell.ordinal());
		System.out.println("valor do Enum: " + dell.getNome());
		System.out.println("Retorno do Enum correspondente: " +dell.valueOf("DELL"));
	}
	
}
