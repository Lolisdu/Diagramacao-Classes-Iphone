package Navegacao;

public abstract class SafariExplore implements NavegadorInternet {
	
	
	public void exibirAba() {
		System.out.println("Pagina nova");
	}
	
	public void atualizarAba() {
		System.out.println("Atualizando Pagina");
	}
		
	public void adiciorAba() {
		System.out.println("Adicionar nova  Pagina");
	}
}
