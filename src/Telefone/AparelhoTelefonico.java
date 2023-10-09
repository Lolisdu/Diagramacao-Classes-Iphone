package Telefone;

public class AparelhoTelefonico implements Telefone {
	
	
	@Override
	public void iniciarCorreioVoz() {
		 System.out.println("Iniciar correio de Voz");

		}
	@Override
	public void ligar() {
		System.out.println("Ligando");
		
	}
	@Override
	public void atender() {
		System.out.println("Atendendo");
		
	}
}
